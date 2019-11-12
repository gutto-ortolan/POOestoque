package br.com.pooestoque.view.adicionar;

import br.com.pooestoque.controller.GrupoCon;
import br.com.pooestoque.controller.MarcaCon;
import br.com.pooestoque.controller.OrigemProdutoCon;
import br.com.pooestoque.controller.TipoProdutoCon;
import br.com.pooestoque.controller.UnidadeProdutoCon;
import br.com.pooestoque.model.Grupo;
import br.com.pooestoque.model.Marca;
import br.com.pooestoque.model.OrigemProduto;
import br.com.pooestoque.model.TipoProduto;
import br.com.pooestoque.model.UnidadeProduto;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto.ortolan
 */
public class NovoGeralForm extends javax.swing.JDialog {

    private Marca marca = new Marca();
    private OrigemProduto origemProduto = new OrigemProduto();
    private TipoProduto tipoProduto = new TipoProduto();
    private UnidadeProduto unidadeProduto = new UnidadeProduto();
    private Grupo grupo = new Grupo();
    private final MarcaCon marcaCon = new MarcaCon();
    private final OrigemProdutoCon origemProdutoCon = new OrigemProdutoCon();
    private final TipoProdutoCon tipoProdutoCon = new TipoProdutoCon();
    private final UnidadeProdutoCon unidadeProdutoCon = new UnidadeProdutoCon();
    private final GrupoCon grupoCon = new GrupoCon();
    private final String origemClasse;
    private String origemBtn;
    
    public NovoGeralForm(String origem, String origemb) {
        initComponents();
        origemClasse = origem;
        origemBtn = origemb;
    }
    
    public NovoGeralForm(String origem){
        initComponents();
        origemClasse = origem;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblCodigo = new javax.swing.JLabel();
        txfCodigo = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        cbxSituacao = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        txfDescricao = new javax.swing.JTextField();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 250));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 50, 0, 0);
        getContentPane().add(lblCodigo, gridBagConstraints);

        txfCodigo.setEditable(false);
        txfCodigo.setColumns(5);
        txfCodigo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(92, 5, 0, 0);
        getContentPane().add(txfCodigo, gridBagConstraints);

        lblSituacao.setText("Situação*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 122, 0, 0);
        getContentPane().add(lblSituacao, gridBagConstraints);

        cbxSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(92, 5, 0, 0);
        getContentPane().add(cbxSituacao, gridBagConstraints);

        lblDescricao.setText("Descrição*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 50, 0, 0);
        getContentPane().add(lblDescricao, gridBagConstraints);

        txfDescricao.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 365;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 46);
        getContentPane().add(txfDescricao, gridBagConstraints);

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
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 47, 90, 0);
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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 10, 90, 0);
        getContentPane().add(btnCancelar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if(txfDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        separaPorOrigemGravar(origemClasse, origemBtn);
    }//GEN-LAST:event_bntGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        separaPorOrigemCancelar(origemClasse);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxSituacao;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfDescricao;
    // End of variables declaration//GEN-END:variables

    public void separaPorOrigemGravar(String origem, String origemBtn) {
        if (origem.equals("Unidade")) {
            UnidadeProduto u = new UnidadeProduto();
            u.setDsUnidade(txfDescricao.getText().toUpperCase());
            u.setStUnidade(cbxSituacao.getSelectedItem().toString().toUpperCase());
            if(origemBtn.equals("Novo")){
               unidadeProdutoCon.incluir(u); 
            }else if(origemBtn.equals("Altera")){
                u.setIdUnidade(Integer.parseInt(txfCodigo.getText()));
                unidadeProdutoCon.alterar(u);
                
            }
            this.unidadeProduto = u;
        } else if (origem.equals("Tipo")) {
            TipoProduto t = new TipoProduto();
            t.setDsTipoProduto(txfDescricao.getText().toUpperCase());
            t.setStTipoProduto(cbxSituacao.getSelectedItem().toString().toUpperCase());
            if(origemBtn.equals("Novo")){
               tipoProdutoCon.incluir(t); 
            }else if(origemBtn.equals("Altera")){
                t.setIdTipoProduto(Integer.parseInt(txfCodigo.getText()));
                tipoProdutoCon.alterar(t);
            }
            this.tipoProduto = t;
        } else if (origem.equals("Grupo")) {
            Grupo g = new Grupo();
            g.setDsGrupo(txfDescricao.getText().toUpperCase());
            g.setStGrupo(cbxSituacao.getSelectedItem().toString().toUpperCase());
            if(origemBtn.equals("Novo")){
               grupoCon.incluir(g); 
            }else if(origemBtn.equals("Altera")){
                g.setIdGrupo(Integer.parseInt(txfCodigo.getText()));
                grupoCon.alterar(g);
            }
            this.grupo = g;
        } else if (origem.equals("Origem")) {
            OrigemProduto o = new OrigemProduto();
            o.setDsOrigem(txfDescricao.getText().toUpperCase());
            o.setStOrigem(cbxSituacao.getSelectedItem().toString().toUpperCase());
            if(origemBtn.equals("Novo")){
               origemProdutoCon.incluir(o); 
            }else if(origemBtn.equals("Altera")){
                o.setIdOrigem(Integer.parseInt(txfCodigo.getText()));
                origemProdutoCon.alterar(o);
            }
            this.origemProduto = o;
        } else if (origem.equals("Marca")) {
            Marca m = new Marca();
            m.setDsMarca(txfDescricao.getText().toUpperCase());
            m.setStMarca(cbxSituacao.getSelectedItem().toString().toUpperCase());
            if(origemBtn.equals("Novo")){
               marcaCon.incluir(m); 
            }else if(origemBtn.equals("Altera")){
                m.setIdMarca(Integer.parseInt(txfCodigo.getText()));
                marcaCon.alterar(m);
            }
            this.marca = m;
        }
        dispose();
    }

    public void separaPorOrigemCancelar(String origem) {
        if (origem.equals("Unidade")) {
            this.unidadeProduto = null;
        } else if (origem.equals("Tipo")) {
            this.tipoProduto = null;
        } else if (origem.equals("Grupo")) {
            this.grupo = null;
        } else if (origem.equals("Origem")) {
            this.origemProduto = null;
        } else if (origem.equals("Marca")) {
            this.marca = null;
        }
        dispose();
    }
    
    public Marca getNovoMarca() {
        return marca;
    }
    
    public Grupo getNovoGrupo() {
        return grupo;
    }
    
    public TipoProduto getNovoTipoProduto() {
        return tipoProduto;
    }
    
    public OrigemProduto getNovoOrigemProduto() {
        return origemProduto;
    }
    
    public UnidadeProduto getNovoUnidadeProduto() {
        return unidadeProduto;
    }
    
    public void setMarcaAlterar(Marca obj) {
        txfCodigo.setText(String.valueOf(obj.getIdMarca()));
        txfDescricao.setText(obj.getDsMarca());
        cbxSituacao.setSelectedItem(obj.getStMarca());
        
    }
    
    public void setGrupoAlterar(Grupo obj) {
        txfCodigo.setText(String.valueOf(obj.getIdGrupo()));
        txfDescricao.setText(obj.getDsGrupo());
        cbxSituacao.setSelectedItem(obj.getStGrupo());
        
    }
    
    public void setTipoProdutoAlterar(TipoProduto obj) {
        txfCodigo.setText(String.valueOf(obj.getIdTipoProduto()));
        txfDescricao.setText(obj.getDsTipoProduto());
        cbxSituacao.setSelectedItem(obj.getStTipoProduto());
        
    }
    
    public void setOrigemProdutoAlterar(OrigemProduto obj) {
        txfCodigo.setText(String.valueOf(obj.getIdOrigem()));
        txfDescricao.setText(obj.getDsOrigem());
        cbxSituacao.setSelectedItem(obj.getStOrigem());
        
    }
    
    public void setUnidadeProdutoAlterar(UnidadeProduto obj) {
        txfCodigo.setText(String.valueOf(obj.getIdUnidade()));
        txfDescricao.setText(obj.getDsUnidade());
        cbxSituacao.setSelectedItem(obj.getStUnidade());
    }
    
    
}
