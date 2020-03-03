package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.OrigemProduto;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class OrigemProdutoCon extends GenericCon{
    private String mensagem;

    public OrigemProdutoCon() {
    }
    
    public OrigemProduto getOrigemProduto(Integer idOrigem){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            OrigemProduto encontrado = (OrigemProduto) sessao.load(OrigemProduto.class, idOrigem);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<OrigemProduto> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(OrigemProduto.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<OrigemProduto> getOrigemProdutoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from OrigemProduto where dsOrigem like '%"+par+"%' order by idOrigem").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<OrigemProduto> getOrigemProdutoPorID(Integer idOrigemProduto){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from OrigemProduto where idOrigem = "+idOrigemProduto+" order by idOrigem").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<OrigemProduto> getOrigemProdutoPorSituacao(String stOrigemProduto){
        String par = stOrigemProduto.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from OrigemProduto where stOrigem like '%"+par+"%' order by idOrigem").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
