public class Main{
    public static void main(String[] args){

        IImpressao impressao = new Impressora();
        impressao.imprimir();

        IEscaner escanear = new Impressora();
        escanear.escanear();

        IFax fax = new Impressora();
        fax.fax();
    }
}