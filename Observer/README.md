# Observer Pattern

## Sobre o padrão

O **Observer** é um padrão de projeto comportamental que estabelece uma relação de dependência **um-para-muitos** entre objetos.

Quando o estado de um objeto observado (`Subject`) é alterado, todos os observadores (`Observers`) cadastrados são notificados e atualizados automaticamente.

## Componentes

| Classe | Responsabilidade |
|---|---|
| `Subject` | Mantém o estado e a lista de observadores. |
| `Observer` | Classe abstrata que define o método `update()`. |
| `ConcreteObserver` | Implementa `update()` e se registra no Subject. |
| `Main` | Cria os objetos e executa o programa. |

## Principais métodos

- `attach()`: adiciona um observador à lista.
- `detach()`: remove um observador da lista.
- `setState()`: altera o estado do objeto observado e solicita as notificações.
- `notifyAllObservers()`: percorre a lista e chama `update()` de cada observador.
- `update()`: define como o observador reage à notificação.
