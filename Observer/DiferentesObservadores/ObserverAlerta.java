package Observer.DiferentesObservadores;

public class ObserverAlerta extends Observer{
    
    public ObserverAlerta(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("ALETRA: O estado do sistema foi alterado!");
    }
    
}
