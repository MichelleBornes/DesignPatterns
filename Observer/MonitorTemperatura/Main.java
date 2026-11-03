package Observer.MonitorTemperatura;

public class Main {
    public static void main(String[] args) {
        
        Subject observado = new Subject();

        ConcreteObserver ambiente1 = new ConcreteObserver(observado);
        ConcreteObserver ambiente2 = new ConcreteObserver(observado);
        ConcreteObserver ambiente3 = new ConcreteObserver(observado);

        System.out.println("Antes de atualizar o estado do observado");

        observado.setTemperatura(25);

        System.out.println(
		        "Depois de atualizar o estado do observado"
		    );

        observado.setTemperatura(30);

    }
}
