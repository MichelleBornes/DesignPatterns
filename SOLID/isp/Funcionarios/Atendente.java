public class Atendente extends Funcionario implements Trabalhar, AtenderCliente{
    
    @Override 
    public void trabalhar(){
        System.out.println("Atendente trabalhando...");
    }

     @Override 
    public void atender(){
        System.out.println("Atendente atendendo cliente...");
    }
}
