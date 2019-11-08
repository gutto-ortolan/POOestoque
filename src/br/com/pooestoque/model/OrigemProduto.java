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
@Table(name="ORIGEMPRODUTO")
public class OrigemProduto {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQORIGEMPRODUTO", sequenceName = "SEQORIGEMPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQORIGEMPRODUTO")
    private Integer idOrigem;
    private String dsOrigem;
    private String stOrigem;

    public Integer getIdOrigem() {
        return idOrigem;
    }

    public void setIdOrigem(Integer idOrigem) {
        this.idOrigem = idOrigem;
    }

    public String getDsOrigem() {
        return dsOrigem;
    }

    public void setDsOrigem(String dsOrigem) {
        this.dsOrigem = dsOrigem;
    }

    public String getStOrigem() {
        return stOrigem;
    }

    public void setStOrigem(String stOrigem) {
        this.stOrigem = stOrigem;
    }

}
