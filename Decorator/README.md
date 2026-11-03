# Decorator Pattern

## Sobre

O **Decorator** é um padrão de projeto estrutural que permite adicionar responsabilidades e funcionalidades a objetos dinamicamente, sem modificar sua estrutura original.

Sua principal característica é utilizar classes decoradoras (*wrappers*) que envolvem um objeto, acrescentando comportamentos antes ou depois de executar suas operações.

## Estrutura do padrão

O padrão Decorator é composto por quatro elementos principais:

- **Component:** define a interface comum para os objetos que podem receber decorações.
- **ConcreteComponent:** implementação concreta do componente original.
- **Decorator:** classe abstrata que implementa a interface do componente e mantém uma referência para outro componente.
- **ConcreteDecorator:** classes que adicionam funcionalidades específicas ao objeto decorado.

## Funcionamento

O objeto original é criado normalmente e, em seguida, pode ser envolvido por um ou mais decoradores.

Cada decorador recebe o objeto anterior e adiciona uma nova responsabilidade. Dessa forma, as funcionalidades podem ser combinadas dinamicamente.


## Vantagens

- Permite adicionar funcionalidades sem modificar a classe original.
- Evita a criação de diversas subclasses para representar combinações de comportamentos.
- Permite combinar diferentes decoradores.
- Favorece o princípio Open/Closed, permitindo extensão sem alteração do código existente.

