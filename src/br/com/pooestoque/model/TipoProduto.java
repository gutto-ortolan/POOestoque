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
@Table(name="TIPOPRODUTO")
public class TipoProduto implements Serializable{

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQTIPOPRODUTO", sequenceName = "SEQTIPOPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQSTIPOPRODUTO")
    private Integer idTipoProduto;
    
    @Column(nullable = false)
    private String dsTipoProduto;
    
    @Column(nullable = false, columnDefinition = "char")
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
        if (stTipoProduto != null) {
            if (stTipoProduto.equals("A")) {
                return "ATIVO";
            } else if (stTipoProduto.equals("I")) {
                return "INATIVO";
            }
        }
        return stTipoProduto;
    }

    public void setStTipoProduto(String stTipoProduto) {
        if (stTipoProduto != null) {
            if (stTipoProduto.equals("ATIVO")) {
                this.stTipoProduto = "A";
            } else if (stTipoProduto.equals("INATIVO")) {
                this.stTipoProduto = "I";
            }
        } else {
            this.stTipoProduto = stTipoProduto;
        }
    }
    
    @Override
    public String toString() {
        return getDsTipoProduto();
    }

}
