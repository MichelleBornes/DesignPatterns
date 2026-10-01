public class CartaoCredito implements IPagamento{
    
    @Override 
    public void processar(){
        System.out.println("Processando cartão de crédito...");
    }
}
