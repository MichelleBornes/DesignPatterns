public class ClienteVip implements Desconto{
    
    public void calcular(double valor){
        System.out.println("Cliente VIP: " + valor * 0.90);
    }
}
