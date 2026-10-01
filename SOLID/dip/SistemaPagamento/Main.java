public class Main {
    public static void main(String[] args) {
        
        CartaoCredito credito = new CartaoCredito();
        Checkout checkout = new Checkout(credito);
        checkout.checkar();
    }
}
