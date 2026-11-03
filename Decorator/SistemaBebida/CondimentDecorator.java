package Decorator.SistemaBebida;

public abstract class CondimentDecorator implements iBebida{

    protected iBebida bebida;

    public CondimentDecorator(iBebida bebida){
        this.bebida = bebida;
    }
}
