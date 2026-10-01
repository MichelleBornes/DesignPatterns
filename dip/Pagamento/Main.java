public class Main {
    
    public static void main(String[] args) {
        
        IPagamento pagamento = new PagamentoPix();
        Pedido pedido = new Pedido(pagamento);
        pedido.finalizar();

        IPagamento pagamento2 = new PagamentoCartao();
        Pedido pedido2 = new Pedido(pagamento2);
        pedido2.finalizar();
    }
}
