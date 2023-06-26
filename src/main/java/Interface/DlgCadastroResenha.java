package Interface;

import Controller.InterfaceController;
import Domain.Livro;
import Domain.Resenha;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DlgCadastroResenha extends javax.swing.JDialog {

    private InterfaceController interfaceController;
    private Resenha resenhaSelecionada;

    public DlgCadastroResenha(java.awt.Frame parent, boolean modal, InterfaceController interfaceController) {
        super(parent, modal);
        this.interfaceController = interfaceController;
        initComponents();
        popularComboBoxAvaliacao();
        habilitarBotoes();
    }

    private void popularComboBoxAvaliacao() {
        DefaultComboBoxModel model;
        String[] avaliacao = new String[]{"1 ESTRELA", "2 ESTRELAS", "3 ESTRELAS", "4 ESTRELAS", "5 ESTRELAS"};
        model = new DefaultComboBoxModel(avaliacao);
        comboBoxAvaliacao.setModel(model);
        comboBoxAvaliacao.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        comboBoxLivros = new javax.swing.JComboBox();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        pnlAvaliacao = new javax.swing.JPanel();
        lblAvaliacao = new javax.swing.JLabel();
        comboBoxAvaliacao = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        lblTituloDaPagina = new javax.swing.JLabel();
        pnlResenha = new javax.swing.JPanel();
        lblResenha = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResenha = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Store MaBook - Cadastro de nova leitura");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnlTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setText("Título");

        comboBoxLivros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxLivrosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxLivros, 0, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAutor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAutor.setText("Autor");

        txtAutor.setEnabled(false);

        javax.swing.GroupLayout pnlAutorLayout = new javax.swing.GroupLayout(pnlAutor);
        pnlAutor.setLayout(pnlAutorLayout);
        pnlAutorLayout.setHorizontalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAutorLayout.createSequentialGroup()
                        .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAutor))
                .addContainerGap())
        );
        pnlAutorLayout.setVerticalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAvaliacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAvaliacao.setText("Avaliação");

        javax.swing.GroupLayout pnlAvaliacaoLayout = new javax.swing.GroupLayout(pnlAvaliacao);
        pnlAvaliacao.setLayout(pnlAvaliacaoLayout);
        pnlAvaliacaoLayout.setHorizontalGroup(
            pnlAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAvaliacaoLayout.createSequentialGroup()
                        .addComponent(lblAvaliacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxAvaliacao, 0, 184, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAvaliacaoLayout.setVerticalGroup(
            pnlAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAvaliacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 51, 153));
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTituloDaPagina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloDaPagina.setText("StoreMaBook - Resenha");

        pnlResenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblResenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResenha.setText("Resenha");

        txtResenha.setColumns(20);
        txtResenha.setLineWrap(true);
        txtResenha.setRows(5);
        jScrollPane2.setViewportView(txtResenha);

        javax.swing.GroupLayout pnlResenhaLayout = new javax.swing.GroupLayout(pnlResenha);
        pnlResenha.setLayout(pnlResenhaLayout);
        pnlResenhaLayout.setHorizontalGroup(
            pnlResenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlResenhaLayout.createSequentialGroup()
                        .addComponent(lblResenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pnlResenhaLayout.setVerticalGroup(
            pnlResenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResenhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(204, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlResenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTituloDaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(156, 156, 156)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnlAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloDaPagina)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlResenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Livro livro = (Livro) comboBoxLivros.getSelectedItem();
        String avaliacao = (String) comboBoxAvaliacao.getSelectedItem();
        int avaliacaoEmNumero = 0;
        switch(avaliacao){
                case "1 ESTRELA": avaliacaoEmNumero = 1;break;
                case "2 ESTRELAS": avaliacaoEmNumero = 2;break;
                case "3 ESTRELAS": avaliacaoEmNumero = 3;break;
                case "4 ESTRELAS": avaliacaoEmNumero = 4;break;
                case "5 ESTRELAS": avaliacaoEmNumero = 5;break;
            }
        String texto = txtResenha.getText();
        Date data = new Date();

        if (validarDados()) {
            if (resenhaSelecionada == null) {
                //INSERE A RESENHA
                int id = interfaceController.getDomainController().inserirResenha(avaliacaoEmNumero, texto, data, livro);
                JOptionPane.showMessageDialog(this, "Resenha (" + id + ") inserida com sucesso.", "Inserir Resenha", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //ALTERA A RESENHA
                interfaceController.getDomainController().alterarResenha(resenhaSelecionada, avaliacaoEmNumero, texto, livro, data);
                JOptionPane.showMessageDialog(this, "Resenha (" + resenhaSelecionada.getId() + ") alterada com sucesso.", "Alterar Resenha", JOptionPane.INFORMATION_MESSAGE);
            }
            limparCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        resenhaSelecionada = interfaceController.abrirPesquisarResenha();
        if (resenhaSelecionada != null) {
            preencherCampos(resenhaSelecionada);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        interfaceController.carregarComboBoxLivros(comboBoxLivros);
        comboBoxLivros.setSelectedIndex(-1);
        txtAutor.setText("");
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparCampos();
    }//GEN-LAST:event_formWindowClosed

    private void comboBoxLivrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxLivrosItemStateChanged
        if(comboBoxLivros.getSelectedItem() != null){
            Livro livro = (Livro) comboBoxLivros.getSelectedItem();
            txtAutor.setText(livro.getAutor().getNome());
        } else {
            txtAutor.setText("");
        }
    }//GEN-LAST:event_comboBoxLivrosItemStateChanged

    private void preencherCampos(Resenha resenha) {
        if (resenha != null) {
            comboBoxLivros.setSelectedItem((Livro) resenha.getLivro());
            txtAutor.setText(resenha.getLivro().getAutor().getNome());
            txtResenha.setText(resenha.getTexto());
            switch(resenha.getAvaliacao()){
                case 1: comboBoxAvaliacao.setSelectedItem("1 ESTRELA");break;
                case 2: comboBoxAvaliacao.setSelectedItem("2 ESTRELAS");break;
                case 3: comboBoxAvaliacao.setSelectedItem("3 ESTRELAS");break;
                case 4: comboBoxAvaliacao.setSelectedItem("4 ESTRELAS");break;
                case 5: comboBoxAvaliacao.setSelectedItem("5 ESTRELAS");break;
            }
            
            habilitarBotoes();
        }
    }

    public void habilitarBotoes() {
        if (resenhaSelecionada == null) {
            btnSalvar.setVisible(true);
            btnAlterar.setVisible(false);
        } else {
            btnSalvar.setVisible(false);
            btnAlterar.setVisible(true);
        }
    }

    private void limparCampos() {
        comboBoxLivros.setSelectedIndex(-1);
        txtAutor.setText("");
        comboBoxAvaliacao.setSelectedIndex(-1);
        txtResenha.setText("");
        resenhaSelecionada = null;
        habilitarBotoes();
    }

    private boolean validarDados() {
        String msgErro = "";
        boolean validado = true;

        if (comboBoxLivros.getSelectedItem() == null) {
            msgErro = msgErro + "É obrigatório escolher um livro.\n";
            validado = false;
        }

        if (txtResenha.getText().length() < 50) {
            msgErro = msgErro + "A resenha deve conter no mínimo 50 caracteres.\n";
            validado = false;
        }

        if (comboBoxAvaliacao.getSelectedItem() == null) {
            msgErro = msgErro + "É obrigatório escolher uma avaliação.\n";
            validado = false;
        }

        if (validado) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro, "ERRO: RESENHA", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboBoxAvaliacao;
    private javax.swing.JComboBox comboBoxLivros;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblResenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloDaPagina;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlAvaliacao;
    private javax.swing.JPanel pnlResenha;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextArea txtResenha;
    // End of variables declaration//GEN-END:variables
}
