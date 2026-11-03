package Decorator.SistemaBebida;

public class Cafe implements iBebida{

    @Override
    public String Descricao() {
        return "Café";
    }

    @Override
    public double preco() {
        return 3.0;
    }
    
}
