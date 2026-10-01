public class ProdutoEstoque {
    
    public void adicionarEstoque(Produto produto, int quantidade){
        produto.adicionarEstoque(quantidade);
    }

    public void removerEstoque(Produto produto, int quantidade){
        produto.removerEstoque(quantidade);
    }
}
