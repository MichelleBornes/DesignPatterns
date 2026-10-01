import java.util.WeakHashMap;

public class Main {
    
    public static void main(String[] args) {
        
        Notificacao notificacao = new Email();
        notificacao.enviar("Email enviado!");

        notificacao = new SMS();
        notificacao.enviar("SMS enviado!");

        notificacao = new WhatsApp();
        notificacao.enviar("WhatsApp enviado!");

        notificacao = new Telegram();
        notificacao.enviar("Telegram enviado!");

    }
}
