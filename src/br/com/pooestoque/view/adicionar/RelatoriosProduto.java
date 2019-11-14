package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.controller.ProdutoCon;
import br.com.pooestoque.model.Marca;
import br.com.pooestoque.relatorios.Teste;
import br.com.pooestoque.view.principal.MarcaForm;
import br.com.pooestoque.view.principal.ProdutoForm;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author augusto.ortolan
 */
public class RelatoriosProduto extends javax.swing.JDialog {

    private ProdutoCon produtoCon = new ProdutoCon();
    private ProdutoForm form = new ProdutoForm();
    public RelatoriosProduto() {
        initComponents();
        setIcon();
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxRel = new javax.swing.JComboBox<>();
        btnGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(255, 150));

        jLabel1.setText("Relatório:");

        cbxRel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Relatório Resumido", "Relatório Detalhado", "Relatório por Marca", "Relatório por Grupo", "Relatório por SubGrupo", "Relatório por Divisão", "Relatório por Fornecedor" }));

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxRel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        try {
            List dados = null;

            if (form.getTxfPesquisar().getText().isEmpty() || form.getTxfPesquisar().getText() == null) {
                dados = produtoCon.getLista();
            } else if (form.getCbxPesquisar().getSelectedIndex() == 1) {
                dados = produtoCon.getProdutoPorID(Integer.parseInt(form.getTxfPesquisar().getText()));
            } else if (form.getCbxPesquisar().getSelectedIndex() == 0) {
                dados = produtoCon.getProdutoPorNome(form.getTxfPesquisar().getText());
            } else {
                dados = produtoCon.getProdutoPorSituacao(form.getTxfPesquisar().getText());
            }

            JRDataSource jRDataSource = new JRBeanCollectionDataSource(dados);
            JasperPrint jrPrint = null;

            switch (cbxRel.getSelectedIndex()) {
                case 0:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoResumido.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 1:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoDetalhado.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 2:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoPorMarca.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 3:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoPorGrupo.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 4:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoPorSubGrupo.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 5:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoPorDivisao.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                case 6:
                    jrPrint = JasperFillManager.fillReport(Teste.class.getResource("ProdutoPorFornecedor.jasper").openStream(), null, jRDataSource);
                    JasperExportManager.exportReportToPdfFile(jrPrint, "teste");
                    break;
                default:
                    break;
            }

            JRViewer view = new JRViewer(jrPrint);
            JDialog d = new JDialog();
            d.add(view);
            d.setSize(800, 600);
            d.setLocationRelativeTo(null);
            d.setModal(true);
            d.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(Marca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MarcaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JComboBox<String> cbxRel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
