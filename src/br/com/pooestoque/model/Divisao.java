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
@Table(name="DIVISAO")
public class Divisao implements Serializable {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQDIVISAO", sequenceName = "SEQDIVISAO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQDIVISAO")
    private Integer idDivisao;
    
    private String dsDivisao;
    
    private String stDivisao;
    
    private SubGrupo subGrupo;

    public Integer getIdDivisao() {
        return idDivisao;
    }

    public void setIdDivisao(Integer idDivisao) {
        this.idDivisao = idDivisao;
    }

    public String getDsDivisao() {
        return dsDivisao;
    }

    public void setDsDivisao(String dsDivisao) {
        this.dsDivisao = dsDivisao;
    }

    public String getStDivisao() {
        return stDivisao;
    }

    public void setStDivisao(String stDivisao) {
        this.stDivisao = stDivisao;
    }

    public SubGrupo getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(SubGrupo subGrupo) {
        this.subGrupo = subGrupo;
    }

}
