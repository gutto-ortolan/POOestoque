package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.model.Produto;
import java.awt.Toolkit;

/**
 *
 * @author augusto.ortolan
 */
public class VisualizarProdutoForm extends javax.swing.JDialog {

    public VisualizarProdutoForm() {
        initComponents();
        setIcon();
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    
    public void visualizaProduto(Produto obj){
        txfId.setText(String.valueOf(obj.getIdProduto()));
        txfDs.setText(obj.getDsProduto());
        txfBarras.setText(obj.getCdBarras());
        txfCusto.setText(String.valueOf(obj.getVlPrecoCusto()));
        txfVenda.setText(String.valueOf(obj.getVlPrecoVenda()));
        txfDivisao.setText(obj.getDivisao().getDsDivisao());
        txfFornecedor.setText(obj.getFornecedor().getNmFornecedor());
        txfMarca.setText(obj.getMarca().getDsMarca());
        txfOrigem.setText(obj.getOrigem().getDsOrigem());
        txfQtd.setText(String.valueOf(obj.getQtd()));
        txfSituacao.setText(obj.getStProduto());
        txfTipo.setText(obj.getTipoProduto().getDsTipoProduto());
        txfUndiade.setText(obj.getUnidade().getDsUnidade());
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txfId = new javax.swing.JTextField();
        txfSituacao = new javax.swing.JTextField();
        txfDs = new javax.swing.JTextField();
        txfMarca = new javax.swing.JTextField();
        txfFornecedor = new javax.swing.JTextField();
        txfTipo = new javax.swing.JTextField();
        txfOrigem = new javax.swing.JTextField();
        txfUndiade = new javax.swing.JTextField();
        txfQtd = new javax.swing.JTextField();
        txfVenda = new javax.swing.JTextField();
        txfCusto = new javax.swing.JTextField();
        txfDivisao = new javax.swing.JTextField();
        txfBarras = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vizualização de Produto");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Situação");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Descrição");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Fornecedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("Tipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setText("Origem");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Unidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setText("Quantidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setText("Preço Venda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setText("Preço Custo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setText("Divisão");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel12, gridBagConstraints);

        jLabel13.setText("Cód. Barras");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel13, gridBagConstraints);

        txfId.setEditable(false);
        txfId.setBackground(new java.awt.Color(255, 255, 255));
        txfId.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfId, gridBagConstraints);

        txfSituacao.setEditable(false);
        txfSituacao.setBackground(new java.awt.Color(255, 255, 255));
        txfSituacao.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfSituacao, gridBagConstraints);

        txfDs.setEditable(false);
        txfDs.setBackground(new java.awt.Color(255, 255, 255));
        txfDs.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfDs, gridBagConstraints);

        txfMarca.setEditable(false);
        txfMarca.setBackground(new java.awt.Color(255, 255, 255));
        txfMarca.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfMarca, gridBagConstraints);

        txfFornecedor.setEditable(false);
        txfFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        txfFornecedor.setColumns(25);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfFornecedor, gridBagConstraints);

        txfTipo.setEditable(false);
        txfTipo.setBackground(new java.awt.Color(255, 255, 255));
        txfTipo.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfTipo, gridBagConstraints);

        txfOrigem.setEditable(false);
        txfOrigem.setBackground(new java.awt.Color(255, 255, 255));
        txfOrigem.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfOrigem, gridBagConstraints);

        txfUndiade.setEditable(false);
        txfUndiade.setBackground(new java.awt.Color(255, 255, 255));
        txfUndiade.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfUndiade, gridBagConstraints);

        txfQtd.setEditable(false);
        txfQtd.setBackground(new java.awt.Color(255, 255, 255));
        txfQtd.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfQtd, gridBagConstraints);

        txfVenda.setEditable(false);
        txfVenda.setBackground(new java.awt.Color(255, 255, 255));
        txfVenda.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfVenda, gridBagConstraints);

        txfCusto.setEditable(false);
        txfCusto.setBackground(new java.awt.Color(255, 255, 255));
        txfCusto.setColumns(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfCusto, gridBagConstraints);

        txfDivisao.setEditable(false);
        txfDivisao.setBackground(new java.awt.Color(255, 255, 255));
        txfDivisao.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfDivisao, gridBagConstraints);

        txfBarras.setEditable(false);
        txfBarras.setBackground(new java.awt.Color(255, 255, 255));
        txfBarras.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(txfBarras, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txfBarras;
    private javax.swing.JTextField txfCusto;
    private javax.swing.JTextField txfDivisao;
    private javax.swing.JTextField txfDs;
    private javax.swing.JTextField txfFornecedor;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfMarca;
    private javax.swing.JTextField txfOrigem;
    private javax.swing.JTextField txfQtd;
    private javax.swing.JTextField txfSituacao;
    private javax.swing.JTextField txfTipo;
    private javax.swing.JTextField txfUndiade;
    private javax.swing.JTextField txfVenda;
    // End of variables declaration//GEN-END:variables
}
