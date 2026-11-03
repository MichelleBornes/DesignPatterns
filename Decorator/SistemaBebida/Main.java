package Decorator.SistemaBebida;

public class Main {
    
    public static void main(String[] args) {
        
        iBebida cafe = new Cafe();
        System.out.println("Bebida pedida: " + cafe.Descricao());
        System.out.println("Custo: " + cafe.preco());

        cafe = new ChocolateDecorador(cafe);
        System.out.println("Bebida pedida: " + cafe.Descricao());
        System.out.println("Custo: " + cafe.preco());

        cafe = new LeiteDecorador(cafe);
        System.out.println("Bebida pedida: " + cafe.Descricao());
        System.out.println("Custo: " + cafe.preco());

        cafe = new AcucarDecorador(cafe);
        System.out.println("Bebida pedida: " + cafe.Descricao());
        System.out.println("Custo: " + cafe.preco());

        iBebida cafe1 = new Cafe();

        cafe1 = new AcucarDecorador(cafe1);
        System.out.println("Bebida pedida: " + cafe1.Descricao());
        System.out.println("Custo: " + cafe1.preco());

    }
}
