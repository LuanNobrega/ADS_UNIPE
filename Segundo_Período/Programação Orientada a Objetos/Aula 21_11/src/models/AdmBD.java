package models;

public class AdmBD extends Funcionario{
    private String bancoMaiorExperiencia;

    public AdmBD(int matricula, String nome, String cpf, double salario, String bancoMaiorExperiencia) {
        super(matricula, nome, cpf, salario);
        this.bancoMaiorExperiencia = bancoMaiorExperiencia;
    }

    public AdmBD(){

    }

    public String getBancoMaiorExperiencia() {
        return bancoMaiorExperiencia;
    }

    public void setBancoMaiorExperiencia(String bancoMaiorExperiencia) {
        this.bancoMaiorExperiencia = bancoMaiorExperiencia;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                " bancoMaiorExperiencia='" + bancoMaiorExperiencia + " ";
    }

    @Override
    public double getBonificacaoAnual(){
        return salario + 0.1;
    }
}
