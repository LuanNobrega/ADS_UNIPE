public class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }
}
