package Adapter.SistemaTransportadoras.adapters;

import Adapter.SistemaTransportadoras.CalculadoraFrete;
import Adapter.SistemaTransportadoras.fornecedores.AlfaTransportadora;

public class FreteAlfaAdapter implements CalculadoraFrete{

    private AlfaTransportadora alfa;

    public FreteAlfaAdapter(AlfaTransportadora alfa){
        this.alfa = alfa;
    }

    @Override
    public double calcular(String cepOrigem, String cepDestino, double pesoKg) {
        String origemSemHifen = cepOrigem.replace("-", "");
        String destinoSemHifen = cepDestino.replace("-", "");
        long pesoGramas = Math.round(pesoKg * 1000);

        long valorCentavos = alfa.cotarEntrega(
            origemSemHifen, 
            destinoSemHifen, 
            pesoGramas
        );

        double valorReais = valorCentavos / 100.0;

        return valorReais;

    }

    @Override
    public int prazoDias(String cepOrigem, String cepDestino) {
        String origemSemHifen = cepOrigem.replace("-", "");
        String destinoSemHifen = cepDestino.replace("-", "");

        int prazo = alfa.estimarPrazo(
            origemSemHifen, 
            destinoSemHifen);

        return prazo;
    }

    @Override
    public String nomeTransportadora() {
        return "Alfa";
    }
    
}
