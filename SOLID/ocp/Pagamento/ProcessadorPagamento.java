public class ProcessadorPagamento {

    public void processar(Pagamento pagamento, double valor){

        double resultado = pagamento.pagar(valor);
        System.out.println(resultado);
    }
}
