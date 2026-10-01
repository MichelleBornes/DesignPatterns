public class Main {
    
    public static void main(String[] args) {
        
        Frete frete = new FreteSedex();
        double valor = frete.calcular(100);

        System.out.println(valor);
    }
}
