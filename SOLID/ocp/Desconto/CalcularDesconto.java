public class CalcularDesconto{
    public double calcular(double valor, Desconto desconto){
        return desconto.aplicar(valor);
    }
}