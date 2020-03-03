package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Marca;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class GenericCon {
    private String mensagem;
    
    public GenericCon(){
    }
    
    public boolean incluir(Object obj){
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
    
    public boolean alterar(Object obj){
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

    public boolean excluir(Object obj){
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
    
}
