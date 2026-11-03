package Singleton.GerenciadorDeConexao;

public class GerenciadorConexao {

    private static GerenciadorConexao instancia;

    private GerenciadorConexao(){

    }

    public static GerenciadorConexao getInstancia(){
        if(instancia == null){
            instancia = new GerenciadorConexao(); 
        }

        return instancia;
    }

    public void conectar(){
        System.out.println("Conexão estabelecida!");
    }
    
}
