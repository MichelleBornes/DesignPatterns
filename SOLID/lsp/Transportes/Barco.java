public class Barco extends Veiculo implements Navegavel{
    
    @Override 
    public void tipo(){
        System.out.println("Barco");
    }

    @Override
    public void navegar(){
        System.out.println("Navegando...");
    }
}
