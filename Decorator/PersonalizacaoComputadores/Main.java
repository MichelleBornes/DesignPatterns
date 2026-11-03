package Decorator.PersonalizacaoComputadores;

public class Main {
    
    public static void main(String[] args) {
        
        iComputador computador = new ComputadorBasico();
        System.out.println("Computador: " + computador.descricao());
        System.out.println("Preço: R$ " + computador.preco());

        computador = new RamDecorador(computador);
        System.out.println("Computador: " + computador.descricao());
        System.out.println("Preço: R$ " + computador.preco());

        computador = new SsdDecorador(computador);
        System.out.println("Computador: " + computador.descricao());
        System.out.println("Preço: R$ " + computador.preco());
    }
}
