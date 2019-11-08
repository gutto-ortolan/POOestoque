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
@Table(name="UNIDADEPRODUTO")
public class UnidadeProduto {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQUNIDADEPRODUTO", sequenceName = "SEQUNIDADEPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQUNIDADEPRODUTO")
    private Integer idUnidade;
    private String dsUnidade;
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
        return stUnidade;
    }

    public void setStUnidade(String stUnidade) {
        this.stUnidade = stUnidade;
    }

}
