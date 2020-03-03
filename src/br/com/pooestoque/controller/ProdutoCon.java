package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Produto;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class ProdutoCon extends GenericCon{
    private String mensagem;

    public ProdutoCon() {
    }
    
    public Produto getProduto(Integer idProduto){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Produto encontrado = (Produto) sessao.load(Produto.class, idProduto);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Produto> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Produto.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Produto> getProdutoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from Produto where dsProduto like '%"+par+"%' order by idProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Produto> getProdutoPorID(Integer idProduto){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Produto where idProduto = "+idProduto+" order by idProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Produto> getProdutoPorSituacao(String stProduto){
        String par = stProduto.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Produto where stProduto like '%"+par+"%' order by idProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
