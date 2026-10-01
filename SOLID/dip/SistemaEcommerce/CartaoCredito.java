public class CartaoCredito implements IPagamento{
    
    @Override 
    public void processar(double valor){
        System.out.println("Pagamento cartão de crédito: " + valor);
    }
}
