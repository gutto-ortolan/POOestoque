package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.SubGrupo;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class SubGrupoCon extends GenericCon{
    private String mensagem;

    public SubGrupoCon() {
    }
    
    public SubGrupo getSubGrupo(Integer idSubGrupo){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            SubGrupo encontrado = (SubGrupo) sessao.load(SubGrupo.class, idSubGrupo);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<SubGrupo> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(SubGrupo.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<SubGrupo> populaComSub(Integer idGrupo){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from SubGrupo where grupo = "+idGrupo+" order by idSubGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<SubGrupo> getSubGrupoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from SubGrupo where dsSubGrupo like '%"+par+"%' order by idSubGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<SubGrupo> getSubGrupoPorID(Integer idSubGrupo){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from SubGrupo where idSubGrupo = "+idSubGrupo+" order by idSubGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<SubGrupo> getSubGrupoPorSituacao(String stSubGrupo){
        String par = stSubGrupo.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from SubGrupo where stSubGrupo like '%"+par+"%' order by idSubGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
