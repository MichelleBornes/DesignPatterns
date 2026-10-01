public class Main {
    public static void main(String[] args) {
        
        CartaoCredito credito = new CartaoCredito();
        Checkout checkout = new Checkout(credito);
        checkout.checkar(30);

        Pix pix = new Pix();
        Checkout checkout2 = new Checkout(pix);
        checkout2.checkar(25);
    }
}
