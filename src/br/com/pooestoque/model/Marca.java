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
@Table(name="MARCA")
public class Marca implements Serializable{

    @Id
    @Column(updatable = false)
    @SequenceGenerator(name = "SEQMARCA", sequenceName = "SEQMARCA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQMARCA")
    private Integer idMarca;
    
    @Column(nullable = false)
    private String dsMarca;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stMarca;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getDsMarca() {
        return dsMarca;
    }

    public void setDsMarca(String dsMarca) {
        this.dsMarca = dsMarca;
    }

    public String getStMarca() {
        if (stMarca != null) {
            if (stMarca.equals("A")) {
                return "ATIVO";
            } else if (stMarca.equals("I")) {
                return "INATIVO";
            }
        }
        return stMarca;
    }

    public void setStMarca(String stMarca) {
        if (stMarca != null) {
            if (stMarca.equals("ATIVO")) {
                this.stMarca = "A";
            } else if (stMarca.equals("INATIVO")) {
                this.stMarca = "I";
            }
        } else {
            this.stMarca = stMarca;
        }
    }
    
    @Override
    public String toString() {
        return getDsMarca();
    }

}
