public class SistemaLogin {
    
    IAutenticacao autenticacao;

    public SistemaLogin(IAutenticacao autenticacao){
        this.autenticacao = autenticacao;
    }

    public void processar(String usuario, String senha){
        autenticacao.login(usuario, senha);
    }
}
