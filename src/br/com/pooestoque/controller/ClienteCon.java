package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Cliente;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class ClienteCon extends GenericCon{
    private String mensagem;

    public ClienteCon() {
    }
    
    public Cliente getCliente(Integer idCliente){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Cliente encontrado = (Cliente) sessao.load(Cliente.class, idCliente);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Cliente> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Cliente.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Cliente> getClientePorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            String sql = "select f.idCliente, p.nmPessoa, p.cpfCnpj, f.diasVisita, f.stCliente from Cliente f left join pessoa p on f.idPessoa = p.idPessoa where p.nmPessoa like '%"+par+"%' order by idCliente";
            
            List lista = sessao.createSQLQuery(sql).list();
            
            return lista;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Cliente> getClientePorID(Integer idCliente){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Cliente where idCliente = "+idCliente+" order by idCliente").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Cliente> getClientePorSituacao(String stCliente){
        String par = stCliente.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Cliente where stCliente like '%"+par+"%' order by idCliente").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
