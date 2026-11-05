package Strategy.Frete;

import Strategy.Frete.Singleton.ConfiguracaoLoja;

public class FretePAC implements FreteStrategy{

    private ConfiguracaoLoja config;

    public FretePAC(ConfiguracaoLoja config){
        this.config = config;
    }

    @Override
    public String getNome() {
        return "PAC";
    }

    @Override
    public double calcular(Pedido pedido) {
        double calculo = (pedido.getPesoKg() * config.getPacKg()) 
                        + (pedido.getDistanciaKm() + config.getPacKm());

        return calculo;
    
    }
}
    