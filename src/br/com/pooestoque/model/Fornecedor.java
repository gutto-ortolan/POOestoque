package br.com.pooestoque.model;

import java.io.Serializable;
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
public class Fornecedor implements Serializable{
    
    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQFORNECEDOR", sequenceName = "SEQFORNECEDOR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQFORNECEDOR") 
    private Integer idFornecedor;
   
    @Column(nullable = false)
    private String nmFornecedor;
    
    private String cnpj;
    
    private Integer diasVisita;
    
    @Column(nullable = false, columnDefinition = "char")
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
        if (stFornecedor != null) {
            if (stFornecedor.equals("A")) {
                return "ATIVO";
            } else if (stFornecedor.equals("I")) {
                return "INATIVO";
            }
        }
        return stFornecedor;
    }

    public void setStFornecedor(String stFornecedor) {
        if (stFornecedor != null) {
            if (stFornecedor.equals("ATIVO")) {
                this.stFornecedor = "A";
            } else if (stFornecedor.equals("INATIVO")) {
                this.stFornecedor = "I";
            }
        } else {
            this.stFornecedor = stFornecedor;
        }
    }
    
    @Override
    public String toString() {
        return getNmFornecedor();
    }
    
    
}
