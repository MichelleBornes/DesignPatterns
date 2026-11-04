package Strategy.ProcessamentoPagamento;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card Payment: R$ " + amount);
    }
    
}
