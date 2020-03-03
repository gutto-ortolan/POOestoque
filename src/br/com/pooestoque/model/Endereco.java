package br.com.pooestoque.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author augusto.ortolan
 */
@Entity()
@Table(name="ENDERECO")
public class Endereco {
    
    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQENDERECO", sequenceName = "SEQENDERECO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQENDERECO")
    private Integer idEndereco;
    
    private String rua;
    
    private Integer numero;
    
    private String bairro;
    
    private String cidade;
    
    private String estado;
    
    private String nrCEP;

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNrCEP() {
        return nrCEP;
    }

    public void setNrCEP(String nrCEP) {
        this.nrCEP = nrCEP;
    }
    
}
