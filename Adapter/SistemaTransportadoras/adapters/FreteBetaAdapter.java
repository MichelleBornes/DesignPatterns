package Adapter.SistemaTransportadoras.adapters;

import Adapter.SistemaTransportadoras.CalculadoraFrete;
import Adapter.SistemaTransportadoras.fornecedores.BetaTransportadora;


public class FreteBetaAdapter implements CalculadoraFrete{

    private BetaTransportadora beta;

    public FreteBetaAdapter(BetaTransportadora beta){
        this.beta = beta;
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        String cotacao = beta.simular(cepOrigem, cepDestino, pesoKg);

        cotacao = cotacao.replace("R$ ", "");
        cotacao = cotacao.replace(",", ".");
        
        return Double.parseDouble(cotacao);

    }

    @Override
    public int prazoDias(String cepOrigem, String cepDestino) {
        String previsao = beta.previsaoEntrega(cepOrigem, cepDestino);

        String numero = previsao.split(" ")[0];
        int prazo = Integer.parseInt(numero);

        return prazo;
    }

    @Override
    public String nomeTransportadora() {
       return "Beta";
    }
    
}
