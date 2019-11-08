package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.UnidadeProduto;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class UnidadeProdutoCon {
    private String mensagem;

    public UnidadeProdutoCon() {
    }
    
    
    public boolean incluir(UnidadeProduto obj){
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
    
    public boolean alterar(UnidadeProduto obj){
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

    public boolean excluir(UnidadeProduto obj){
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
    
    public UnidadeProduto getUnidadeProduto(Integer idUnidade){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            UnidadeProduto encontrado = (UnidadeProduto) sessao.load(UnidadeProduto.class, idUnidade);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<UnidadeProduto> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(UnidadeProduto.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<UnidadeProduto> getUnidadeProdutoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from UnidadeProduto where dsUnidade like '%"+par+"%' order by idUnidade").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<UnidadeProduto> getUnidadeProdutoPorID(Integer idUnidadeProduto){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from UnidadeProduto where idUnidade = "+idUnidadeProduto+" order by idUnidade").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<UnidadeProduto> getUnidadeProdutoPorSituacao(String stUnidadeProduto){
        String par = stUnidadeProduto.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from UnidadeProduto where stUnidade like '%"+par+"%' order by idUnidade").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
