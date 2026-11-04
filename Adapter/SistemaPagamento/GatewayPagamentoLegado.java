package Adapter.SistemaPagamento;

public class GatewayPagamentoLegado {
    
    public void efetuarPagamento(double valor, String moeda){
        System.out.println("Pagamento de " + valor + " " + moeda + " processado");
    }
    
    public boolean verificarCartaoCredito(String cartao){
        return cartao != null && cartao.length() == 16;
    }
}
