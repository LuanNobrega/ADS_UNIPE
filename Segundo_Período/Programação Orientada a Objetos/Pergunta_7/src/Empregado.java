public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario_mensal;

    public Empregado(String nome, String sobrenome, double salario_mensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario_mensal = salario_mensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario_mensal=" + salario_mensal +
                '}';
    }

    public void salarioAnual(){
        double salarioAnual;
        salarioAnual = salario_mensal * 12;
        System.out.println("O Salário anual do empregado "+nome+" é: R$ "+salarioAnual);
    }

    public void aumentoSalario(){
        double salarioAnualAumentado;
        double salarioAnual;
        salarioAnual = salario_mensal * 12;
        salarioAnualAumentado = salarioAnual + (salarioAnual * 0.1);
        System.out.println("O Salário anual do empregado "+nome+" com aumento de 10% é: R$ "+salarioAnualAumentado);
    }
}
