package Controller;

import Interface.DlgDadosLeitura;
import Interface.MainFrame;
import java.awt.Frame;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class InterfaceController {

    private MainFrame janelaPrincipal = null;
    private DlgDadosLeitura janelaCadastroLeitura = null;

    public InterfaceController() {

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

    public void abrirCadastroLeitura(boolean modo) {
        janelaCadastroLeitura = (DlgDadosLeitura) abrirJanela(janelaPrincipal, janelaCadastroLeitura, DlgDadosLeitura.class);
//        if(modo){
//            janelaCadastroLeitura.modoCadastroDeLeitura();
//        } else {
            janelaCadastroLeitura.modoVisualizarDados();
        //}
    }
    
//    public void abrirVisualizarLeitura() {
//        janelaCadastroLeitura = (DlgDadosLeitura) abrirJanela(janelaPrincipal, janelaCadastroLeitura, DlgDadosLeitura.class);
//        
//    }

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
