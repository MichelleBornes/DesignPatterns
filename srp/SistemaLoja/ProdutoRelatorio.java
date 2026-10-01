public class ProdutoRelatorio {
    
    public String gerarRelatorio(Produto produto){
        return "Produto: " + produto.mostrarNome()
        + " Preço: " + produto.mostrarPreco()
        + " Estoque: " + produto.mostrarEstoque();

    }
}
