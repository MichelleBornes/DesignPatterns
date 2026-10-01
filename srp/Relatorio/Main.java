public class Main {
    public static void main(String[] args){

        RelatorioFinanceiro relatorio = 
        new RelatorioFinanceiro("Dados financeiros de setembro");
        String resultado = relatorio.gerarRelatorio();

        System.out.println(resultado);

        ServicoEmail email = new ServicoEmail();
        email.enviarEmail(resultado);
    }
}
