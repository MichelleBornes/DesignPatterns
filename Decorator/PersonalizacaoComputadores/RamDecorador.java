package Decorator.PersonalizacaoComputadores;

public class RamDecorador extends ComputadorConcreto{

    public RamDecorador(iComputador computador){
        super(computador);
    }

    @Override
    public String descricao() {
       return computador.descricao() + " + RAM 16 GB";
    }

    @Override
    public double preco() {
        return computador.preco() + 300;
    }
    
}
