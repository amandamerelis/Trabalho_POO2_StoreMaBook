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
        String[] avaliacao = new String[]{"1 Estrela", "2 Estrelas", "3 Estrelas", "4 Estrelas", "5 Estrelas"};
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
        comboBoxTitulos = new javax.swing.JComboBox<>();
        pnlAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        pnlAvaliacao = new javax.swing.JPanel();
        lblAvaliacao = new javax.swing.JLabel();
        comboBoxAvaliacao = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        lblTituloDaPagina = new javax.swing.JLabel();
        pnlResenha = new javax.swing.JPanel();
        lblResenha = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResenha = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Store MaBook - Cadastro de nova leitura");
        setResizable(false);

        pnlTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitulo.setText("Título");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxTitulos, 0, 576, Short.MAX_VALUE)
                    .addGroup(pnlTituloLayout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlResenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pnlAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloDaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTituloDaPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlResenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboBoxAvaliacao;
    private javax.swing.JComboBox<String> comboBoxTitulos;
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
