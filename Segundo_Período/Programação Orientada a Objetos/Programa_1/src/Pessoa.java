public class Pessoa {
    public String name;
    public double idade;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade){
        this.idade = idade;
    }

    public String toString() {
        return name + ", depois de acrescentar seus aniversários, agora você tem " + idade + " anos.";
    }

    public void fazAniversario(){
        idade = idade + 1;
    }

}
