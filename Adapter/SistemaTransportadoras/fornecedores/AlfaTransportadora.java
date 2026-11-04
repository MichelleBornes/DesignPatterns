package Adapter.SistemaTransportadoras.fornecedores;

public class AlfaTransportadora {

    public long cotarEntrega(String cepOrigem8, String cepDestino8, long pesoGramas) {
        return 3400;
    }

    public int estimarPrazo(String cepOrigem8, String cepDestino8){
        return 6;
    }

}
