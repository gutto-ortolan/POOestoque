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
@Table(name="MARCA")
public class Marca {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQMARCA", sequenceName = "SEQMARCA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQMARCA")
    private Integer idMarca;
    private String dsMarca;
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
        return stMarca;
    }

    public void setStMarca(String stMarca) {
        this.stMarca = stMarca;
    }

}
