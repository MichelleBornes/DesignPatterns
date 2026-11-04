package Adapter.SistemaTransportadoras.adapters;

import Adapter.SistemaTransportadoras.CalculadoraFrete;
import Adapter.SistemaTransportadoras.fornecedores.GamaTransportadora;
import Adapter.SistemaTransportadoras.fornecedores.TarifaGama;

public class FreteGamaAdapter implements CalculadoraFrete{

    private GamaTransportadora gama;
    private boolean expresso;
    private TarifaGama ultimaTarifa;

    public FreteGamaAdapter(GamaTransportadora gama, boolean expresso){
        this.gama = gama;
        this.expresso = expresso;
    }

    private int converterCep(String cep){
        String cepLimpo = cep.replace("-", "");

        if (!cepLimpo.matches("\\d{8}")){
            throw new IllegalArgumentException("CEP deve conter 8 digitos");
        }

        return Integer.parseInt(cepLimpo);
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        int origem = converterCep(cepOrigem);
        int destino = converterCep(cepDestino);

        ultimaTarifa = gama.consultarTarifa(origem, destino, pesoKg, expresso);

        return ultimaTarifa.getValorBruto() * (1 - ultimaTarifa.getDesconto());
    }    

    @Override
    public int prazoDias(String cepOrigem, String cepDestino) {
       if (ultimaTarifa == null){
            throw new IllegalStateException(
                "Calcule o frete antes de consultar o prazo"
            );
       }

       return (int) Math.ceil(ultimaTarifa.getPrazoHoras() / 24.0);
    }

    @Override
    public String nomeTransportadora() {
        return  expresso ? "Gama Express" : "Gama";
    }

}

