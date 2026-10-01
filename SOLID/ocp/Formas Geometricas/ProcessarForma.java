public class ProcessarForma {

    public void processar() {

        Forma forma = new Quadrado();
        double resultado = forma.calcular(10);
        System.out.println("Resultado Quadrado: " + resultado);

        forma = new Circulo();
        resultado = forma.calcular(20);
        System.out.println("Resultado Circulo: " + resultado);
    }
}