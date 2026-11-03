package Decorator.SistemaNotificacao;

public class WhatsAppDecorator extends NotificacaoDecorator{

    public WhatsAppDecorator(iNotificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String descricao() {
        return notificacao.descricao() + " + notificação por WhatsApp";
    }
    
}
