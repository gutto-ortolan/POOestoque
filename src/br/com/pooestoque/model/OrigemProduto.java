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
@Table(name="ORIGEMPRODUTO")
public class OrigemProduto implements Serializable{

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQORIGEMPRODUTO", sequenceName = "SEQORIGEMPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQORIGEMPRODUTO")
    private Integer idOrigem;
    
    @Column(nullable = false)
    private String dsOrigem;
    
    @Column(nullable = false, columnDefinition = "char")
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
        if (stOrigem != null) {
            if (stOrigem.equals("A")) {
                return "ATIVO";
            } else if (stOrigem.equals("I")) {
                return "INATIVO";
            }
        }
        return stOrigem;
    }

    public void setStOrigem(String stOrigem) {
        if (stOrigem != null) {
            if (stOrigem.equals("ATIVO")) {
                this.stOrigem = "A";
            } else if (stOrigem.equals("INATIVO")) {
                this.stOrigem = "I";
            }
        } else {
            this.stOrigem = stOrigem;
        }
    }
    
    @Override
    public String toString() {
        return getDsOrigem();
    }

}
