public class BancoLogger implements ILogger{
    @Override 
    public void registrar(String mensagem){
        System.out.println("Banco: " + mensagem);
    }
}
