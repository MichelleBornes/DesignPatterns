public class Bicicleta extends Veiculo implements Dirigivel{
    
    @Override 
    public void tipo(){
        System.out.println("Bicicleta");
    }

    @Override 
    public void dirigir(){
        System.out.println("Dirigindo...");
    }
}
