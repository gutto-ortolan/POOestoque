package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.TipoProduto;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class TipoProdutoCon extends GenericCon{
    private String mensagem;

    public TipoProdutoCon() {
    }
    
    public TipoProduto getTipoProduto(Integer idTipoProduto){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            TipoProduto encontrado = (TipoProduto) sessao.load(TipoProduto.class, idTipoProduto);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<TipoProduto> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(TipoProduto.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<TipoProduto> getTipoProdutoPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            return sessao.createQuery("from TipoProduto where dsTipoProduto like '%"+par+"%' order by idTipoProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<TipoProduto> getTipoProdutoPorID(Integer idTipoProduto){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from TipoProduto where idTipoProduto = "+idTipoProduto+" order by idTipoProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<TipoProduto> getTipoProdutoPorSituacao(String stTipoProduto){
        String par = stTipoProduto.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from TipoProduto where stTipoProduto like '%"+par+"%' order by idTipoProduto").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
