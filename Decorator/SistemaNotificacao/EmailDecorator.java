package Decorator.SistemaNotificacao;

public class EmailDecorator extends NotificacaoDecorator{

    public EmailDecorator(iNotificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String descricao() {
        return notificacao.descricao() + " + notificação por e-mail";
    }
    
}
