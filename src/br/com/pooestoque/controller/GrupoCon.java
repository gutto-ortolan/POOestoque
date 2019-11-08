package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Grupo;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class GrupoCon {
    private String mensagem;

    public GrupoCon() {
    }
    
    
    public boolean incluir(Grupo obj){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            sessao.save(obj);
            sessao.getTransaction().commit();
            mensagem = "Incluído com sucesso!";
            return true;
        }catch (Exception e){
            sessao.getTransaction().rollback();
            mensagem = TrataException.trataException(e);
            return false;
        }finally {
            sessao.close();
        }
    }
    
    public boolean alterar(Grupo obj){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            sessao.update(obj);
            sessao.getTransaction().commit();
            mensagem = "Alterado com sucesso";
            return true;
        }catch (Exception e){
            sessao.getTransaction().rollback();
            mensagem = TrataException.trataException(e);
            return false;
        }finally{
            sessao.close();
        }
    }

    public boolean excluir(Grupo obj){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            sessao.delete(obj);
            sessao.getTransaction().commit();
            mensagem = "Excluído com sucesso";
            return true;
        }catch (Exception e){
            sessao.getTransaction().rollback();
            mensagem = TrataException.trataException(e);
            return false;
        }finally{
            sessao.close();
        }
    }
    
    public Grupo getGrupo(Integer idGrupo){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Grupo encontrado = (Grupo) sessao.load(Grupo.class, idGrupo);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Grupo> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Grupo.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Grupo> getGrupoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from Grupo where dsGrupo like '%"+par+"%' order by idGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Grupo> getGrupoPorID(Integer idGrupo){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Grupo where idGrupo = "+idGrupo+" order by idGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Grupo> getGrupoPorSituacao(String stGrupo){
        String par = stGrupo.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Grupo where stGrupo like '%"+par+"%' order by idGrupo").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
