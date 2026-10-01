public class Pedido {
    private String produto;
    private double valor;

    public Pedido(String produto, double valor){
        this.produto = produto;
        this.valor = valor;
    }

    public String nomeProduto(){
        return produto;
    }

    public double calcularTotal(){
       return valor;
    }
}
