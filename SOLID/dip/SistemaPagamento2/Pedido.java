public class Pedido {
    
    IPagamento pagamento;

    public Pedido(IPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void finalizar(double valor){
        System.out.println("Finalizando pedido...");

        pagamento.processar(valor);

        System.out.println("Pedido finalizado...");
    }
}
