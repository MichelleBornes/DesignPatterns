public class Main{
    public static void main(String[] args){

        Desconto desconto = new DescontoVIP();
        double resultado = desconto.aplicar(100);

        System.out.println("Valor final: " + resultado);

    }
}