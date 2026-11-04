package Adapter.SistemaTransportadoras.fornecedores;

public class GamaTransportadora {

    public TarifaGama consultarTarifa(
            int cepOrigem,
            int cepDestino,
            double pesoKg,
            boolean expresso) {

        if (expresso) {
            return new TarifaGama(60.00, 0.20, 24);
        }

        return new TarifaGama(40.00, 0.25, 72);
    }
}