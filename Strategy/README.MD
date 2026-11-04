# Strategy Pattern

## Sobre o padrão

O **Strategy** é um padrão de projeto comportamental que permite alterar o comportamento de um objeto durante a execução do programa, delegando a execução de um algoritmo para diferentes estratégias.

Em vez de utilizar várias estruturas condicionais (`if/else`) para determinar qual comportamento executar, cada comportamento é encapsulado em uma classe separada.

## Estrutura do padrão

O Strategy possui três elementos principais:

- **Strategy:** interface que define um contrato comum para todas as estratégias.
- **Concrete Strategies:** classes que implementam a interface e oferecem diferentes comportamentos.
- **Context:** classe que mantém uma referência para a estratégia e delega a ela a execução do comportamento.

## Exemplo 1 — Calculadora

O primeiro exemplo demonstra uma calculadora que permite alternar entre diferentes operações matemáticas.

**Estratégias implementadas:**
- `AddStrategy`: realiza adição.
- `SubtractStrategy`: realiza subtração.
- `MultiplyStrategy`: realiza multiplicação.

O `Context` recebe uma estratégia e executa a operação correspondente. Também permite trocar a estratégia durante a execução utilizando `setStrategy()`.

## Exemplo 2 — Sistema de Processamento de Pagamentos

O segundo exemplo demonstra como diferentes formas de pagamento podem ser utilizadas por meio de uma mesma estrutura.

**Classes implementadas:**

| Classe | Responsabilidade |
|---|---|
| `PaymentStrategy` | Interface que define o método `pay()`. |
| `CreditCardPayment` | Implementa pagamento com cartão de crédito. |
| `BankTransferPayment` | Implementa pagamento por transferência bancária. |
| `PayPalPayment` | Implementa pagamento com PayPal. |
| `PaymentContext` | Mantém e executa a estratégia selecionada. |
| `Client` | Simula a escolha e a execução dos pagamentos. |

O `PaymentContext` trabalha com a interface `PaymentStrategy`, permitindo substituir a forma de pagamento sem modificar sua implementação.

## Vantagens

- **Flexibilidade:** permite trocar comportamentos durante a execução.
- **Desacoplamento:** separa os algoritmos da classe que os utiliza.
- **Extensibilidade:** facilita adicionar novas estratégias sem modificar as existentes.
- **Organização:** evita concentrar diferentes algoritmos em estruturas condicionais extensas.

## Quando utilizar?

O Strategy é indicado quando um sistema possui diferentes formas de executar uma determinada operação e precisa permitir a escolha ou alteração do comportamento durante a execução.

## Conceito principal

O Strategy permite que diferentes classes implementem comportamentos distintos seguindo um mesmo contrato, enquanto o contexto utiliza essas implementações sem depender de uma classe concreta específica.