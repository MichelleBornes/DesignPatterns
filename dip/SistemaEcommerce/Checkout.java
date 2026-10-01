public class Checkout {

    IPagamento pagamento;

    public Checkout(IPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void checkar(double valor){
        pagamento.processar(valor);
    }
    
}
