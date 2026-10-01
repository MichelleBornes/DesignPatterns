public class Main {
    
    public static void main(String[] args) {
        
        Desconto desconto = new ClienteComum();
        desconto.calcular(150);

        desconto = new ClienteVip();
        desconto.calcular(120);
    }
}
