public class ContaBancaria {
    private String nomeDoDono;
    private double saldo;

    public ContaBancaria(String nome, double s){
        nomeDoDono = nome;
        saldo = s;
    }

    public String getNomeDoDono(){
        return this.nomeDoDono;
    }
    public void setNomeDoDono(String n){
        this.nomeDoDono = n;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double n){
        this.saldo = n;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
        //saldo += valor;
    }

    public void sacar(double valor){
        if(saldo > 0 && saldo > valor){
            saldo = saldo - valor;
            //saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

}
