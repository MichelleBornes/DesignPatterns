package Adapter.SistemaPagamento;

public interface ProcessadorPagamento {
    public void processarPagamento(double valor);
    public boolean validarCartao(String numeroCartao);
}
