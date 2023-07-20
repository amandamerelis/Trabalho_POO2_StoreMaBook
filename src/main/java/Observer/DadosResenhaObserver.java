package Observer;

import javax.swing.JOptionPane;

public class DadosResenhaObserver extends ResenhaObserver {

    public DadosResenhaObserver(ResenhaSubject resenhaSubject) {
        super(resenhaSubject);
    }

    @Override
    public void update() {
        JOptionPane.showMessageDialog(null,
                "Sua avaliação de " + resenhaSubject.getState().getAvaliacao() + " estrela(s) foi registrada com sucesso!",
                "Dados da Resenha",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
