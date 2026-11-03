import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoDePedidos catalogo = new CatalogoDePedidos();

        // 1. Criando o modelo
        List<ItemPedido> itensModelo = new ArrayList<>();
        itensModelo.add(new ItemPedido("Café 500g", 10, new BigDecimal("18.90")));
        itensModelo.add(new ItemPedido("Açúcar 1kg", 20, new BigDecimal("4.50")));
        itensModelo.add(new ItemPedido("Filtro de papel", 5, new BigDecimal("7.20")));
        
        Pedido modelo = new Pedido("(modelo)", "-", itensModelo);
        catalogo.registrar("reposicao-mensal", modelo);

        // 2. Gerando as cópias (RF10)[cite: 1]
        Pedido pedidoA = catalogo.criar("reposicao-mensal");
        pedidoA.setCliente("Mercado Central");
        pedidoA.setEnderecoEntrega("Rua das Flores, 120");

        Pedido pedidoB = catalogo.criar("reposicao-mensal");
        pedidoB.setCliente("Padaria Boa Massa");
        pedidoB.setEnderecoEntrega("Av. Paraná, 800");
        pedidoB.getItens().get(0).setQuantidade(20); // Altera apenas o clone B

        Pedido pedidoC = catalogo.criar("reposicao-mensal");
        pedidoC.setCliente("Restaurante do Porto");
        pedidoC.setEnderecoEntrega("Rua do Cais, 45");
        pedidoC.getItens().add(new ItemPedido("Adoçante 100ml", 12, new BigDecimal("6.00"))); // Adiciona só no clone C

        System.out.println("--- PEDIDOS GERADOS ---");
        System.out.println(modelo);
        System.out.println(pedidoA);
        System.out.println(pedidoB);
        System.out.println(pedidoC);

        System.out.println("\n--- CRITÉRIOS DE ACEITAÇÃO (RF11) ---");
        
        boolean ca01 = (modelo.getId() != pedidoA.getId()) && (pedidoA.getId() != pedidoB.getId()) && (pedidoB.getId() != pedidoC.getId());
        System.out.println("CA-01 Ids diferentes: " + (ca01 ? "OK" : "FALHA"));

        boolean ca02 = modelo.valorTotal().compareTo(new BigDecimal("315.00")) == 0;
        System.out.println("CA-02 Valor do modelo inalterado: " + (ca02 ? "OK" : "FALHA"));

        boolean ca03 = pedidoA.valorTotal().compareTo(new BigDecimal("315.00")) == 0 &&
                       pedidoB.valorTotal().compareTo(new BigDecimal("504.00")) == 0 &&
                       pedidoC.valorTotal().compareTo(new BigDecimal("387.00")) == 0;
        System.out.println("CA-03 Totais corretos das cópias: " + (ca03 ? "OK" : "FALHA"));

        boolean ca04 = modelo.getItens().size() == 3;
        System.out.println("CA-04 Modelo continua com 3 itens: " + (ca04 ? "OK" : "FALHA"));

        boolean ca05 = modelo.getItens().get(0) != pedidoA.getItens().get(0);
        System.out.println("CA-05 Itens não são as mesmas instâncias na memória (Deep Copy): " + (ca05 ? "OK" : "FALHA"));

        boolean ca06 = false;
        try {
            catalogo.criar("inexistente");
        } catch (IllegalArgumentException e) {
            ca06 = true;
        }
        System.out.println("CA-06 Exceção para chave inexistente: " + (ca06 ? "OK" : "FALHA"));

        boolean ca07 = modelo.getCliente().equals("(modelo)");
        System.out.println("CA-07 Cliente do modelo permanece inalterado: " + (ca07 ? "OK" : "FALHA"));

        // Desafio RF12
        System.out.println("\n--- DESAFIO DESEMPENHO (RF12) ---");
        long start = System.currentTimeMillis();
        for(int i=0; i<100000; i++) modelo.clonar();
        System.out.println("Tempo 100.000 cópias manuais: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for(int i=0; i<100000; i++) modelo.clonarPorSerializacao();
        System.out.println("Tempo 100.000 cópias por serialização: " + (System.currentTimeMillis() - start) + "ms");
    }
}