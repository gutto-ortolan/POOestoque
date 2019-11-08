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
@Table(name="TIPOPRODUTO")
public class TipoProduto {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQTIPOPRODUTO", sequenceName = "SEQTIPOPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQSTIPOPRODUTO")
    private Integer idTipoProduto;
    private String dsTipoProduto;
    private String stTipoProduto;

    public Integer getIdTipoProduto() {
        return idTipoProduto;
    }

    public void setIdTipoProduto(Integer idTipoProduto) {
        this.idTipoProduto = idTipoProduto;
    }

    public String getDsTipoProduto() {
        return dsTipoProduto;
    }

    public void setDsTipoProduto(String dsTipoProduto) {
        this.dsTipoProduto = dsTipoProduto;
    }

    public String getStTipoProduto() {
        return stTipoProduto;
    }

    public void setStTipoProduto(String stTipoProduto) {
        this.stTipoProduto = stTipoProduto;
    }

}
