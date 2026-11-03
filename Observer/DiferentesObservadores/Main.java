package Observer.DiferentesObservadores;

public class Main {
    
    public static void main(String[] args) {
        Subject observado = new Subject();

        ObserverConsole console = new ObserverConsole(observado);
        ObserverAlerta alerta = new ObserverAlerta(observado);

        observado.setState(25);
    }
}
