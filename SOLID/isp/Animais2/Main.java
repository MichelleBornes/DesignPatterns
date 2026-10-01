public class Main {
    
    public static void main(String[] args) {
        
        Voador voador = new Pato();
        voador.voar();

        Nadador nadador = new Pato();
        nadador.nadar();

        Corredor corredor = new Pato();
        corredor.correr();
        
        Nadador nadador2 = new Peixe();
        nadador2.nadar();

        
    }
}
