public class Main {
    public static void main(String[] args) {
        
        EmailService email = new EmailService();
        Notificador notificador = new Notificador(email);
       notificador.notificar("olá!");

    }
}
