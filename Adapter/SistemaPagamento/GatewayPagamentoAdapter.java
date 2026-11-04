package Adapter.SistemaPagamento;

public class GatewayPagamentoAdapter implements ProcessadorPagamento{

    private GatewayPagamentoLegado gatewayLegado;

    public GatewayPagamentoAdapter(GatewayPagamentoLegado gatawayLegado){
        this.gatewayLegado = gatawayLegado;
    }

    @Override
    public void processarPagamento(double valor) {
        gatewayLegado.efetuarPagamento(valor, "BRL");
    }

    @Override
    public boolean validarCartao(String numeroCartao) {
        return gatewayLegado.verificarCartaoCredito(numeroCartao);
    }
    
}
