package br.com.pooestoque.model;

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
@Table(name="CLIENTE")
public class Cliente {
    
    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQCLIENTE", sequenceName = "SEQCLIENTE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQCLIENTE")
    private Integer idCliente;
    
    private Integer nrCadastro;
    
    private String formaPgto;
    
    @ManyToOne
    @JoinColumn(name="idPessoa")
    private Pessoa Pessoa;
    
    @ManyToOne
    @JoinColumn(name="idEndereco")
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name="idContato")
    private Contato contato;
    
    private String stCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getNrCadastro() {
        return nrCadastro;
    }

    public void setNrCadastro(Integer nrCadastro) {
        this.nrCadastro = nrCadastro;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Pessoa getPessoa() {
        return Pessoa;
    }

    public void setPessoa(Pessoa Pessoa) {
        this.Pessoa = Pessoa;
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

    public String getStCliente() {
        return stCliente;
    }

    public void setStCliente(String stCliente) {
        this.stCliente = stCliente;
    }
    
    
}
