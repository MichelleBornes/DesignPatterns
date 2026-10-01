public class ConsoleLogger implements ILogger{
    
    @Override 
    public void registrar(String mensagem){
        System.out.println("Console: " + mensagem);
    }
}
