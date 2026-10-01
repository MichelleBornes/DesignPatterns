public class Cachorro extends Animal implements Comer, Andar, Nadar{
    
    public Cachorro(String raça, int idade){
        super(raça, idade);
    }

    public void mostrarDados(){
        System.out.println("Raça: " + raça);
        System.out.println("Idade: " + idade);
    }

    @Override 
    public void comer(){
        System.out.println("Cachorro comendo...");
    }

    @Override 
    public void andar(){
        System.out.println("Cachorro andando...");
    }

    @Override 
    public void nadar(){
        System.out.println("Cachorro nadando...");
    }
}
