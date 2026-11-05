package Strategy.Frete;

import Strategy.Frete.Singleton.ConfiguracaoLoja;

public class FreteSEDEX implements FreteStrategy{

    private ConfiguracaoLoja config;

    public FreteSEDEX(ConfiguracaoLoja config){
        this.config = config;
    }

    @Override
    public String getNome() {
        return "SEDEX";
    }

    @Override
    public double calcular(Pedido pedido) {
        double calculo = (pedido.getPesoKg() * config.getSedexKg()) + (pedido.getDistanciaKm() * config.getSedexKm()) + config.getTaxaUrgenciaSedex();

        return calculo;
    }
    
}
