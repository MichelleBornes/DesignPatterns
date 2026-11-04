package Strategy.Calculadora;

public class Main {
    
    public static void main(String[] args) {
        
        Contexto calculadora = new Contexto(new AddStrategy());
        int a = 30;
        int b = 10;
        System.out.println(calculadora.executeStrategy(a, b));

        calculadora.setStrategy(new SubStrategy());
       
        System.out.println(calculadora.executeStrategy(a, b));

        calculadora.setStrategy(new DivideStrategy());
        System.out.println(calculadora.executeStrategy(a, b));
    }
}
