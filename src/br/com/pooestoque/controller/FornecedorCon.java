package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Fornecedor;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class FornecedorCon extends GenericCon{
    private String mensagem;

    public FornecedorCon() {
    }
    
    public Fornecedor getFornecedor(Integer idFornecedor){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Fornecedor encontrado = (Fornecedor) sessao.load(Fornecedor.class, idFornecedor);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Fornecedor> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Fornecedor.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Fornecedor> getFornecedorPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            String sql = "select f.idFornecedor, p.nmPessoa, p.cpfCnpj, f.diasVisita, f.stFornecedor from Fornecedor f left join pessoa p on f.idPessoa = p.idPessoa where p.nmPessoa like '%"+par+"%' order by idFornecedor";
            
            List lista = sessao.createSQLQuery(sql).list();
            
            return lista;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Fornecedor> getFornecedorPorID(Integer idFornecedor){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Fornecedor where idFornecedor = "+idFornecedor+" order by idFornecedor").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Fornecedor> getFornecedorPorSituacao(String stFornecedor){
        String par = stFornecedor.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Fornecedor where stFornecedor like '%"+par+"%' order by idFornecedor").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
