package Strategy.Frete;

import Strategy.Frete.Singleton.AuditLog;
import java.util.Locale;

public class CalculadoraFrete {
    
    private FreteStrategy strategy;

    public CalculadoraFrete(FreteStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(FreteStrategy strategy){
        this.strategy = strategy;
    }

    public double calcular(Pedido pedido){
        if (strategy == null) {
            throw new IllegalStateException("Nenhuma estratégia de frete definida.");
        }

        double frete = strategy.calcular(pedido);

        String registro = String.format(
            Locale.US,
            "pedido=%d estrategia=%s frete=%.2f",
            pedido.getId(),
            strategy.getNome(),
            frete
        );

        AuditLog.getInstancia().registrar(registro);

        return frete;
    }
}
