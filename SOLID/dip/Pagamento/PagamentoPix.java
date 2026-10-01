public class PagamentoPix implements IPagamento{
    
    @Override 
    public void processar(){
        System.out.println("Processando pagamento no pix...");
    }
}
