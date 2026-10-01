public class ProdutoDesconto {
    
    public double calcularPrecoComDesconto(double preco, double percentual){
        return preco - (preco * percentual / 100);
    }
}
