package Interface;

import Controller.InterfaceController;
import javax.swing.DefaultComboBoxModel;

public class DlgDadosLeitura extends javax.swing.JDialog {

    private InterfaceController interfaceController;

    public DlgDadosLeitura(java.awt.Frame parent, boolean modal, InterfaceController interfaceController) {
        super(parent, modal);
        this.interfaceController = interfaceController;
        initComponents();
        popularComboBoxes();
        comboBoxAvaliacao.setEnabled(false);
    }
    
    private void popularComboBoxes() {
        DefaultComboBoxModel model;
        String[] generos = new String[]{"Conto", "Fantasia", "Infantil", "Não ficção", "Romance", "Sci-Fi", "Terror"};
        String[] status = new String[]{"Não iniciada", "Em andamento", "Concluída"};
        String[] avaliacao = new String[]{"1 Estrela", "2 Estrelas", "3 Estrelas", "4 Estrelas", "5 Estrelas"};

        model = new DefaultComboBoxModel(generos);
        comboBoxGenero.setModel(model);
        model = new DefaultComboBoxModel(status);
        comboBoxStatus.setModel(model);
        model = new DefaultComboBoxModel(avaliacao);
        comboBoxAvaliacao.setModel(model);
        

    }

    /* Função de população da ComboBox que será usada futuramente
    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
        DefaultComboBoxModel modelGenero;
        try {
            modelGenero = new DefaultComboBoxModel(listarGeneros().toArray());
            comboBoxGenero.setModel(modelGenero);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados.\n" + ex.getMessage());
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        campoObrigatorio1 = new javax.swing.JLabel();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        campoObrigatorio = new javax.swing.JLabel();
        pnlGenero = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        comboBoxGenero = new javax.swing.JComboBox<>();
        campoObrigatorio2 = new javax.swing.JLabel();
        pnlStatus = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();
        campoObrigatorio3 = new javax.swing.JLabel();
        pnlAvaliacao = new javax.swing.JPanel();
        lblAvaliacao = new javax.swing.JLabel();
        comboBoxAvaliacao = new javax.swing.JComboBox<>();
        pnlSinopse = new javax.swing.JPanel();
        lblSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSinopse = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        lblTituloDaPagina = new javax.swing.JLabel();
        campoObrigatorio4 = new javax.swing.JLabel();
        pnlComentario = new javax.swing.JPanel();
        lblComentario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaComentario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Store MaBook - Cadastro de nova leitura");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setText("Título");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        campoObrigatorio1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoObrigatorio1.setForeground(new java.awt.Color(204, 0, 51));
        campoObrigatorio1.setText("*");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoObrigatorio1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(campoObrigatorio1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAutor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAutor.setText("Autor");

        campoObrigatorio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoObrigatorio.setForeground(new java.awt.Color(204, 0, 51));
        campoObrigatorio.setText("*");

        javax.swing.GroupLayout pnlAutorLayout = new javax.swing.GroupLayout(pnlAutor);
        pnlAutor.setLayout(pnlAutorLayout);
        pnlAutorLayout.setHorizontalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAutorLayout.createSequentialGroup()
                        .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoObrigatorio)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAutorLayout.setVerticalGroup(
            pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(campoObrigatorio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblGenero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGenero.setText("Gênero");

        comboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        campoObrigatorio2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoObrigatorio2.setForeground(new java.awt.Color(204, 0, 51));
        campoObrigatorio2.setText("*");

        javax.swing.GroupLayout pnlGeneroLayout = new javax.swing.GroupLayout(pnlGenero);
        pnlGenero.setLayout(pnlGeneroLayout);
        pnlGeneroLayout.setHorizontalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeneroLayout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoObrigatorio2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxGenero, 0, 176, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlGeneroLayout.setVerticalGroup(
            pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(campoObrigatorio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStatus.setText("Status da leitura");

        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStatusActionPerformed(evt);
            }
        });

        campoObrigatorio3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campoObrigatorio3.setForeground(new java.awt.Color(204, 0, 51));
        campoObrigatorio3.setText("*");

        javax.swing.GroupLayout pnlStatusLayout = new javax.swing.GroupLayout(pnlStatus);
        pnlStatus.setLayout(pnlStatusLayout);
        pnlStatusLayout.setHorizontalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlStatusLayout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoObrigatorio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStatusLayout.setVerticalGroup(
            pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(campoObrigatorio3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAvaliacao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAvaliacao.setText("Avaliação");

        comboBoxAvaliacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlAvaliacaoLayout = new javax.swing.GroupLayout(pnlAvaliacao);
        pnlAvaliacao.setLayout(pnlAvaliacaoLayout);
        pnlAvaliacaoLayout.setHorizontalGroup(
            pnlAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAvaliacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAvaliacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvaliacao)
                    .addComponent(comboBoxAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        pnlSinopse.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSinopse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSinopse.setText("Sinopse");

        txtAreaSinopse.setColumns(20);
        txtAreaSinopse.setRows(5);
        jScrollPane1.setViewportView(txtAreaSinopse);

        javax.swing.GroupLayout pnlSinopseLayout = new javax.swing.GroupLayout(pnlSinopse);
        pnlSinopse.setLayout(pnlSinopseLayout);
        pnlSinopseLayout.setHorizontalGroup(
            pnlSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinopseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSinopseLayout.createSequentialGroup()
                        .addComponent(lblSinopse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSinopseLayout.setVerticalGroup(
            pnlSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinopseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSinopse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
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
        lblTituloDaPagina.setText("Cadastro de nova leitura");

        campoObrigatorio4.setForeground(new java.awt.Color(204, 0, 51));
        campoObrigatorio4.setText("* Campos obrigatórios");

        pnlComentario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblComentario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblComentario.setText("Comentários");

        txtAreaComentario.setColumns(20);
        txtAreaComentario.setRows(5);
        jScrollPane2.setViewportView(txtAreaComentario);

        javax.swing.GroupLayout pnlComentarioLayout = new javax.swing.GroupLayout(pnlComentario);
        pnlComentario.setLayout(pnlComentarioLayout);
        pnlComentarioLayout.setHorizontalGroup(
            pnlComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComentarioLayout.createSequentialGroup()
                        .addComponent(lblComentario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pnlComentarioLayout.setVerticalGroup(
            pnlComentarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComentarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(pnlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(pnlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pnlComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblTituloDaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(campoObrigatorio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(231, 231, 231)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTituloDaPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAvaliacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar)
                    .addComponent(campoObrigatorio4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void comboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStatusActionPerformed
        if(comboBoxStatus.getSelectedItem() == "Concluída"){
            comboBoxAvaliacao.setEnabled(true);
        }
        else{
            comboBoxAvaliacao.setEnabled(false);
        }
    }//GEN-LAST:event_comboBoxStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel campoObrigatorio;
    private javax.swing.JLabel campoObrigatorio1;
    private javax.swing.JLabel campoObrigatorio2;
    private javax.swing.JLabel campoObrigatorio3;
    private javax.swing.JLabel campoObrigatorio4;
    private javax.swing.JComboBox<String> comboBoxAvaliacao;
    private javax.swing.JComboBox<String> comboBoxGenero;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblComentario;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblSinopse;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloDaPagina;
    private javax.swing.JPanel pnlAutor;
    private javax.swing.JPanel pnlAvaliacao;
    private javax.swing.JPanel pnlComentario;
    private javax.swing.JPanel pnlGenero;
    private javax.swing.JPanel pnlSinopse;
    private javax.swing.JPanel pnlStatus;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextArea txtAreaComentario;
    private javax.swing.JTextArea txtAreaSinopse;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
