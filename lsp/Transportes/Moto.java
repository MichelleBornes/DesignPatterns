public class Moto extends Veiculo implements Dirigivel{
    
    @Override 
    public void tipo(){
        System.out.println("Moto");
    }

    @Override 
    public void dirigir(){
        System.out.println("Dirigindo...");
    }
}
