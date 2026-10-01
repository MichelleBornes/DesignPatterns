public class Produto {
    
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String mostrarNome(){
        return nome;
    }

    public double mostrarPreco(){
        return preco;
    }

    public int mostrarEstoque(){
        return estoque;
    }

    public void adicionarEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    
}
