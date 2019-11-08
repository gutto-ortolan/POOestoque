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
@Table(name="SUBGRUPO")
public class SubGrupo {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQSUBGRUPO", sequenceName = "SEQSUBGRUPO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQSUBGRUPO")
    private Integer idSubGrupo;
    private String dsSubGrupo;
    private String stSubGrupo;
    private Grupo grupo;

    public Integer getIdSubGrupo() {
        return idSubGrupo;
    }

    public void setIdSubGrupo(Integer idSubGrupo) {
        this.idSubGrupo = idSubGrupo;
    }

    public String getDsSubGrupo() {
        return dsSubGrupo;
    }

    public void setDsSubGrupo(String dsSubGrupo) {
        this.dsSubGrupo = dsSubGrupo;
    }

    public String getStSubGrupo() {
        return stSubGrupo;
    }

    public void setStSubGrupo(String stSubGrupo) {
        this.stSubGrupo = stSubGrupo;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
