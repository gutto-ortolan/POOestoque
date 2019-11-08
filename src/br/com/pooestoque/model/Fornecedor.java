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
 * @author Augusto Ortolan
 */
@Entity()
@Table(name="FORNECEDOR")
public class Fornecedor {
    
   @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQFORNECEDOR", sequenceName = "SEQFORNECEDOR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQFORNECEDOR") 
    private Integer idFornecedor;
    private String nmFornecedor;
    private String cnpj;
    private Integer diasVisita;
    private String stFornecedor;

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNmFornecedor() {
        return nmFornecedor;
    }

    public void setNmFornecedor(String nmFornecedor) {
        this.nmFornecedor = nmFornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getDiasVisita() {
        return diasVisita;
    }

    public void setDiasVisita(Integer diasVisita) {
        this.diasVisita = diasVisita;
    }

    public String getStFornecedor() {
        return stFornecedor;
    }

    public void setStFornecedor(String stFornecedor) {
        this.stFornecedor = stFornecedor;
    }
    
    
}
