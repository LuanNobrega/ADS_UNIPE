package models;

public class Diretor extends Pessoa{

    private double salario;
    private String tipoAcesso;

    public Diretor(String nome, String email, String telefone, double salario, String tipoAcesso,String cpf) {
        super(nome, email, telefone,cpf);
        this.salario = salario;
        this.tipoAcesso = tipoAcesso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString() +
                "salario=" + salario +
                ", tipoAcesso='" + tipoAcesso + '\'' +
                '}';
    }
}
