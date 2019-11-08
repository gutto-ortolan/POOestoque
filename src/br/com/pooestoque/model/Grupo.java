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
@Table(name="GRUPO")
public class Grupo {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQGRUPO", sequenceName = "SEQGRUPO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQGRUPO") 
    private Integer idGrupo;
    private String dsGrupo;
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
        return stGrupo;
    }

    public void setStGrupo(String stGrupo) {
        this.stGrupo = stGrupo;
    }

}
