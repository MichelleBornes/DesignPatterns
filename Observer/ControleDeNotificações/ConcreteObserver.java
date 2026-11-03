package Observer.ControleDeNotificações;

public class ConcreteObserver extends Observer{
    
    public ConcreteObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("O estado mudou para: " + subject.getState());
    }
}

