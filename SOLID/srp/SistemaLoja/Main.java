public class Main {
    
    public static void main(String[] args){

        Produto produto = new Produto("Notebook", 3500, 10);

        ProdutoEstoque estoque = new ProdutoEstoque();
        ProdutoDesconto desconto = new ProdutoDesconto();
        ProdutoRepository repository = new ProdutoRepository();
        ProdutoRelatorio relatorio = new ProdutoRelatorio();
        EmailService email = new EmailService();


        produto.adicionarEstoque(10);
        produto.removerEstoque(5);

        repository.salvarBanco(produto);

        String resultado = relatorio.gerarRelatorio(produto);
        System.out.println(resultado);
        email.enviarEmail(resultado);
    }   
}
