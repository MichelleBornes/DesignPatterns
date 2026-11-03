package Observer.MonitorTemperatura;

public class ConcreteObserver extends Observer{
    public ConcreteObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("A temepratura mudou para: " + subject.getTemperatura());
    }
}
