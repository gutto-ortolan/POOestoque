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
@Table(name="PRODUTO")
public class Produto implements Serializable{

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQPRODUTO", sequenceName = "SEQPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQPRODUTO")
    private Integer idProduto;
    
    @Column(nullable = false)
    private String dsProduto;
    
    @Column(nullable = false, columnDefinition = "char")
    private String stProduto;
    
    private String cdBarras;
    
    private Double vlPrecoCusto = 0.0;
    
    private Double vlPrecoVenda = 0.0;
    
    @ManyToOne
    @JoinColumn(name="idOrigem")
    private OrigemProduto origem;
    
    @ManyToOne
    @JoinColumn(name="idMarca", nullable = false)
    private Marca marca;
    
    @ManyToOne
    @JoinColumn(name="idUnidade")
    private UnidadeProduto unidade;
    
    @ManyToOne
    @JoinColumn(name="idDivisao")
    private Divisao divisao;
    
    @ManyToOne
    @JoinColumn(name="idFornecedor")
    private Fornecedor fornecedor;
    
    @ManyToOne
    @JoinColumn(name="idTipoProduto")
    private TipoProduto tipoProduto;

    public Integer getIdProduto () {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDsProduto() {
        return dsProduto;
    }

    public void setDsProduto(String dsProduto) {
        this.dsProduto = dsProduto;
    }

    public String getStProduto() {
        if (stProduto != null) {
            if (stProduto.equals("A")) {
                return "ATIVO";
            } else if (stProduto.equals("I")) {
                return "INATIVO";
            }
        }
        return stProduto;
    }

    public void setStProduto(String stProduto) {
        if (stProduto != null) {
            if (stProduto.equals("ATIVO")) {
                this.stProduto = "A";
            } else if (stProduto.equals("INATIVO")) {
                this.stProduto = "I";
            }
        } else {
            this.stProduto = stProduto;
        }
    }

    public String getCdBarras() {
        return cdBarras;
    }

    public void setCdBarras(String cdBarras) {
        this.cdBarras = cdBarras;
    }

    public Double getVlPrecoCusto() {
        return vlPrecoCusto;
    }

    public void setVlPrecoCusto(Double vlPrecoCusto) {
        this.vlPrecoCusto = vlPrecoCusto;
    }

    public Double getVlPrecoVenda() {
        return vlPrecoVenda;
    }

    public void setVlPrecoVenda(Double vlPrecoVenda) {
        this.vlPrecoVenda = vlPrecoVenda;
    }

    public OrigemProduto getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemProduto origem) {
        this.origem = origem;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public UnidadeProduto getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeProduto unidade) {
        this.unidade = unidade;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

}
