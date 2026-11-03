package Decorator.SistemaBebida;

public class AcucarDecorador extends CondimentDecorator{

    public AcucarDecorador(iBebida bebida){
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", com açúcar";
    }

    @Override
    public double preco() {
        return bebida.preco() + 0.10;
    }
    
}
