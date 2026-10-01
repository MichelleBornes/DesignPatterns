public class Main {
    
    public static void main(String[] args) {
        
        IPagamento pagamentoPix = new PagamentoPix();
        Pedido pedido = new Pedido(pagamentoPix);
        pedido.finalizar(150);

        IPagamento pagamentoBoleto = new PagamentoBoleto();
        Pedido pedido2 = new Pedido(pagamentoBoleto);
        pedido2.finalizar(345);
    }
}
