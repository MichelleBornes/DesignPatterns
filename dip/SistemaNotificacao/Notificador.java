public class Notificador {

    ServicoMensagem servicoMensagem;

    public Notificador(ServicoMensagem servicoMensagem){
        this.servicoMensagem = servicoMensagem;
    }

    public void notificar(String mensagem){
        servicoMensagem.enviar(mensagem);
    }
}
