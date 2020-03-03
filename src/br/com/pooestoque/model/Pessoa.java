package br.com.pooestoque.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author augusto.ortolan
 */
@Entity()
@Table(name="PESSOA")
public class Pessoa implements Serializable{
    
    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQPESSOA", sequenceName = "SEQPESSOA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQPESSOA")
    private Integer idPessoa;
    
    @Column(length = 100)
    private String nmPessoa;
    
    @Column(length = 50)
    private String dsFantasia;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascimento;
    
    @Column(length = 18)
    private String cpfCnpj;
    
    @Column(length = 18)
    private String nrRG;
    
    @Column(length = 1)
    private String sexo;
    
    @Column(length = 18)
    private String estadoCivil;
    
    @Column(length = 1)
    private String stPessoa;

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public String getDsFantasia() {
        return dsFantasia;
    }

    public void setDsFantasia(String dsFantasia) {
        this.dsFantasia = dsFantasia;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNrRG() {
        return nrRG;
    }

    public void setNrRG(String nrRG) {
        this.nrRG = nrRG;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getStPessoa() {
        if (stPessoa != null) {
            if (stPessoa.equals("A")) {
                return "ATIVO";
            } else if (stPessoa.equals("I")) {
                return "INATIVO";
            }
        }
        return stPessoa;
    }

    public void setStPessoa(String stPessoa) {
        if (stPessoa != null) {
            if (stPessoa.equals("ATIVO")) {
                this.stPessoa = "A";
            } else if (stPessoa.equals("INATIVO")) {
                this.stPessoa = "I";
            }
        } else {
            this.stPessoa = stPessoa;
        }
    }

    @Override
    public String toString() {
        return getNmPessoa();
    }
    
}
