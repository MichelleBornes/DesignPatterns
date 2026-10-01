public interface FreteTransportadora implements Frete{
    
    public double calcular(double valor){
        return valor + 80;
    }
}
