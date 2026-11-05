package Strategy.Frete;

public class Retirada implements FreteStrategy{

    @Override
    public String getNome() {
       return "RETIRADA";
    }

    @Override
    public double calcular(Pedido pedido) {
        return 0;
    }
    
}
