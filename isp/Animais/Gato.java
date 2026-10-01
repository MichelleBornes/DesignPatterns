public class Gato extends Animal implements Comer, Andar{
    
    public Gato(String raça, int idade){
        super(raça, idade);
    }

    public void mostrarDados(){
        System.out.println("Raça: " + raça);
        System.out.println("Idade; " + idade);
    }

     @Override
    public void comer(){
        System.out.println("Gato comendo...");
    }

    @Override 
    public void andar(){
        System.out.println("Gato andando...");
    }
}
