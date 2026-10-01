public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.processar(new Pix(),100);
        processador.processar(new Cartao(),100);
        processador.processar(new Boleto(),100);
    }
}
