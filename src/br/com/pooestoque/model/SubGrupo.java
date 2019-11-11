package br.com.pooestoque.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Augusto Ortolan
 */
@Entity()
@Table(name="SUBGRUPO")
public class SubGrupo implements Serializable{

    @Id
    @Column(updatable = false)
    @SequenceGenerator(name = "SEQSUBGRUPO", sequenceName = "SEQSUBGRUPO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQSUBGRUPO")
    private Integer idSubGrupo;
    
    @Column(nullable = false)
    private String dsSubGrupo;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stSubGrupo;
    
    @ManyToOne
    @JoinColumn(name="idGrupo", nullable = false)
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
        if (stSubGrupo != null) {
            if (stSubGrupo.equals("A")) {
                return "ATIVO";
            } else if (stSubGrupo.equals("I")) {
                return "INATIVO";
            }
        }
        return stSubGrupo;
    }

    public void setStSubGrupo(String stSubGrupo) {
        if (stSubGrupo != null) {
            if (stSubGrupo.equals("ATIVO")) {
                this.stSubGrupo = "A";
            } else if (stSubGrupo.equals("INATIVO")) {
                this.stSubGrupo = "I";
            }
        } else {
            this.stSubGrupo = stSubGrupo;
        }
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public String toString() {
        return getDsSubGrupo();
    }

}
