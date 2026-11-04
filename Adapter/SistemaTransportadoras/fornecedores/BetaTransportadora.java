package Adapter.SistemaTransportadoras.fornecedores;

public class BetaTransportadora {
    
    public String simular(String cepOrigem, String cepDestino, double kg){
        return "R$ 36,15";
    }

    public String previsaoEntrega(String cepOrigem, String cepDestino){
        return "5 dias úteis";
    }
}
