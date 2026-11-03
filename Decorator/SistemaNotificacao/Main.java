package Decorator.SistemaNotificacao;

public class Main {
    
    public static void main(String[] args) {
        
        iNotificacao notificacao = new NotificacaoBasica();
        System.out.println("Notificação básica: " + notificacao.descricao());

        notificacao = new EmailDecorator(notificacao);
        System.out.println(notificacao.descricao());

        notificacao = new SMSDecorator(notificacao);
        System.out.println(notificacao.descricao());

        notificacao = new WhatsAppDecorator(notificacao);
        System.out.println(notificacao.descricao());

        iNotificacao notificacao2 = new NotificacaoBasica();

        notificacao2 = new WhatsAppDecorator(notificacao2);
        System.out.println(notificacao2.descricao());

    }
}
