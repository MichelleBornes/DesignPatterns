public class Main {
    
    public static void main(String[] args) {
        
        IAutenticacao autenticacaoLocal = new AutenticacaoLocal();
        SistemaLogin sistema = new SistemaLogin(autenticacaoLocal);
        sistema.processar("miche.bornes", "1234");

        IAutenticacao autenticacaoLDAP = new AutenticacaoLDAP();
        SistemaLogin sistema2 = new SistemaLogin(autenticacaoLDAP);
        sistema2.processar("bornesm", "2304");

    }
}
