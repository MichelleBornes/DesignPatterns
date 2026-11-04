package Adapter.SistemaTransportadoras;

import java.util.Locale;

import Adapter.SistemaTransportadoras.adapters.FreteAlfaAdapter;
import Adapter.SistemaTransportadoras.adapters.FreteBetaAdapter;
import Adapter.SistemaTransportadoras.adapters.FreteGamaAdapter;
import Adapter.SistemaTransportadoras.fornecedores.AlfaTransportadora;
import Adapter.SistemaTransportadoras.fornecedores.BetaTransportadora;
import Adapter.SistemaTransportadoras.fornecedores.GamaTransportadora;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        String origem = "80010-000";
        String destino = "01310-100";
        double peso = 2.5;

         CalculadoraFrete[] transportadoras = {
            new FreteAlfaAdapter(new AlfaTransportadora()),
            new FreteBetaAdapter(new BetaTransportadora()),
            new FreteGamaAdapter(new GamaTransportadora(), false),
            new FreteGamaAdapter(new GamaTransportadora(), true)
        };

        double menorValor = Double.MAX_VALUE;
        String maisBarata = "";

        for (CalculadoraFrete transportadora : transportadoras) {

            double valor = transportadora.calcular(origem, destino, peso);
            int prazo = transportadora.prazoDias(origem, destino);

            System.out.printf(
                "%s: R$ %.2f - %d dias%n",
                transportadora.nomeTransportadora(),
                valor,
                prazo
            );

            if (valor < menorValor) {
                menorValor = valor;
                maisBarata = transportadora.nomeTransportadora();
            }
        }

        System.out.println("\nFrete mais barato: " + maisBarata);
    }
}
