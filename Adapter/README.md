# Adapter Pattern

## Conceito

O **Adapter** é um padrão de projeto estrutural que permite que interfaces incompatíveis trabalhem juntas.

Ele funciona como um tradutor entre duas estruturas diferentes, adaptando os métodos e formatos de dados de uma classe para que possam ser utilizados por outra sem modificar o código original.

### Objetivos
- Integrar classes com interfaces incompatíveis.
- Reaproveitar códigos existentes e legados.
- Evitar alterações desnecessárias nas classes fornecedoras.
- Padronizar a comunicação entre diferentes componentes.

## Estrutura do padrão

O padrão Adapter possui três elementos principais:

- **Target:** interface que define o contrato esperado pelo sistema.
- **Adapter:** classe responsável por implementar o contrato e adaptar as chamadas.
- **Adaptee:** classe existente que possui uma interface incompatível com a esperada.

### Object Adapter

Neste projeto, foi utilizado o **Object Adapter**, que utiliza composição para manter uma referência ao objeto que precisa ser adaptado.

Em vez de herdar da classe fornecedora, o Adapter recebe uma instância pelo construtor e utiliza seus métodos internamente.

Essa abordagem permite maior flexibilidade e integração de diferentes fornecedores.

## Exercícios implementados

### Gateway de Pagamentos

**Objetivo:** integrar um gateway de pagamentos legado a uma interface utilizada pelo sistema.

Componentes:
- `ProcessadorPagamento`: interface esperada pelo sistema.
- `GatewayPagamentoLegado`: classe fornecedora com métodos incompatíveis.
- `GatewayPagamentoAdapter`: adapta os métodos do gateway legado.
- `SistemaPagamento`: demonstra a utilização do Adapter.

### Sistema de Transportadoras

**Objetivo:** integrar diferentes transportadoras a um marketplace que utiliza uma interface única para calcular fretes.

O marketplace espera a interface `CalculadoraFrete`, que define:

- `calcular()`: calcula o valor do frete.
- `prazoDias()`: retorna o prazo de entrega.
- `nomeTransportadora()`: identifica a transportadora.

Cada fornecedor possui métodos e formatos próprios, exigindo adaptações.

**Transportadoras implementadas:**

| Transportadora | Adaptações realizadas |
|---|---|
| Alfa | CEP sem hífen, peso em gramas e preço em centavos. |
| Beta | Conversão de preço textual e extração do prazo em dias. |
| Gama | CEP convertido para inteiro, aplicação de desconto e conversão de horas em dias. |

**Principais classes:**

- `CalculadoraFrete`: interface comum do marketplace.
- `FreteAlfaAdapter`: adapta a transportadora Alfa.
- `FreteBetaAdapter`: adapta a transportadora Beta.
- `FreteGamaAdapter`: adapta a transportadora Gama, incluindo a modalidade expressa.
- `AlfaTransportadora`, `BetaTransportadora` e `GamaTransportadora`: classes fornecedoras.
- `TarifaGama`: representa os dados da tarifa da transportadora Gama.
- `Main`: executa as cotações e identifica o frete mais barato.

**Resultado esperado para uma encomenda de 2,5 kg, de Curitiba para São Paulo:**

| Transportadora | Valor | Prazo |
|---|---:|---:|
| Alfa | R$ 34,00 | 6 dias |
| Beta | R$ 36,15 | 5 dias |
| Gama | R$ 30,00 | 3 dias |
| Gama Express | R$ 48,00 | 1 dia |

A transportadora com o menor valor é a **Gama**.

## Vantagens do padrão

- **Reutilização:** permite aproveitar classes existentes sem modificá-las.
- **Flexibilidade:** facilita a integração de novos fornecedores.
- **Desacoplamento:** o sistema cliente depende de uma interface comum, e não das implementações específicas.
- **Manutenibilidade:** mudanças nas classes fornecedoras podem ser tratadas nos respectivos Adapters.

## Conclusão

O padrão Adapter permite integrar componentes que possuem interfaces diferentes, sem exigir modificações em suas implementações originais.
