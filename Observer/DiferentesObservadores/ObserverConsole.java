package Observer.DiferentesObservadores;

public class ObserverConsole extends Observer{

    public ObserverConsole(Subject observado){
        this.subject = observado;
        this.subject.attach(this);
    }

    @Override 
    public void update(){
        System.out.println("Console: Novo estado = " + subject.getState());    }
}
