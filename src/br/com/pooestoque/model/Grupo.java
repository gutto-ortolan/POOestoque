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
@Table(name="GRUPO")
public class Grupo implements Serializable{

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQGRUPO", sequenceName = "SEQGRUPO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQGRUPO") 
    private Integer idGrupo;
    
    @Column(nullable = false)
    private String dsGrupo;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stGrupo;

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getDsGrupo() {
        return dsGrupo;
    }

    public void setDsGrupo(String dsGrupo) {
        this.dsGrupo = dsGrupo;
    }

    public String getStGrupo() {
        if (stGrupo != null) {
            if (stGrupo.equals("A")) {
                return "ATIVO";
            } else if (stGrupo.equals("I")) {
                return "INATIVO";
            }
        }
        return stGrupo;
    }

    public void setStGrupo(String stGrupo) {
        if (stGrupo != null) {
            if (stGrupo.equals("ATIVO")) {
                this.stGrupo = "A";
            } else if (stGrupo.equals("INATIVO")) {
                this.stGrupo = "I";
            }
        } else {
            this.stGrupo = stGrupo;
        }
    }
    
    @Override
    public String toString() {
        return getDsGrupo();
    }

}
