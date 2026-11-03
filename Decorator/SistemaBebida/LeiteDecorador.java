package Decorator.SistemaBebida;

public class LeiteDecorador extends CondimentDecorator{
    
    public LeiteDecorador(iBebida bebida){
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + " com leite";
    }

    @Override
    public double preco() {
        return bebida.preco() + 1.50;
    }

    
}
