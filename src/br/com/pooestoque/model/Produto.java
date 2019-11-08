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
@Table(name="PRODUTO")
public class Produto {

    @Id
    @Column(nullable = false)
    @SequenceGenerator(name = "SEQPRODUTO", sequenceName = "SEQPRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQPRODUTO")
    private Integer idProduto;
    private String dsProduto;
    private String stProduto;
    private String cdBarras;
    private Double vlPrecoCusto;
    private Double vlPrecoVenda;
    private OrigemProduto origem;
    private Marca marca;
    private UnidadeProduto unidade;
    private Divisao divisao;
    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;

    public Integer getIdProduto() {
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
        return stProduto;
    }

    public void setStProduto(String stProduto) {
        this.stProduto = stProduto;
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
