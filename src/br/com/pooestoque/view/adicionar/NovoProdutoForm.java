package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.controller.DivisaoCon;
import br.com.pooestoque.controller.FornecedorCon;
import br.com.pooestoque.controller.GrupoCon;
import br.com.pooestoque.controller.MarcaCon;
import br.com.pooestoque.controller.OrigemProdutoCon;
import br.com.pooestoque.controller.ProdutoCon;
import br.com.pooestoque.controller.SubGrupoCon;
import br.com.pooestoque.controller.UnidadeProdutoCon;
import br.com.pooestoque.model.Divisao;
import br.com.pooestoque.model.Marca;
import br.com.pooestoque.model.OrigemProduto;
import br.com.pooestoque.model.Produto;
import br.com.pooestoque.model.TipoProduto;
import br.com.pooestoque.model.UnidadeProduto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto.ortolan
 */
public class NovoProdutoForm extends javax.swing.JDialog {
    
    private MarcaCon marcaCon = new MarcaCon();
    private OrigemProdutoCon origemCon = new OrigemProdutoCon();
    private UnidadeProdutoCon unidadeCon = new UnidadeProdutoCon();
    private GrupoCon grupoCon = new GrupoCon();
    private SubGrupoCon subGrupoCon = new SubGrupoCon();
    private DivisaoCon divisaoCon = new DivisaoCon();
    private FornecedorCon fornecedorCon = new FornecedorCon();
    private final String origemBnt;
    
    public NovoProdutoForm(String origem) {
        initComponents();
        origemBnt = origem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        lblCusto = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        lblCodeBa = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        txfCodigo = new javax.swing.JTextField();
        txfDescricao = new javax.swing.JTextField();
        txfQtd = new javax.swing.JTextField();
        txfCodeBa = new javax.swing.JTextField();
        txfCusto = new javax.swing.JFormattedTextField();
        txfVenda = new javax.swing.JFormattedTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        cbxMarca = new javax.swing.JComboBox<>();
        cbxTipo = new javax.swing.JComboBox<>();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbxOrigem = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxUnidade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxFornecedor = new javax.swing.JComboBox<>();
        cbxGrupo = new javax.swing.JComboBox<>();
        cbxSubGrupo = new javax.swing.JComboBox<>();
        cbxDivisao = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 350));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        getContentPane().add(lblCodigo, gridBagConstraints);

        lblDescricao.setText("Descrição");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(lblDescricao, gridBagConstraints);

        lblQtd.setText("Quantidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(lblQtd, gridBagConstraints);

        lblCusto.setText("Preço Custo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblCusto, gridBagConstraints);

        lblVenda.setText("Preço Venda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblVenda, gridBagConstraints);

        lblCodeBa.setText("Cógido Barras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblCodeBa, gridBagConstraints);

        lblMarca.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblMarca, gridBagConstraints);

        lblTipo.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblTipo, gridBagConstraints);

        lblSituacao.setText("Situação");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(lblSituacao, gridBagConstraints);

        txfCodigo.setEditable(false);
        txfCodigo.setColumns(5);
        txfCodigo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(txfCodigo, gridBagConstraints);

        txfDescricao.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfDescricao, gridBagConstraints);

        txfQtd.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfQtd, gridBagConstraints);

        txfCodeBa.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfCodeBa, gridBagConstraints);

        txfCusto.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfCusto, gridBagConstraints);

        txfVenda.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfVenda, gridBagConstraints);

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(cbxSituacao, gridBagConstraints);

        cbxMarca.setModel(new DefaultComboBoxModel(marcaCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxMarca, gridBagConstraints);

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "TÊNIS", "CAMISETA", "CALÇÃO", "CALÇA", "MEIA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxTipo, gridBagConstraints);

        bntGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (14).png"))); // NOI18N
        bntGravar.setText("Gravar");
        bntGravar.setMaximumSize(new java.awt.Dimension(99, 33));
        bntGravar.setMinimumSize(new java.awt.Dimension(99, 27));
        bntGravar.setPreferredSize(new java.awt.Dimension(105, 33));
        bntGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGravarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
        getContentPane().add(bntGravar, gridBagConstraints);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (13).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(99, 33));
        btnCancelar.setPreferredSize(new java.awt.Dimension(105, 33));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
        getContentPane().add(btnCancelar, gridBagConstraints);

        jLabel1.setText("Origem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        cbxOrigem.setModel(new DefaultComboBoxModel(origemCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxOrigem, gridBagConstraints);

        jLabel2.setText("Unidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        cbxUnidade.setModel(new DefaultComboBoxModel(unidadeCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxUnidade, gridBagConstraints);

        jLabel3.setText("Fornecedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        cbxFornecedor.setModel(new DefaultComboBoxModel(fornecedorCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxFornecedor, gridBagConstraints);

        cbxGrupo.setModel(new DefaultComboBoxModel(grupoCon.getLista().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxGrupo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxSubGrupo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxDivisao, gridBagConstraints);

        jLabel4.setText("Divisão");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Grupo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("SubGrupo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if (txfDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        separaPorOrigemGravar(origemBnt);
    }//GEN-LAST:event_bntGravarActionPerformed
    
    private Produto produto;
    
    public Produto getNovoProduto() {
        return produto;
    }
    
    public void setProdutoAlterar(Produto produto) {
        txfCodigo.setText(String.valueOf(produto.getIdProduto()));
        txfDescricao.setText(produto.getDsProduto());
        
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.produto = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void separaPorOrigemGravar(String origem){
        Produto p = new Produto();
        
        p.setDsProduto(txfDescricao.getText().toUpperCase());
        p.setStProduto(cbxSituacao.getSelectedItem().toString().toUpperCase());
        p.setTipoProduto((TipoProduto)cbxTipo.getSelectedItem());
        p.setQtd(Double.parseDouble(txfQtd.getText()));
        p.setVlPrecoCusto(((Double)txfCusto.getValue()));
        p.setVlPrecoVenda(Double.parseDouble(txfVenda.getText()));
        p.setCdBarras(txfCodeBa.getText().toUpperCase());
        p.setMarca((Marca) cbxMarca.getSelectedItem());
        p.setOrigem((OrigemProduto)cbxOrigem.getSelectedItem());
        p.setUnidade((UnidadeProduto)cbxUnidade.getSelectedItem());
        p.setDivisao((Divisao)cbxDivisao.getSelectedItem());
        
        ProdutoCon produtoCon = new ProdutoCon();
        if(origem.equals("Novo")){
            produtoCon.incluir(p);
        } else if(origem.equals("Altera")){
            produtoCon.alterar(p);
        }
        this.produto = p;
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxDivisao;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JComboBox<String> cbxGrupo;
    private javax.swing.JComboBox<Object> cbxMarca;
    private javax.swing.JComboBox<String> cbxOrigem;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JComboBox<String> cbxSubGrupo;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCodeBa;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTextField txfCodeBa;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JFormattedTextField txfCusto;
    private javax.swing.JTextField txfDescricao;
    private javax.swing.JTextField txfQtd;
    private javax.swing.JFormattedTextField txfVenda;
    // End of variables declaration//GEN-END:variables
}
