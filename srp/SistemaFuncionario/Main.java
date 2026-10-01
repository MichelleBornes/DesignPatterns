import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Michelle", 2500);
        FuncionarioRepository repository = new FuncionarioRepository();
        FuncionarioRelatorio relatorio = new FuncionarioRelatorio();
        EmailService email = new EmailService();

        System.out.println("Funcionario: " + funcionario.mostrarNome());
        System.out.println("Salário: " + funcionario.mostrarSalario());
        repository.salvar();
        relatorio.gerarRelatorio();
        email.enviarEmail();
    }
}
