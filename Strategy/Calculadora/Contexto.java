package Strategy.Calculadora;

public class Contexto {
    private Strategy strategy;

    public Contexto(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return this.strategy.execute(a, b);
    }
}
