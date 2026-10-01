public class Carro extends Veiculo implements Dirigivel{
    
    @Override 
    public void tipo(){
        System.out.println("Carro");
    }

    @Override
    public void dirigir(){
        System.out.println("Dirigindo...");
    }
}
