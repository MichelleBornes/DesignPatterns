package Decorator.SistemaBebida;

public class ChocolateDecorador extends CondimentDecorator{

    public ChocolateDecorador(iBebida bebida){
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + " com chocolate";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1.0;
    }
    
}
