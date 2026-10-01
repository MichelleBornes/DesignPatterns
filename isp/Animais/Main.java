public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro("Labrador", 4);
        cachorro.mostrarDados();
        cachorro.comer();
        cachorro.andar();
        cachorro.nadar();

        Gato gato = new Gato("Gato", 3);
        gato.mostrarDados();
        gato.comer();
        gato.andar();
    }
}
