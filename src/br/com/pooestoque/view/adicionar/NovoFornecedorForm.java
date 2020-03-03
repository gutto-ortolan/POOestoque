package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.controller.FornecedorCon;
import br.com.pooestoque.controller.GenericCon;
import br.com.pooestoque.model.Fornecedor;
import br.com.pooestoque.model.Pessoa;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto.ortolan
 */
public class NovoFornecedorForm extends javax.swing.JDialog {

    private final FornecedorCon fornecedorCon = new FornecedorCon();
    private final String origemBtn;
    private Fornecedor fornecedor = new Fornecedor();
    
    public NovoFornecedorForm(String origemb) {
        initComponents();
        origemBtn = origemb;
        setIcon();
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txfCodigo = new javax.swing.JTextField();
        txfNome = new javax.swing.JTextField();
        txfCnpj = new javax.swing.JTextField();
        txfDiasVisita = new javax.swing.JTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 250));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txfCodigo.setEditable(false);
        txfCodigo.setColumns(7);
        txfCodigo.setEnabled(false);
        txfCodigo.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(txfCodigo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(txfNome, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(txfCnpj, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(txfDiasVisita, gridBagConstraints);

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(cbxSituacao, gridBagConstraints);

        jLabel1.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nome*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Cnpj");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Dias Visita");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Situação*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 46, 0, 5);
        getContentPane().add(jLabel5, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(btnCancelar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if(txfNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        separaPorOrigemGravar(origemBtn);
    }//GEN-LAST:event_bntGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.fornecedor = null;
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txfCnpj;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfDiasVisita;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables

    public void separaPorOrigemGravar(String origemBtn) {
            Pessoa pessoa = new Pessoa();
            pessoa.setNmPessoa(txfNome.getText().toUpperCase());
            pessoa.setCpfCnpj(txfCnpj.getText());
            GenericCon pessoaCon = new  GenericCon();
            
            pessoaCon.incluir(pessoa);
        
            Fornecedor f = new Fornecedor();
            f.setStFornecedor(cbxSituacao.getSelectedItem().toString().toUpperCase());
            f.setDiasVisita(Integer.parseInt(txfDiasVisita.getText()));
            f.setPessoa(pessoa);
            if(origemBtn.equals("Novo")){
               fornecedorCon.incluir(f); 
            }else if(origemBtn.equals("Altera")){
                f.setIdFornecedor(Integer.parseInt(txfCodigo.getText()));
                fornecedorCon.alterar(f);
            }
            this.fornecedor = f;
        dispose();
    }

    
    public Fornecedor getNovoFornecedor() {
        return fornecedor;
    }
    
    
    public void setFornecedorAlterar(Fornecedor obj) {
        txfCodigo.setText(String.valueOf(obj.getIdFornecedor()));
        txfNome.setText(obj.getPessoa().getNmPessoa());
        cbxSituacao.setSelectedItem(obj.getStFornecedor());
        txfDiasVisita.setText(obj.getDiasVisita().toString());
        txfCnpj.setText(obj.getPessoa().getCpfCnpj());
    }
    
    
}
