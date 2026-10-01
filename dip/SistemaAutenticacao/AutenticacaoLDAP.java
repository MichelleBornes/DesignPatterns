public class AutenticacaoLDAP implements IAutenticacao{
    
    @Override 
    public void login(String usuario, String senha){
        System.out.println("Logando em LDAP...");
    }
}
