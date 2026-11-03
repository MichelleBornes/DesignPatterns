# Singleton Pattern

## Sobre o padrão

O **Singleton** é um padrão de projeto criacional que garante que uma classe tenha apenas uma instância durante a execução da aplicação e fornece um ponto de acesso global a essa instância.

Seu objetivo é controlar a criação de objetos que precisam ser compartilhados por diferentes partes do sistema.

## Características principais

- **Construtor privado (`private`):** impede que outras classes criem instâncias diretamente utilizando `new`.
- **Atributo estático (`static`):** mantém uma referência à única instância da classe.
- **Método de acesso público (`getInstancia()`):** permite obter a instância controlada pela própria classe.
- **Verificação de existência:** verifica se a instância já foi criada. Caso contrário, cria uma nova.

## Estrutura básica em Java

```java
public class Logger {

    private static Logger instancia;

    private Logger() {
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }

        return instancia;
    }

    public void registrar(String mensagem) {
        System.out.println("Log: " + mensagem);
    }
}
```

## Exemplo de utilização

```java
Logger logger1 = Logger.getInstancia();
Logger logger2 = Logger.getInstancia();

logger1.registrar("Sistema iniciado");

System.out.println(logger1 == logger2);
```

**Saída esperada:**

```text
Log: Sistema iniciado
true
```

A comparação `logger1 == logger2` retorna `true` porque as duas variáveis apontam para a mesma instância.

## Quando utilizar?

O Singleton pode ser utilizado em situações que exigem um recurso compartilhado e centralizado, como:

- Gerenciamento de conexões com banco de dados.
- Registro de logs.
- Configurações globais da aplicação.
- Gerenciamento de recursos compartilhados.

## Vantagens

- Garante o controle sobre a criação de instâncias.
- Evita a criação desnecessária de múltiplos objetos.
- Oferece um ponto de acesso global.
- Facilita o compartilhamento de recursos.

## Desvantagens

- Pode dificultar a realização de testes unitários.
- Pode aumentar o acoplamento entre as classes.
- Pode concentrar responsabilidades demais em uma única classe.

## Thread Safety

Em aplicações com múltiplas threads, a implementação básica pode permitir a criação de mais de uma instância caso duas threads executem simultaneamente a verificação `instancia == null`.

Uma forma simples de evitar esse problema é utilizar `synchronized` no método de acesso:

```java
public static synchronized Logger getInstancia() {
    if (instancia == null) {
        instancia = new Logger();
    }

    return instancia;
}
```

Assim, apenas uma thread por vez pode executar o método.

---
