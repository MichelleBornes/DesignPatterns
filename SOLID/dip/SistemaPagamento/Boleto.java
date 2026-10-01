public class Boleto implements IPagamento{
    
    @Override 
    public void processar(){
        System.out.println("Processando boleto...");
    }
}
