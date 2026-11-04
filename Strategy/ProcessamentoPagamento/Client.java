package Strategy.ProcessamentoPagamento;

public class Client {
    
    public static void main(String[] args) {
        
        PaymentContext payment = new PaymentContext(new CreditCardPayment());
        payment.execute(150);

        payment.setStrategy(new BankTransferPayment());
        payment.execute(300);

        payment.setStrategy(new PayPalPayment());
        payment.execute(450);
    }
}
