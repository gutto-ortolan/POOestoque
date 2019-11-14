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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
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
        jmSubGrupo = new javax.swing.JMenuItem();
        jmDivisao = new javax.swing.JMenuItem();
        jmFornecedor = new javax.swing.JMenuItem();

        jMenu2.setText("Exibir");

        jMenuItem1.setText("Produto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Origem Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Tipo Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Unidade Produto");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Marca");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Fornecedor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Grupo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("SubGrupo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setText("Divisão");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jPopupMenu1.add(jMenu2);
        jPopupMenu1.add(jSeparator1);

        jMenuItem10.setText("Minimizar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem10);

        jMenuItem11.setText("Fechar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabalho POO Estoque");

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1445, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/window_enter (2).png"))); // NOI18N
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

        jmSubGrupo.setText("SubGrupo");
        jmSubGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSubGrupoActionPerformed(evt);
            }
        });
        jMenu1.add(jmSubGrupo);

        jmDivisao.setText("Divisão");
        jmDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDivisaoActionPerformed(evt);
            }
        });
        jMenu1.add(jmDivisao);

        jmFornecedor.setText("Fornecedor");
        jmFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFornecedorActionPerformed(evt);
            }
        });
        jMenu1.add(jmFornecedor);

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

    private void jmGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGrupoActionPerformed
        gerenteDeJanelas.abrirJanelas(GrupoForm.getInstancia());
    }//GEN-LAST:event_jmGrupoActionPerformed

    private void jmTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTipoActionPerformed
       gerenteDeJanelas.abrirJanelas(TipoProdutoForm.getInstancia());
    }//GEN-LAST:event_jmTipoActionPerformed

    private void jmOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOrigemActionPerformed
        gerenteDeJanelas.abrirJanelas(OrigemProdutoForm.getInstancia());
    }//GEN-LAST:event_jmOrigemActionPerformed

    private void jmFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFornecedorActionPerformed
        gerenteDeJanelas.abrirJanelas(FornecedorForm.getInstancia());
    }//GEN-LAST:event_jmFornecedorActionPerformed

    private void jmSubGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSubGrupoActionPerformed
        gerenteDeJanelas.abrirJanelas(SubGrupoForm.getInstancia());
    }//GEN-LAST:event_jmSubGrupoActionPerformed

    private void jmDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDivisaoActionPerformed
        gerenteDeJanelas.abrirJanelas(DivisaoForm.getInstancia());
    }//GEN-LAST:event_jmDivisaoActionPerformed

    private void jmUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUnidadeActionPerformed
        gerenteDeJanelas.abrirJanelas(UnidadeProdutoForm.getInstancia());
    }//GEN-LAST:event_jmUnidadeActionPerformed

    private void jDesktopPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseReleased
        if(evt.isPopupTrigger()){
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jDesktopPane1MouseReleased

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        setExtendedState(ICONIFIED+MAXIMIZED_BOTH);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gerenteDeJanelas.abrirJanelas(ProdutoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gerenteDeJanelas.abrirJanelas(OrigemProdutoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gerenteDeJanelas.abrirJanelas(TipoProdutoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        gerenteDeJanelas.abrirJanelas(UnidadeProdutoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        gerenteDeJanelas.abrirJanelas(MarcaForm.getInstancia());
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        gerenteDeJanelas.abrirJanelas(FornecedorForm.getInstancia());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        gerenteDeJanelas.abrirJanelas(GrupoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        gerenteDeJanelas.abrirJanelas(SubGrupoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        gerenteDeJanelas.abrirJanelas(DivisaoForm.getInstancia());
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmDivisao;
    private javax.swing.JMenuItem jmFornecedor;
    private javax.swing.JMenuItem jmGrupo;
    private javax.swing.JMenuItem jmMarca;
    private javax.swing.JMenuItem jmOrigem;
    private javax.swing.JMenuItem jmProduto;
    private javax.swing.JMenuItem jmSubGrupo;
    private javax.swing.JMenuItem jmTipo;
    private javax.swing.JMenuItem jmUnidade;
    // End of variables declaration//GEN-END:variables
}
