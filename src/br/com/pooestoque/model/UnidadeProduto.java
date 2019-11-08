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
@Table(name="UNIDADEPRODUTO")
public class UnidadeProduto implements Serializable{

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQUNIDADEPRODUTO", sequenceName = "SEQUNIDADEPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUNIDADEPRODUTO")
    private Integer idUnidade;
    
    @Column(nullable = false)
    private String dsUnidade;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stUnidade;

    public Integer getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(Integer idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getDsUnidade() {
        return dsUnidade;
    }

    public void setDsUnidade(String dsUnidade) {
        this.dsUnidade = dsUnidade;
    }

    public String getStUnidade() {
        if (stUnidade != null) {
            if (stUnidade.equals("A")) {
                return "ATIVO";
            } else if (stUnidade.equals("I")) {
                return "INATIVO";
            }
        }
        return stUnidade;
    }

    public void setStUnidade(String stUnidade) {
        if (stUnidade != null) {
            if (stUnidade.equals("ATIVO")) {
                this.stUnidade = "A";
            } else if (stUnidade.equals("INATIVO")) {
                this.stUnidade = "I";
            }
        } else {
            this.stUnidade = stUnidade;
        }
    }
    
    @Override
    public String toString() {
        return getDsUnidade();
    }

}
