public class Cachorro {
    //Atributos(Caracteristicas)
    private String raca;
    private double peso;

    //Método construtor:
    public Cachorro(String raca, double peso){
        this.raca = raca;
        this.peso = peso;
    }

    //Métodos (comportamentos)
    //GET --> Recuperar a informação contida no atibuto;
    public String getRaca(){
        return raca;
    }

    //SET --> Alterar a informação contida no atributo;

    public void setRaca(String raca){
        this.raca = raca;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void latir(){
        System.out.println("Au");
    }

    @Override
    public String toString() {
        return "Cachorro: raca= " + raca + ", peso= " + peso +
                " kg";
    }
}
