package br.com.pooestoque.view.principal;

import br.com.pooestoque.util.GerenteDeJanelas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author augusto.ortolan
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    GerenteDeJanelas gerenteDeJanelas;

    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.gerenteDeJanelas = new GerenteDeJanelas(jDesktopPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/fundob.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmProduto = new javax.swing.JMenuItem();
        jmMarca = new javax.swing.JMenuItem();
        jmUnidade = new javax.swing.JMenuItem();
        jmOrigem = new javax.swing.JMenuItem();
        jmTipo = new javax.swing.JMenuItem();
        jmGrupo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO Estoque");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1445, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/pesquisar.png"))); // NOI18N
        jMenu1.setText("Menu");

        jmProduto.setText("Produto");
        jmProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(jmProduto);

        jmMarca.setText("Marca");
        jmMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMarcaActionPerformed(evt);
            }
        });
        jMenu1.add(jmMarca);

        jmUnidade.setText("Unidade Produto");
        jmUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUnidadeActionPerformed(evt);
            }
        });
        jMenu1.add(jmUnidade);

        jmOrigem.setText("Origem Produto");
        jmOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOrigemActionPerformed(evt);
            }
        });
        jMenu1.add(jmOrigem);

        jmTipo.setText("Tipo Produto");
        jmTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTipoActionPerformed(evt);
            }
        });
        jMenu1.add(jmTipo);

        jmGrupo.setText("Grupo");
        jmGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGrupoActionPerformed(evt);
            }
        });
        jMenu1.add(jmGrupo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdutoActionPerformed
        gerenteDeJanelas.abrirJanelas(ProdutoForm.getInstancia());
    }//GEN-LAST:event_jmProdutoActionPerformed

    private void jmMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMarcaActionPerformed
        gerenteDeJanelas.abrirJanelas(MarcaForm.getInstancia());
    }//GEN-LAST:event_jmMarcaActionPerformed

    private void jmUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUnidadeActionPerformed
        gerenteDeJanelas.abrirJanelas(UnidadeProdutoForm.getInstancia());
    }//GEN-LAST:event_jmUnidadeActionPerformed

    private void jmGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGrupoActionPerformed
        gerenteDeJanelas.abrirJanelas(GrupoForm.getInstancia());
    }//GEN-LAST:event_jmGrupoActionPerformed

    private void jmTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTipoActionPerformed
       gerenteDeJanelas.abrirJanelas(TipoProdutoForm.getInstancia());
    }//GEN-LAST:event_jmTipoActionPerformed

    private void jmOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrigemActionPerformed
        gerenteDeJanelas.abrirJanelas(OrigemProdutoForm.getInstancia());
    }//GEN-LAST:event_jmOrigemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmGrupo;
    private javax.swing.JMenuItem jmMarca;
    private javax.swing.JMenuItem jmOrigem;
    private javax.swing.JMenuItem jmProduto;
    private javax.swing.JMenuItem jmTipo;
    private javax.swing.JMenuItem jmUnidade;
    // End of variables declaration//GEN-END:variables
}
