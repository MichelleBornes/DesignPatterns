package Strategy.ProcessamentoPagamento;

public class BankTransferPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Bank Transfer Payment: R$ " + amount);
    }
    
}
