package Decorator.SistemaNotificacao;

public class SMSDecorator extends NotificacaoDecorator{

    public SMSDecorator(iNotificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String descricao() {
        return notificacao.descricao() + " + notificação por SMS";
    }
    
}
