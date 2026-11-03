package Decorator.SistemaNotificacao;

public abstract class NotificacaoDecorator implements iNotificacao{

    protected iNotificacao notificacao;

    public NotificacaoDecorator(iNotificacao notificacao){
        this.notificacao = notificacao;
    }
    
}
