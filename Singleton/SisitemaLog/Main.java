package Singleton.SisitemaLog;

public class Main {
    
    public static void main(String[] args) {
        
        Logger log1 = Logger.getInstancia();
        Logger log2 = Logger.getInstancia();

        log1.registrar("Sistema inciado");
        log2.registrar("Usuário conectado");

        System.out.println("As instâncias são iguais? " + (log1 == log2));
    }
}
