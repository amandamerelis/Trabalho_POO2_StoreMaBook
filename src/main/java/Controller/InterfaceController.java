package Controller;

import Domain.Autor;
import Domain.Genero;
import Domain.Livro;
import Domain.Resenha;
import Interface.DlgCadastroAutor;
import Interface.DlgCadastroLivro;
import Interface.DlgCadastroResenha;
import Interface.DlgPesquisarAutor;
import Interface.DlgPesquisarLivro;
import Interface.DlgPesquisarResenha;
import Interface.DlgVisualizarDetalhes;
import Interface.MainFrame;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class InterfaceController {

    private MainFrame janelaPrincipal = null;
    private DlgCadastroAutor janelaCadastroAutor = null;
    private DlgCadastroLivro janelaCadastroLivro = null;
    private DlgCadastroResenha janelaCadastroResenha = null;

    private DlgPesquisarAutor janelaPesquisaAutor = null;
    private DlgPesquisarLivro janelaPesquisaLivro = null;
    private DlgPesquisarResenha janelaPesquisaResenha = null;

    private DlgVisualizarDetalhes janelaVisualizarLeitura = null;
    private DomainController domainController;

    private InterfaceController() {
        try {
            domainController = new DomainController();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro de conexão com o banco. " + ex.getMessage());
            System.exit(-1);
        }
    }

    public DomainController getDomainController() {
        return domainController;
    }

    public void abrirJanelaPrincipal() {
        if (janelaPrincipal == null) {
            janelaPrincipal = new MainFrame(this);
            janelaPrincipal.setVisible(true);
        }
    }

    // ABRIR JDIALOG
    private JDialog abrirJanela(java.awt.Frame parent, JDialog dlg, Class classe) {
        if (dlg == null) {
            try {
                dlg = (JDialog) classe.getConstructor(Frame.class, boolean.class, InterfaceController.class).newInstance(parent, true, this);
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(parent, "Erro ao abrir a janela " + classe.getName());
            }
        }
        dlg.setVisible(true);
        return dlg;
    }

    public void carregarComboBoxAutores(JComboBox<String> comboBox) {
        List<Autor> lista = domainController.listarAutores();
        comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
    public void carregarComboBoxGeneros(JComboBox<String> comboBox) {
        List<Genero> lista = domainController.listarGeneros();
        comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
    }
    
    public void carregarComboBoxLivros(JComboBox<String> comboBox) {
        List<Livro> lista = domainController.listarLivros();
        comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
    }

    public void abrirVisualizarLeitura(Resenha resenha) {
        /*if (janelaVisualizarLeitura != null) {
            janelaVisualizarLeitura.setResenhaExibicao(resenha);
        }*/
        janelaVisualizarLeitura = (DlgVisualizarDetalhes) abrirJanela(janelaPrincipal, janelaVisualizarLeitura, DlgVisualizarDetalhes.class);
        try {
            janelaVisualizarLeitura.atualizar(resenha);
        } catch (ParseException ex) {
            Logger.getLogger(InterfaceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirCadastroLivro() {
        janelaCadastroLivro = (DlgCadastroLivro) abrirJanela(janelaPrincipal, janelaCadastroLivro, DlgCadastroLivro.class);
    }

    public void abrirCadastroAutor() {
        janelaCadastroAutor = (DlgCadastroAutor) abrirJanela(janelaPrincipal, janelaCadastroAutor, DlgCadastroAutor.class);
    }

    public void abrirCadastroResenha() {
        janelaCadastroResenha = (DlgCadastroResenha) abrirJanela(janelaPrincipal, janelaCadastroResenha, DlgCadastroResenha.class);
    }

    public Autor abrirPesquisarAutor() {
        janelaPesquisaAutor = (DlgPesquisarAutor) abrirJanela(janelaPrincipal, janelaPesquisaAutor, DlgPesquisarAutor.class);
        return janelaPesquisaAutor.getAutor();
    }

    public Livro abrirPesquisarLivro() {
        janelaPesquisaLivro = (DlgPesquisarLivro) abrirJanela(janelaPrincipal, janelaPesquisaLivro, DlgPesquisarLivro.class);
        return janelaPesquisaLivro.getLivro();
    }

    public Resenha abrirPesquisarResenha() {
        janelaPesquisaResenha = (DlgPesquisarResenha) abrirJanela(janelaPrincipal, janelaPesquisaResenha, DlgPesquisarResenha.class);
        return janelaPesquisaResenha.getResenha();
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //TRADUÇÃO DOS BOTÕES "SIM" E "NÃO" DO OPTIONPANE
        javax.swing.UIManager.put("OptionPane.yesButtonText", "Sim");
        javax.swing.UIManager.put("OptionPane.noButtonText", "Não");

        InterfaceController interfaceController = new InterfaceController();
        interfaceController.abrirJanelaPrincipal();
    }

}
