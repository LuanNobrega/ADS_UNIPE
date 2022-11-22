package models;

public class Dev extends  Funcionario{
    private String tipo;
    private String linguagemPrincipal;
    private String stack;

    public Dev(int matricula, String nome, String cpf, double salario, String tipo, String linguagemPrincipal, String stack) {
        super(matricula, nome, cpf, salario);
        this.tipo = tipo;
        this.linguagemPrincipal = linguagemPrincipal;
        this.stack = stack;
    }

    public Dev(){

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "" + super.toString() +
                "tipo='" + tipo + '\'' +
                ", linguagemPrincipal='" + linguagemPrincipal + '\'' +
                ", stack='" + stack + '\''
                ;
    }

    @Override
    public double getBonificacaoAnual(){
        return salario + 0.1;
    }
}
