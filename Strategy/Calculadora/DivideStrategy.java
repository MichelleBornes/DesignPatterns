package Strategy.Calculadora;

public class DivideStrategy implements Strategy{

    @Override
    public int execute(int a, int b) {
        return a / b;
    }
    
}
