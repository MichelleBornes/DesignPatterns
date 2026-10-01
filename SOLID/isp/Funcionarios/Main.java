public class Main {
    public static void main(String[] args) {
        
        Desenvolvedor dev = new Desenvolvedor();
        dev.trabalhar();
        dev.programar();

        Atendente atendente = new Atendente();
        atendente.trabalhar();
        atendente.atender();

        Gerente gerente = new Gerente();
        gerente.trabalhar();
        gerente.gerenciarEquipe();

        Analista analista = new Analista();
        analista.fazerRelatorio();
    }
}
