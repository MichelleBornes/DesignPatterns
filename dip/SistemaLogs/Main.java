public class Main {
    public static void main(String[] args) {
        
        ConsoleLogger console = new ConsoleLogger();
        Aplicacao aplicacao = new Aplicacao(console);
        aplicacao.aplicar("coletando log...");
    }
}
