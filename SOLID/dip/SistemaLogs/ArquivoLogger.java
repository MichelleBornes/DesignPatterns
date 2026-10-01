public class ArquivoLogger implements ILogger{
    @Override 
    public void registrar(String mensagem){
        System.out.println("Arquivo: " + mensagem);
    }
}
