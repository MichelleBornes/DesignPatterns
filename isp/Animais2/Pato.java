public class Pato extends Animal implements Voador, Nadador, Corredor{
    
    @Override 
    public void voar(){
        System.out.println("Pato voador...");
    }

    @Override 
    public void nadar(){
        System.out.println("Pato nadador...");
    }

    @Override 
    public void correr(){
        System.out.println("Pato corredor...");
    }
}
