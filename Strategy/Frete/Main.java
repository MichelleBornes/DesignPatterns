package Strategy.Frete;

import Strategy.Frete.Singleton.ConfiguracaoLoja;
import Strategy.Frete.Singleton.AuditLog;

public class Main {
    
    public static void main(String[] args) {

        ConfiguracaoLoja config = ConfiguracaoLoja.getInstancia();

        Pedido pedido = new Pedido(1, 2, 100, 200);

        CalculadoraFrete calculadora = new CalculadoraFrete(new FretePAC(config));

        System.out.println("PAC: " + calculadora.calcular(pedido));

        calculadora.setStrategy(new FreteSEDEX(config));
        System.out.println("SEDEX: " + calculadora.calcular(pedido));

        calculadora.setStrategy(new Retirada());
        System.out.println("Retirada: " + calculadora.calcular(pedido));


        config.setPacKg(5.00);

        calculadora.setStrategy(new FretePAC(config));
        System.out.println("PAC com tarifa alterada: " + calculadora.calcular(pedido));

        config.restaurarPadroes();

        ConfiguracaoLoja config2 = ConfiguracaoLoja.getInstancia();

        System.out.println("Mesma instância? " + (config == config2));
        
        System.out.println("\n--- AUDIT LOG ---");

        AuditLog.getInstancia().getRegistros().forEach(System.out::println);    }
}
