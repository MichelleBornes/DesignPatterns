public class Analista extends Funcionario implements Relatorio{
    
    @Override 
    public void fazerRelatorio(){
        System.out.println("Analista fazendo relatório...");
    }
    
}
