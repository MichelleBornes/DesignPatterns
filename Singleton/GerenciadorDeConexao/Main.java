package Singleton.GerenciadorDeConexao;

public class Main {
    
    public static void main(String[] args) {
        
        GerenciadorConexao conexao1 = GerenciadorConexao.getInstancia();
        GerenciadorConexao conexao2 = GerenciadorConexao.getInstancia();

        conexao1.conectar();
        conexao2.conectar();

        System.out.println("As instâncias são iguais? " + (conexao1 == conexao2));
    }
}
