public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Cachorro();
        animal.emitirSom();

        animal = new Gato();
        animal.emitirSom();

        Carro carro = new Carro();
        carro.emitirSom();
    }
}
