public class PagamentoBoleto implements IPagamento{
    
    @Override 
    public void processar(double valor){
        System.out.println("Pagamento via Boleto: R$ " + valor);
    }
}
