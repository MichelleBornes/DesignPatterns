public class RelatorioFinanceiro{
    
    private String conteudo;

    public RelatorioFinanceiro(String conteudo){
        this.conteudo = conteudo;
    }

    public String gerarRelatorio(){
       return "Relatório gerado: " + conteudo;
    }

}