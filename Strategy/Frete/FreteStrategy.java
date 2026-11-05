package Strategy.Frete;

public interface FreteStrategy {
    public String getNome();

    public double calcular(Pedido pedido);
}
