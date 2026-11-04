package Strategy.ProcessamentoPagamento;

public class PayPalPayment implements PaymentStrategy{
    @Override 
    public void pay(double amount){
        System.out.println("PayPal Payment: R$ " + amount);
    }
}
