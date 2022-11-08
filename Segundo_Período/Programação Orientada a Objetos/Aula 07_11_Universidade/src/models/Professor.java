package models;

public class Professor extends Pessoa{

    private String titularidade;
    private double salario;

    public Professor(String nome, String email, String telefone, String titularidade, double salario, String cpf) {
        super(nome,email,telefone,cpf); //construtor da superclasse

        this.titularidade = titularidade;
        this.salario = salario;
    }


    public String getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String toString() {
        return "Professor{" +
                super.toString() +
                ", titularidade='" + titularidade + '\'' +
                ", salario=" + salario +
                '}';
    }
}
