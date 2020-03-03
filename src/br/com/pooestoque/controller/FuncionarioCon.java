package br.com.pooestoque.controller;

import br.com.pooestoque.hibernate.HibernateUtil;
import br.com.pooestoque.hibernate.TrataException;
import br.com.pooestoque.model.Funcionario;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author augusto.ortolan
 */
public class FuncionarioCon extends GenericCon{
    private String mensagem;

    public FuncionarioCon() {
    }
    
    public Funcionario getFuncionario(Integer idFuncionario){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            Funcionario encontrado = (Funcionario) sessao.load(Funcionario.class, idFuncionario);
            Hibernate.initialize(encontrado);
            return encontrado;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
        
    }
    
    public List<Funcionario> getLista(){
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createCriteria(Funcionario.class).list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Funcionario> getFuncionarioPorNome(String nome){
        
        String par = nome.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        
        try{
            String sql = "select f.idFuncionario, p.nmPessoa, p.cpfCnpj, f.diasVisita, f.stFuncionario from Funcionario f left join pessoa p on f.idPessoa = p.idPessoa where p.nmPessoa like '%"+par+"%' order by idFuncionario";
            
            List lista = sessao.createSQLQuery(sql).list();
            
            return lista;
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Funcionario> getFuncionarioPorID(Integer idFuncionario){
        
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Funcionario where idFuncionario = "+idFuncionario+" order by idFuncionario").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
    
    public List<Funcionario> getFuncionarioPorSituacao(String stFuncionario){
        String par = stFuncionario.toUpperCase();
        Session sessao = HibernateUtil.getSession();
        sessao.beginTransaction();
        try{
            return sessao.createQuery("from Funcionario where stFuncionario like '%"+par+"%' order by idFuncionario").list();
        }catch (Exception e){
            mensagem = TrataException.trataException(e);
            return null;
        }finally{
            sessao.close();
        }
    }
}
