package Strategy.ProcessamentoPagamento;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(double amount){
        this.strategy.pay(amount);
    }

}
