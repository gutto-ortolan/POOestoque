package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Divisao;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class DivisaoCon extends GenericCon{
    private String mensagem;

    public DivisaoCon() {
    }
    
    public Divisao getDivisao(Integer idDivisao){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Divisao encontrado = (Divisao) sessao.load(Divisao.class, idDivisao);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Divisao> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Divisao.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Divisao> populaComDiv(Integer idSubGrupo){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from Divisao where subGrupo = "+idSubGrupo+" order by idDivisao").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Divisao> getDivisaoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from Divisao where dsDivisao like '%"+par+"%' order by idDivisao").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Divisao> getDivisaoPorID(Integer idDivisao){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Divisao where idDivisao = "+idDivisao+" order by idDivisao").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Divisao> getDivisaoPorSituacao(String stDivisao){
        String par = stDivisao.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Divisao where stDivisao like '%"+par+"%' order by idDivisao").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
