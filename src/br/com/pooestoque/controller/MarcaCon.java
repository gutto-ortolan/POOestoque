package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Marca;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class MarcaCon {
    private String mensagem;

    public MarcaCon() {
    }
    
    
    public boolean incluir(Marca obj){
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
    
    public boolean alterar(Marca obj){
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

    public boolean excluir(Marca obj){
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
    
    public Marca getMarca(Integer idMarca){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Marca encontrado = (Marca) sessao.load(Marca.class, idMarca);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Marca> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Marca.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Marca> getMarcaPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from Marca where dsMarca like '%"+par+"%' order by idMarca").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Marca> getMarcaPorID(Integer idMarca){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Marca where idMarca = "+idMarca+" order by idMarca").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Marca> getMarcaPorSituacao(String stMarca){
        String par = stMarca.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Marca where stMarca like '%"+par+"%' order by idMarca").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
