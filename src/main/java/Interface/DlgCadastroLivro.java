package Interface;

import Controller.FuncoesUteis;
import Controller.InterfaceController;
import Domain.Autor;
import Domain.Genero;
import Domain.Livro;
import java.awt.Image;
import java.io.File;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AMANDA MERELIS
 */
public class DlgCadastroLivro extends javax.swing.JDialog {

    private InterfaceController interfaceController;
    private Livro livroSelecionado;

    /**
     * Creates new form DlgCadastroLivro
     */
    public DlgCadastroLivro(java.awt.Frame parent, boolean modal, InterfaceController interfaceController) {
        super(parent, modal);
        initComponents();
        this.interfaceController = interfaceController;
        livroSelecionado = null;
        habilitarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloDaPagina = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        pnlDataLancamento = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        comboBoxAutores = new javax.swing.JComboBox();
        pnlSinopse = new javax.swing.JPanel();
        lblSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSinopse = new javax.swing.JTextArea();
        pnlCapa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCapa = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblGenero = new javax.swing.JLabel();
        comboBoxGeneros = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        pnlDataLancamento1 = new javax.swing.JPanel();
        lblDataLancamento = new javax.swing.JLabel();
        txtDataLancamento = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StoreMaBook - Livros");
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

        lblTituloDaPagina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTituloDaPagina.setText("StoreMaBook - Livro");

        pnlTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTitulo.setText("Título");

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
                    .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDataLancamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAutor.setText("Autor(a)");

        javax.swing.GroupLayout pnlDataLancamentoLayout = new javax.swing.GroupLayout(pnlDataLancamento);
        pnlDataLancamento.setLayout(pnlDataLancamentoLayout);
        pnlDataLancamentoLayout.setHorizontalGroup(
            pnlDataLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataLancamentoLayout.createSequentialGroup()
                        .addComponent(lblAutor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxAutores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDataLancamentoLayout.setVerticalGroup(
            pnlDataLancamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLancamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlSinopse.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSinopse.setText("Sinopse");

        txtSinopse.setColumns(20);
        txtSinopse.setLineWrap(true);
        txtSinopse.setRows(5);
        jScrollPane1.setViewportView(txtSinopse);

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
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlSinopseLayout.setVerticalGroup(
            pnlSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSinopseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSinopse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Capa");

        lblCapa.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblCapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapa.setText("CLIQUE PARA INSERIR");
        lblCapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCapaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCapaLayout = new javax.swing.GroupLayout(pnlCapa);
        pnlCapa.setLayout(pnlCapaLayout);
        pnlCapaLayout.setHorizontalGroup(
            pnlCapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlCapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlCapaLayout.setVerticalGroup(
            pnlCapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapa, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(0, 51, 153));
        btnNovo.setText("CADASTRAR");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblGenero.setText("Gênero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboBoxGeneros, 0, 241, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 0, 102));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaceGrafica/images/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        pnlDataLancamento1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDataLancamento.setText("Data lançamento");

        try {
            txtDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**/**/****")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDataLancamento1Layout = new javax.swing.GroupLayout(pnlDataLancamento1);
        pnlDataLancamento1.setLayout(pnlDataLancamento1Layout);
        pnlDataLancamento1Layout.setHorizontalGroup(
            pnlDataLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLancamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataLancamento)
                    .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnlDataLancamento1Layout.setVerticalGroup(
            pnlDataLancamento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLancamento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataLancamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
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
                        .addComponent(lblTituloDaPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(299, 299, 299)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlDataLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(160, 160, 160)
                                .addComponent(btnAlterar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlDataLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlSinopse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnNovo))
                            .addComponent(pnlCapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloDaPagina)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlDataLancamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pnlCapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNovo)
                            .addComponent(btnCancelar)
                            .addComponent(btnAlterar)))
                    .addComponent(pnlDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCapa(Icon ic) {
        // Redimensionar
        ImageIcon imagem = (ImageIcon) ic;
        imagem.setImage(imagem.getImage().getScaledInstance(lblCapa.getWidth(), lblCapa.getHeight(), Image.SCALE_DEFAULT));

        lblCapa.setText("");
        lblCapa.setIcon(imagem);
    }

    public void habilitarBotoes() {
        if (livroSelecionado == null) {
            btnNovo.setVisible(true);
            btnAlterar.setVisible(false);
        } else {
            btnNovo.setVisible(false);
            btnAlterar.setVisible(true);
        }
    }

    private void limparCampos() {
        txtTitulo.setText("");
        txtSinopse.setText("");
        txtDataLancamento.setText("");
        comboBoxAutores.setSelectedIndex(-1);
        comboBoxGeneros.setSelectedIndex(-1);
        lblCapa.setText("CLIQUE PARA INSERIR");
        lblCapa.setIcon(null);
        livroSelecionado = null;
        habilitarBotoes();
    }

    private boolean validarDados() {
        String msgErro = "";
        boolean validado = true;

        if (txtTitulo.getText().isEmpty()) {
            msgErro = msgErro + "Digite o título.\n";
            validado = false;
        }

        if (comboBoxAutores.getSelectedItem() == null) {
            msgErro = msgErro + "É obrigatório escolher um autor.\n";
            validado = false;
        }

        if (comboBoxGeneros.getSelectedItem() == null) {
            msgErro = msgErro + "É obrigatório escolher um gênero.\n";
            validado = false;
        }

        if (txtSinopse.getText().isEmpty()) {
            msgErro = msgErro + "Digite a sinopse.\n";
            validado = false;
        }

        try {
            Date dtLancamento = FuncoesUteis.strToDate(txtDataLancamento.getText());
        } catch (ParseException ex) {
            msgErro = msgErro + "Data inválida.\n";
            validado = false;
        }

        if (validado) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, msgErro, "ERRO: LIVRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void preencherCampos(Livro livro) throws ParseException {
        if (livroSelecionado != null) {
            txtTitulo.setText(livro.getTitulo());
            comboBoxAutores.setSelectedItem(livroSelecionado.getAutor());
            comboBoxGeneros.setSelectedItem(livro.getGenero());
            txtDataLancamento.setText(livro.getFormattedDataLancamento());
            txtSinopse.setText(livro.getSinopse());

            if (livro.getCapa() != null) {
                ImageIcon imagem = new ImageIcon(livro.getCapa());
                mostrarCapa(imagem);
            } else {
                lblCapa.setText("CLIQUE PARA INSERIR");
                lblCapa.setIcon(null);
            }
            habilitarBotoes();
        }
    }

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        livroSelecionado = interfaceController.abrirPesquisarLivro();
        if (livroSelecionado != null) {
            try {
                System.out.println("Livro: " + livroSelecionado.getTitulo() + ". Autor: "
                        + livroSelecionado.getAutor() + ". Genero: " + livroSelecionado.getGenero() + ". Objeto: " + livroSelecionado);
                preencherCampos(livroSelecionado);
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, ex, "ERRO: LIVRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        String titulo = txtTitulo.getText();
        Autor autor = (Autor) comboBoxAutores.getSelectedItem();
        Genero genero = (Genero) comboBoxGeneros.getSelectedItem();
        String strDataLancamento = txtDataLancamento.getText();
        String sinopse = txtSinopse.getText();
        Icon capaIcon = lblCapa.getIcon();

        if (validarDados()) {
            try {
                Date dataLancamento = FuncoesUteis.strToDate(strDataLancamento);

                byte[] capa = FuncoesUteis.IconToBytes(capaIcon);

                if (livroSelecionado == null) {
                    //INSERE O LIVRO
                    int id = interfaceController.getDomainController().inserirLivro(titulo.toUpperCase(), dataLancamento, sinopse, capa, autor, genero);
                    JOptionPane.showMessageDialog(this, "Livro (" + id + ") inserido com sucesso.", "Inserir Livro", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    interfaceController.getDomainController().alterarLivro(livroSelecionado, titulo.toUpperCase(), dataLancamento, sinopse, capa, autor, genero);
                    JOptionPane.showMessageDialog(this, "Livro (" + livroSelecionado.getId() + ") alterado com sucesso.", "Alterar Livro", JOptionPane.INFORMATION_MESSAGE);
                }
                limparCampos();
            } catch (ParseException ex) {
                Logger.getLogger(DlgCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void lblCapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCapaMouseClicked
        JFileChooser janelaArquivo = new JFileChooser();

        janelaArquivo.setAcceptAllFileFilterUsed(false);
        janelaArquivo.setFileFilter(new FileNameExtensionFilter("Arquivos de imagem", "jpg", "png", "gif", "bmp"));
        janelaArquivo.addChoosableFileFilter(new FileNameExtensionFilter("Arquivos de texto", "txt", "doc", "docx"));

        if (janelaArquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File arquivo = janelaArquivo.getSelectedFile();
            Icon imagem = new ImageIcon(arquivo.getAbsolutePath());
            mostrarCapa(imagem);
        }


    }//GEN-LAST:event_lblCapaMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        interfaceController.carregarComboBox(comboBoxAutores, Autor.class);
        interfaceController.carregarComboBox(comboBoxGeneros, Genero.class);
        comboBoxAutores.setSelectedIndex(-1);
        comboBoxGeneros.setSelectedIndex(-1);
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limparCampos();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox comboBoxAutores;
    private javax.swing.JComboBox comboBoxGeneros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCapa;
    private javax.swing.JLabel lblDataLancamento;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblSinopse;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloDaPagina;
    private javax.swing.JPanel pnlCapa;
    private javax.swing.JPanel pnlDataLancamento;
    private javax.swing.JPanel pnlDataLancamento1;
    private javax.swing.JPanel pnlSinopse;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JFormattedTextField txtDataLancamento;
    private javax.swing.JTextArea txtSinopse;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
