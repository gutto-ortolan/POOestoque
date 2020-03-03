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
@Table(name="DIVISAO")
public class Divisao implements Serializable {

    @Id
    @Column(updatable = false)
    @SequenceGenerator(name = "SEQDIVISAO", sequenceName = "SEQDIVISAO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQDIVISAO")
    private Integer idDivisao;
    
    @Column(nullable = false, length = 50)
    private String dsDivisao;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stDivisao;
    
    @ManyToOne
    @JoinColumn(name="idSubGrupo", nullable = false)
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
        if (stDivisao != null) {
            if (stDivisao.equals("A")) {
                return "ATIVO";
            } else if (stDivisao.equals("I")) {
                return "INATIVO";
            }
        }
        return stDivisao;
    }

    public void setStDivisao(String stDivisao) {
        if (stDivisao != null) {
            if (stDivisao.equals("ATIVO")) {
                this.stDivisao = "A";
            } else if (stDivisao.equals("INATIVO")) {
                this.stDivisao = "I";
            }
        } else {
            this.stDivisao = stDivisao;
        }
    }

    public SubGrupo getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(SubGrupo subGrupo) {
        this.subGrupo = subGrupo;
    }

    @Override
    public String toString() {
        return getDsDivisao();
    }
    
}
