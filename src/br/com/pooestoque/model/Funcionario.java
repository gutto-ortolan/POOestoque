package br.com.pooestoque.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author augusto.ortolan
 */
@Entity()
@Table(name="FUNCIONARIO")
public class Funcionario {
    
    @Id
    @Column(updatable = false)
    @SequenceGenerator(name = "SEQFUNCIONARIO", sequenceName = "SEQFUNCIONARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQFUNCIONARIO")
    private Integer idFuncionario;
    
    private Integer nrMatricula;
    
    private Double vlSalario;
    
    private String formaPgtoSalario;
    
    private Date dtAdmissao;
    
    private Date dtDemissao;
    
    @ManyToOne
    @JoinColumn(name="idEndereco")
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name="idContato")
    private Contato contato;
    
    @ManyToOne
    @JoinColumn(name="idPessoa")
    private Pessoa pessoa;
    
    private String stFuncionario;

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getNrMatricula() {
        return nrMatricula;
    }

    public void setNrMatricula(Integer nrMatricula) {
        this.nrMatricula = nrMatricula;
    }

    public Double getVlSalario() {
        return vlSalario;
    }

    public void setVlSalario(Double vlSalario) {
        this.vlSalario = vlSalario;
    }

    public String getFormaPgtoSalario() {
        return formaPgtoSalario;
    }

    public void setFormaPgtoSalario(String formaPgtoSalario) {
        this.formaPgtoSalario = formaPgtoSalario;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtDemissao() {
        return dtDemissao;
    }

    public void setDtDemissao(Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getStFuncionario() {
        return stFuncionario;
    }

    public void setStFuncionario(String stFuncionario) {
        this.stFuncionario = stFuncionario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
