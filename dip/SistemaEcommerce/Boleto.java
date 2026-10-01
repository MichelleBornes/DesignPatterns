public class Boleto implements IPagamento{
    @Override 
    public void processar(double valor){
        System.out.println("Pagamento no boleto: " + valor);
    }
}
