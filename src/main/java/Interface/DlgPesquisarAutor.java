package Interface;

import Controller.InterfaceController;
import Domain.Autor;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AMANDA MERELIS
 */
public class DlgPesquisarAutor extends javax.swing.JDialog {

    private InterfaceController interfaceController;
    private Autor autorSelecionado;

    public DlgPesquisarAutor(java.awt.Frame parent, boolean modal, InterfaceController interfaceController) {
        super(parent, modal);
        initComponents();
        this.interfaceController = interfaceController;
        autorSelecionado = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutores = new javax.swing.JTable();
        btnSelecionar3 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 102));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaceGrafica/images/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome completo", "Data Nascimento", "Quantidade de livros cadastrados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAutores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAutores);

        btnSelecionar3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSelecionar3.setForeground(new java.awt.Color(0, 102, 51));
        btnSelecionar3.setText("SELECIONAR");
        btnSelecionar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionar3ActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 0, 0));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar por nome:");

        btnRelatorio.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRelatorio.setText("GERAR RELATÓRIO");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRelatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecionar3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar3)
                    .addComponent(btnExcluir)
                    .addComponent(btnRelatorio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Autor getAutor() {
        return autorSelecionado;
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        // LISTA VAI RECEBER O RESULTADO DA PESQUISA
        List<Autor> lista = interfaceController.getDomainController().pesquisarAutores(txtPesq.getText().toUpperCase());
        // SETANDO O NÚMERO DE LINHAS DA TABELA PARA ZERO
        ((DefaultTableModel) tblAutores.getModel()).setNumRows(0);
        for (Autor autor : lista) {
            try {
                //ADICIONANDO OS AUTORES NA TABELA APÓS PESQUISA
                ((DefaultTableModel) tblAutores.getModel()).addRow(autor.toArray());
            } catch (ParseException ex) {
                Logger.getLogger(DlgPesquisarAutor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSelecionar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionar3ActionPerformed
        int linha = tblAutores.getSelectedRow();
        if (linha >= 0) {
            autorSelecionado = (Autor) tblAutores.getValueAt(linha, 0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Pesquisar autor", JOptionPane.ERROR_MESSAGE);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnSelecionar3ActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        int linha = tblAutores.getSelectedRow();

        try {
            if (linha >= 0) {
                if (JOptionPane.showConfirmDialog(
                        this,
                        "Deseja realmente excluir?",
                        "Excluir Autor",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    interfaceController.getDomainController().excluir((Autor) tblAutores.getValueAt(linha, 0));
                    ((DefaultTableModel) tblAutores.getModel()).removeRow(linha);

                    JOptionPane.showMessageDialog(this, "Autor excluído com sucesso.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Para excluir, selecione uma linha\n");
            }
        } catch (PersistenceException erro) {
            JOptionPane.showMessageDialog(this, "Não foi possível excluir este autor pois ele possui livros cadastrados.\n");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        autorSelecionado = null;
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ((DefaultTableModel) tblAutores.getModel()).setNumRows(0);
    }//GEN-LAST:event_formComponentShown

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            List<Autor> autores = interfaceController.getDomainController().pesquisarAutores(txtPesq.getText().toUpperCase());
            interfaceController.getReportController().relatorioComLista(autores, "livrosPorAutor.jasper");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnSelecionar3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutores;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
}
