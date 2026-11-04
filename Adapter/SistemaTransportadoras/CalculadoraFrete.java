package Adapter.SistemaTransportadoras;

public interface CalculadoraFrete {
    
    double calcular(
        String cepOrigem, 
        String cepDestino, 
        double pesoKg
    );

    int prazoDias(
        String cepOrigem, 
        String cepDestino
    );

    String nomeTransportadora();
}
