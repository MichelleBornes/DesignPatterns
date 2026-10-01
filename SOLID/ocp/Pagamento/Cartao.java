public class Cartao implements Pagamento{
    
    public double pagar(double valor) {
        return valor + 30;
    }
}
