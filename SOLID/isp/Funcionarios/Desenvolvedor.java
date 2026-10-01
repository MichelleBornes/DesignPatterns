public class Desenvolvedor extends Funcionario implements Trabalhar, Programar{
    
    @Override 
    public void trabalhar(){
        System.out.println("Dev trabalhando...");
    } 

    @Override 
    public void programar(){
        System.out.println("Dev programando...");
    }
}
