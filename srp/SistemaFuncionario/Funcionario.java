public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String mostrarNome(){
        return nome;
    }

    public double mostrarSalario(){
        return salario;
    }
}
