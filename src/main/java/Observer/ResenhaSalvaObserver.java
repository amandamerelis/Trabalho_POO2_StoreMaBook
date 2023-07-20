package Observer;

import javax.swing.JOptionPane;

public class ResenhaSalvaObserver extends ResenhaObserver {

    public ResenhaSalvaObserver(ResenhaSubject resenhaSubject) {
        super(resenhaSubject);
    }
    
    @Override
    public void update() {
        JOptionPane.showMessageDialog(null,
                "Resenha de ID " + resenhaSubject.getState().getId() + " salva com sucesso.\n" + new java.util.Date(),
                "Dados da Resenha", JOptionPane.INFORMATION_MESSAGE);
    }
}
