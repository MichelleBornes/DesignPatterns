package Decorator.PersonalizacaoComputadores;

public class PlacaVideoDecorador extends ComputadorConcreto{

    public PlacaVideoDecorador(iComputador computador) {
        super(computador);
    }

    @Override
    public String descricao() {
        return computador.descricao() + " + Placa de vídeo";
    }

    @Override
    public double preco() {
        return computador.preco() + 900;
    }
    
}
