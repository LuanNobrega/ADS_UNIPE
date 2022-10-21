public class Pessoa2 {
    private String nome;
    private String cpf;
    private double idade;

    public Pessoa2(String nome, String cpf, double idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa2(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa2{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void fazAniversario(){
        this.idade = idade + 1;
    }


}
