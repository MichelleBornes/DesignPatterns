package Decorator.PersonalizacaoComputadores;

public class ComputadorBasico implements iComputador{

    @Override
    public String descricao() {
        return "Básico";
    }

    @Override
    public double preco() {
        return 2000;
    }

    
}
