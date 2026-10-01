public class DescontoVIP implements Desconto{
    public double aplicar(double valor){
        return valor * 0.9;
    }
}