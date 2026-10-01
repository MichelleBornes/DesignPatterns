public class Main {
    public static void main(String[] args){
        Relatorio relatorio = new Relatorio("Dados financeiros de setembro");
        RelatorioArquivo arquivo = new RelatorioArquivo();
        RelatorioEmail email = new RelatorioEmail();

        System.out.println("Relatório: " + relatorio.gerar());
        arquivo.salvarArquivo();
        email.enviarEmail();

    }
}
