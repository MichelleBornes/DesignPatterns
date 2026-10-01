public class Impressora implements IImpressao, IEscaner, IFax{

    @Override
    public void imprimir(){
        System.out.println("Imprimindo...");
    }

    @Override
    public void escanear(){
        System.out.println("Escaneando...");
    }

    @Override
    public void fax(){
        System.out.println("Enviando fax...");
    }
}