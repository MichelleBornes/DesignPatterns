public class Gerente extends Funcionario implements Trabalhar, Gerenciar{
    
    @Override 
    public void trabalhar(){
        System.out.println("Gerente trabalhando...");
    }

    @Override 
    public void gerenciarEquipe(){
        System.out.println("Gerenciando a equipe...");
    }
}
