package Observer;

public abstract class ResenhaObserver {
    
    protected ResenhaSubject resenhaSubject;
    
    public ResenhaObserver(ResenhaSubject resenhaSubject){
        this.resenhaSubject = resenhaSubject;
    }
    
    public abstract void update();
    
}
