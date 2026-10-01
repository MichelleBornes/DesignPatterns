public class Pedido {
    
    IPagamento pagamento;

    public Pedido(IPagamento pagamento){
        this.pagamento = pagamento;
    }

    public void finalizar(){
        pagamento.processar();
    }
}
