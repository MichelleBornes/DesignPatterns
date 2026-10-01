public class Main {
    public static void main(String[] args) {
        
        Pagamento pagamento = new PagamentoCheque();
        pagamento.processar();

        pagamento = new PagamentoBoleto();
        pagamento.processar();

        pagamento = new PagamentoCartaoCredito();
        pagamento.processar();
    }
}
