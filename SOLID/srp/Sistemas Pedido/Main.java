public class Main {
    public static void main(String[] args){

        Pedido pedido = new Pedido("Notebook", 3500);

        PedidoRepository repository = new PedidoRepository();
        EmailService email = new EmailService();

        System.out.println("Produto: " + pedido.nomeProduto());
        System.out.println("Total: " + pedido.calcularTotal());
        repository.salvar(pedido);
        email.enviar(pedido);
    }
}
