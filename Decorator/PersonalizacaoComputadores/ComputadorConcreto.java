package Decorator.PersonalizacaoComputadores;

public abstract class ComputadorConcreto implements iComputador{
    
    protected iComputador computador;

    public ComputadorConcreto(iComputador computador){
        this.computador = computador;
    }
}
