package Controller;

import Domain.Autor;
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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;

public class InterfaceController {

    private MainFrame janelaPrincipal = null;
    private DlgCadastroAutor janelaCadastroAutor = null;
    private DlgCadastroLivro janelaCadastroLivro = null;
    private DlgCadastroResenha janelaCadastroResenha = null;

    private DlgPesquisarAutor janelaPesquisaAutor = null;
    private DlgPesquisarLivro janelaPesquisaLivro = null;
    private DlgPesquisarResenha janelaPesquisaResenha = null;

    private DlgVisualizarDetalhes janelaVisualizarLeitura = null;
    private DomainController domainController = null;

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

    public void carregarComboBoxLivros(JComboBox comboBox) {
        try {
            ArrayList<Livro> lista = new ArrayList<>(domainController.listar(Livro.class));
            DefaultComboBoxModel model = new DefaultComboBoxModel(lista.toArray());
            comboBox.setModel(model);
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao carregar os dados.");
        }
    }
    
    
    public void carregarComboBox(JComboBox comboBox, Class classe) {
        try {
            List lista = domainController.listar(classe);
            comboBox.setModel(new DefaultComboBoxModel(lista.toArray()));
        } catch (HibernateException erro) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao carregar os dados.");
        }
    }

    public DlgVisualizarDetalhes abrirVisualizarLeitura(Resenha resenha) {
        Class classe = DlgVisualizarDetalhes.class;
        if (janelaVisualizarLeitura == null) {
            try {
                janelaVisualizarLeitura = (DlgVisualizarDetalhes) (JDialog) classe.getConstructor(Frame.class, boolean.class, InterfaceController.class).newInstance(janelaPrincipal, true, this); 
            } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao abrir a janela " + classe.getName());
            }
        }
        janelaVisualizarLeitura.setResenhaExibicao(resenha);
        janelaVisualizarLeitura.setVisible(true);
        return janelaVisualizarLeitura;
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
