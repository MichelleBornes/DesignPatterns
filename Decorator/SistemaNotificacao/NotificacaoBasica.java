package Decorator.SistemaNotificacao;

public class NotificacaoBasica implements iNotificacao{

    @Override
    public String descricao() {
        return "mensagem simples";
    }
    
}
