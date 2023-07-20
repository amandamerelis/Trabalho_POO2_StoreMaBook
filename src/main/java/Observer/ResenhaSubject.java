package Observer;

import Domain.Resenha;
import java.util.ArrayList;

public class ResenhaSubject {
    
    private ArrayList<ResenhaObserver> observers;
    private Resenha resenha;

    public ResenhaSubject() {
        observers = new ArrayList<>();
    }

    public void inscrever(ResenhaObserver inscrito) {
        observers.add(inscrito);
    }

    public void desinscrever(int indice) {
        observers.remove(indice);
    }

    public void notificarInscritos() {
        for (ResenhaObserver inscrito : observers) {
            inscrito.update();
        }
    }

    public Resenha getState() {
        return resenha;
    }

    public void setState(Resenha resenha) {
        this.resenha = resenha;
        notificarInscritos();
    }
    
}
