package Observer.ControleDeNotificações;

public class Main {
    
    public static void main(String[] args) {
        
        Subject observado = new Subject();

        ConcreteObserver observer1 = new ConcreteObserver(observado);
        ConcreteObserver observer2 = new ConcreteObserver(observado);
        ConcreteObserver observer3 = new ConcreteObserver(observado);

        observado.setState(10);

        ConcreteObserver observer4 = new ConcreteObserver(observado);

        observado.setState(20);
    }
}
