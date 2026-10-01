public class Pix implements IPagamento{
    @Override 
    public void processar(double valor){
        System.out.println("Pagamento no pix " + valor);
    }
}
