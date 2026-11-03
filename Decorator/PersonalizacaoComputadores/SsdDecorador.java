package Decorator.PersonalizacaoComputadores;

public class SsdDecorador extends ComputadorConcreto{

    public SsdDecorador(iComputador computador) {
        super(computador);
    }

    @Override
    public String descricao() {
        return computador.descricao() + " + SSD 1 TB";
    }

    @Override
    public double preco() {
        return computador.preco() + 400;
    }
    
}
