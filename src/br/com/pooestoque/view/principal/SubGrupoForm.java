package br.com.pooestoque.view.principal;

import br.com.pooestoque.controller.ProdutoCon;
import br.com.pooestoque.controller.SubGrupoCon;
import br.com.pooestoque.model.Grupo;
import br.com.pooestoque.model.Produto;
import br.com.pooestoque.model.SubGrupo;
import br.com.pooestoque.view.adicionar.NovoGeralForm;
import br.com.pooestoque.view.adicionar.NovoSubGrupoDivisaoForm;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author augusto.ortolan
 */
public class SubGrupoForm extends javax.swing.JInternalFrame {

    private DefaultTableModel tabelaModelo;
    private char origem;
    private Integer sizeTab = 1145;
    private SubGrupoCon subGrupoCon = new SubGrupoCon();

    private static SubGrupoForm testeframe;

    public static SubGrupoForm getInstancia() {
        if (testeframe == null) {
            testeframe = new SubGrupoForm();
        }
        return testeframe;
    }

    public SubGrupoForm() {
        initComponents();
        setResizable(false);
        tabela.setModel((new DefaultTableModel(null, new Object[]{"Código", "Descrição", "Grupo", "Situação"})));
        tamanho_colunas();
    }

    public void readJTable() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);

        for (SubGrupo subGrupo : subGrupoCon.getLista()) {
            tabelaModelo.addRow(new Object[]{
                subGrupo.getIdSubGrupo(),
                subGrupo.getDsSubGrupo(),
                subGrupo.getGrupo().getDsGrupo(),
                subGrupo.getStSubGrupo()
            });
        }
    }

    public void readJTableForDescricao() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);

        for (SubGrupo subGrupo : subGrupoCon.getSubGrupoPorNome(txfPesquisar.getText().toUpperCase())) {
            tabelaModelo.addRow(new Object[]{
                subGrupo.getIdSubGrupo(),
                subGrupo.getDsSubGrupo(),
                subGrupo.getGrupo().getDsGrupo(),
                subGrupo.getStSubGrupo()
            });
        }
    }

    public void readJTableForID() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);

        for (SubGrupo subGrupo : subGrupoCon.getSubGrupoPorID(Integer.parseInt(txfPesquisar.getText()))) {
            tabelaModelo.addRow(new Object[]{
                subGrupo.getIdSubGrupo(),
                subGrupo.getDsSubGrupo(),
                subGrupo.getGrupo().getDsGrupo(),
                subGrupo.getStSubGrupo()
            });
        }
    }

    public void readJTableForSituacao() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);

        for (SubGrupo subGrupo : subGrupoCon.getSubGrupoPorSituacao(txfPesquisar.getText())) {
            tabelaModelo.addRow(new Object[]{
                subGrupo.getIdSubGrupo(),
                subGrupo.getDsSubGrupo(),
                subGrupo.getGrupo().getDsGrupo(),
                subGrupo.getStSubGrupo()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfPesquisar = new javax.swing.JTextField();
        bntDireita = new javax.swing.JButton();
        cbxPesquisar = new javax.swing.JComboBox<>();
        btnDireitaFim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        bntNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnEsquerdaFim = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção de SubGrupo");

        bntDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (7).png"))); // NOI18N
        bntDireita.setBorderPainted(false);
        bntDireita.setContentAreaFilled(false);
        bntDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDireitaActionPerformed(evt);
            }
        });

        cbxPesquisar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descrição", "Marca", "Situação" }));

        btnDireitaFim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (8).png"))); // NOI18N
        btnDireitaFim.setBorderPainted(false);
        btnDireitaFim.setContentAreaFilled(false);
        btnDireitaFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaFimActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.setRowHeight(25);
        tabela.setRowMargin(5);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        bntNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/novo.png"))); // NOI18N
        bntNovo.setText("Novo");
        bntNovo.setMaximumSize(new java.awt.Dimension(95, 27));
        bntNovo.setMinimumSize(new java.awt.Dimension(95, 27));
        bntNovo.setPreferredSize(new java.awt.Dimension(95, 27));
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(95, 27));
        btnAlterar.setMinimumSize(new java.awt.Dimension(95, 27));
        btnAlterar.setPreferredSize(new java.awt.Dimension(95, 27));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(95, 27));
        btnExcluir.setMinimumSize(new java.awt.Dimension(95, 27));
        btnExcluir.setPreferredSize(new java.awt.Dimension(95, 27));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(95, 27));
        btnSair.setMinimumSize(new java.awt.Dimension(95, 27));
        btnSair.setPreferredSize(new java.awt.Dimension(95, 27));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (9).png"))); // NOI18N
        btnEsquerda.setBorderPainted(false);
        btnEsquerda.setContentAreaFilled(false);
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        btnEsquerdaFim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/pooestoque/imagens/oie_transparent (10).png"))); // NOI18N
        btnEsquerdaFim.setBorderPainted(false);
        btnEsquerdaFim.setContentAreaFilled(false);
        btnEsquerdaFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaFimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEsquerda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEsquerdaFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDireitaFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntDireita)
                        .addGap(133, 133, 133)
                        .addComponent(bntNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cbxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxPesquisar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEsquerda)
                        .addComponent(bntDireita)
                        .addComponent(btnDireitaFim)
                        .addComponent(btnEsquerdaFim))
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDireitaActionPerformed
        int numeroDeLinhas = tabela.getRowCount();
        int linhaSelecionada = tabela.getSelectedRow();
        if (numeroDeLinhas > 0 && linhaSelecionada < numeroDeLinhas - 1) {
            tabela.setRowSelectionInterval(linhaSelecionada + 1, linhaSelecionada + 1);
        }
    }//GEN-LAST:event_bntDireitaActionPerformed

    private void btnDireitaFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaFimActionPerformed
        int numeroDeLinhas = tabela.getRowCount();
        if (numeroDeLinhas > 0) {
            tabela.setRowSelectionInterval(numeroDeLinhas - 1, numeroDeLinhas - 1);
        }
    }//GEN-LAST:event_btnDireitaFimActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (cbxPesquisar.getSelectedIndex() == 0) {
            try {
                Integer.parseInt(txfPesquisar.getText());
                readJTableForID();
            } catch (java.lang.NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "O campo 'CÓDIGO' requer um número.", "Pesquisa por CÓDIGO", JOptionPane.WARNING_MESSAGE);
                System.out.println(erro);
            }
        } else if (cbxPesquisar.getSelectedIndex() == 1) {
            readJTableForDescricao();
        } else if (cbxPesquisar.getSelectedIndex() == 2) {
            readJTableForSituacao();
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        NovoSubGrupoDivisaoForm janelaNovo = new NovoSubGrupoDivisaoForm("Sub", "Novo") {
        };
        janelaNovo.setTitle("Novo SubGrupo");
        janelaNovo.setModal(true);
        janelaNovo.setLocationRelativeTo(null);
        janelaNovo.setVisible(true);

        SubGrupo subGrupo = janelaNovo.getNovoSubGrupo();
        if (subGrupo != null) {
            // adicionar produto na tabela;
            ((DefaultTableModel) tabela.getModel()).addRow(new Object[]{
                subGrupo.getIdSubGrupo(),
                subGrupo.getDsSubGrupo(),
                subGrupo.getGrupo().getDsGrupo(),
                subGrupo.getStSubGrupo()
            });
        }

    }//GEN-LAST:event_bntNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tabela.getSelectedRow() != -1) {
            SubGrupo subGrupo = subGrupoCon.getSubGrupo((Integer) tabela.getValueAt(tabela.getSelectedRow(), 0));

            NovoSubGrupoDivisaoForm janela = new NovoSubGrupoDivisaoForm("Sub", "Altera") {
            };
            janela.setTitle("Alterar SubGrupo");
            janela.setModal(true);
            janela.setLocationRelativeTo(null);
            janela.setSubGrupoAlterar(subGrupo);
            janela.setVisible(true);

            if (!janela.isVisible()) {
                btnPesquisarActionPerformed(evt);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para alterar.", "Alteração de dados", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != -1) {
            Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                SubGrupo obj = subGrupoCon.getSubGrupo(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                subGrupoCon.excluir(obj);

                DefaultTableModel atividadeExluir = (DefaultTableModel) tabela.getModel();
                atividadeExluir.removeRow(tabela.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para exluir.", "Exlcusão de dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();

    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
        int numeroDeLinhas = tabela.getRowCount();
        int linhaSelecionada = tabela.getSelectedRow();
        if (numeroDeLinhas > 0 && linhaSelecionada != 0) {
            tabela.setRowSelectionInterval(linhaSelecionada - 1, linhaSelecionada - 1);
        }
    }//GEN-LAST:event_btnEsquerdaActionPerformed

    private void btnEsquerdaFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaFimActionPerformed
        int numeroDeLinhas = tabela.getRowCount();
        if (numeroDeLinhas > 0) {
            tabela.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_btnEsquerdaFimActionPerformed

    private void tamanho_colunas() {
        DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
        rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
        rendererDireita.setHorizontalAlignment(SwingConstants.RIGHT);

        DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
        rendererEsquerda.setHorizontalAlignment(SwingConstants.LEFT);

        JTableHeader header = tabela.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        header.setPreferredSize(new Dimension(0, 20));   // define a largura do cabeçalho
        TableColumnModel modeloDaColuna = tabela.getColumnModel();

        modeloDaColuna.getColumn(0).setCellRenderer(rendererDireita);
        modeloDaColuna.getColumn(1).setCellRenderer(rendererEsquerda);
        modeloDaColuna.getColumn(2).setCellRenderer(rendererEsquerda);
        modeloDaColuna.getColumn(3).setCellRenderer(rendererCentro);

        modeloDaColuna.getColumn(0).setMaxWidth((sizeTab * 15) / 100);
        modeloDaColuna.getColumn(1).setMaxWidth((sizeTab * 35) / 100);
        modeloDaColuna.getColumn(2).setMaxWidth((sizeTab * 35) / 100);
        modeloDaColuna.getColumn(3).setMaxWidth((sizeTab * 15) / 100);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDireita;
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDireitaFim;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton btnEsquerdaFim;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txfPesquisar;
    // End of variables declaration//GEN-END:variables
}
