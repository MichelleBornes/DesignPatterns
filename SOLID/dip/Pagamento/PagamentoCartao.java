public class PagamentoCartao implements IPagamento{
    
    @Override 
    public void processar(){
        System.out.println("Processando pagamento no cartão...");
    }
}

