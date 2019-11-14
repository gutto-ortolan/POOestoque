package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.controller.DivisaoCon;
import br.com.pooestoque.controller.FornecedorCon;
import br.com.pooestoque.controller.GrupoCon;
import br.com.pooestoque.controller.SubGrupoCon;
import br.com.pooestoque.model.Divisao;
import br.com.pooestoque.model.Fornecedor;
import br.com.pooestoque.model.Grupo;
import br.com.pooestoque.model.SubGrupo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto.ortolan
 */
public class NovoSubGrupoDivisaoForm extends javax.swing.JDialog {

    private final String origemBtn;
    private final String origemCla;
    private SubGrupo subGrupo = new SubGrupo();
    private Divisao divisao = new Divisao();
    private final GrupoCon grupoCon = new GrupoCon();
    private final SubGrupoCon subGrupoCon = new SubGrupoCon();
    private final DivisaoCon divisaoCon = new DivisaoCon();

    public NovoSubGrupoDivisaoForm(String origemClasse, String origemb) {
        initComponents();

        origemCla = origemClasse;
        origemBtn = origemb;

        if (origemClasse.equals("Sub")) {
            lblDiv.setText("Grupo");
            cbxSubDiv.setModel(new DefaultComboBoxModel(grupoCon.getLista().toArray()));
        } else if (origemClasse.equals("Div")) {
            lblDiv.setText("SubGrupo");
            cbxSubDiv.setModel(new DefaultComboBoxModel(subGrupoCon.getLista().toArray()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txfCodigo = new javax.swing.JTextField();
        txfNome = new javax.swing.JTextField();
        cbxSituacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDiv = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxSubDiv = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        lblDiv.setText("SubGrupo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblDiv, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        getContentPane().add(cbxSubDiv, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if (txfNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        separaPorOrigemGravar(origemBtn, origemCla);
    }//GEN-LAST:event_bntGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(origemCla.equals("Sub")){
            this.subGrupo = null;
        }else{
            this.divisao = null;
        }
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JComboBox<String> cbxSubDiv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDiv;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables

    public void separaPorOrigemGravar(String origemBtn, String origemClass) {
        if (origemClass.equals("Sub")) {
            SubGrupo s = new SubGrupo();
            s.setDsSubGrupo(txfNome.getText().toUpperCase());
            s.setStSubGrupo(cbxSituacao.getSelectedItem().toString().toUpperCase());
            s.setGrupo((Grupo)cbxSubDiv.getSelectedItem());
            if (origemBtn.equals("Novo")) {
                subGrupoCon.incluir(s);
            } else if (origemBtn.equals("Altera")) {
                s.setIdSubGrupo(Integer.parseInt(txfCodigo.getText()));
                subGrupoCon.alterar(s);
            }
            this.subGrupo = s;
        }else if(origemClass.equals("Div")){
            Divisao d = new Divisao();
            d.setDsDivisao(txfNome.getText().toUpperCase());
            d.setStDivisao(cbxSituacao.getSelectedItem().toString().toUpperCase());
            d.setSubGrupo((SubGrupo)cbxSubDiv.getSelectedItem());
            if (origemBtn.equals("Novo")) {
                divisaoCon.incluir(d);
            } else if (origemBtn.equals("Altera")) {
                d.setIdDivisao(Integer.parseInt(txfCodigo.getText()));
                divisaoCon.alterar(d);
            }
            this.divisao = d;
        }

        dispose();
    }

    public SubGrupo getNovoSubGrupo() {
        return subGrupo;
    }

    public Divisao getNovoDivisao() {
        return divisao;
    }

    public void setSubGrupoAlterar(SubGrupo obj) {
        txfCodigo.setText(String.valueOf(obj.getIdSubGrupo()));
        txfNome.setText(obj.getDsSubGrupo());
        cbxSituacao.setSelectedItem(obj.getStSubGrupo());
        cbxSubDiv.setSelectedItem(obj.getGrupo());
    }

    public void setDivisaoAlterar(Divisao obj) {
        txfCodigo.setText(String.valueOf(obj.getIdDivisao()));
        txfNome.setText(obj.getDsDivisao());
        cbxSituacao.setSelectedItem(obj.getStDivisao());
        cbxSubDiv.setSelectedItem(obj.getSubGrupo());
    }

}
