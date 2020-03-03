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
public class MarcaCon extends GenericCon{
    private String mensagem;

    public MarcaCon() {
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
    
    public static void main(String[] args) {
        Marca m = new Marca();
        
        MarcaCon con = new MarcaCon();
        
        m.setIdMarca(1);
        m.setDsMarca("dsfdsfsdf");
        m.setStMarca("ATIVO");
        
        con.excluir(con.getMarca(2));
    }
}
