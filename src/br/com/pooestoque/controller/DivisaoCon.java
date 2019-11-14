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
public class DivisaoCon {
    private String mensagem;

    public DivisaoCon() {
    }
    
    
    public boolean incluir(Divisao obj){
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
    
    public boolean alterar(Divisao obj){
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

    public boolean excluir(Divisao obj){
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
