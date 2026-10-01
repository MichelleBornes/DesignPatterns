public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario();
        usuario.cadastrar("Michelle");
        
        Email email = new Email();
        email.enviarEmail("michelle@gmail.com");

        Banco banco = new Banco();
        banco.salvarNoBanco();
    }
}
