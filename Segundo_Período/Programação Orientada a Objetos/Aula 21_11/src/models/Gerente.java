package models;

public class Gerente extends Funcionario{
    private String especialidade;

    public Gerente(int matricula, String nome, String cpf, double salario, String especialidade) {
        super(matricula, nome, cpf, salario);
        this.especialidade = especialidade;
    }

    public Gerente(){

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public double getBonificacaoAnual(){
        return salario + 0.2;
    }
}
