public class Main {
    
    public static void main(String[] args) {
        
        Relatorio relatorio = new PDF();
        relatorio.gerar();

        relatorio = new EXCEL();
        relatorio.gerar();

        relatorio = new CSV();
        relatorio.gerar();

        relatorio = new JSON();
        relatorio.gerar();
    }
}
