public class EmailService implements ServicoMensagem{
    
    @Override 
    public void enviar(String mensagem){
        System.out.println("Mensagem: " + mensagem);
    }
}
