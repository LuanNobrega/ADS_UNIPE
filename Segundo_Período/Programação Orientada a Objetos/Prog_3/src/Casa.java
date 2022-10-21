public class Casa {
    private String cor;
    private boolean porta1;
    private boolean porta2;
    private boolean porta3;

    public Casa(String cor, boolean porta1, boolean porta2, boolean porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public Casa() {

    }

    public void pintarCasa(String cor){
        this.cor = cor;
        System.out.println("A casa foi pintada da cor:"+this.cor+".");
    }
    public void porta1(boolean p1){
        this.porta1 = p1;
    }
    public void porta2(boolean p2){
        this.porta2 = p2;
    }
    public void porta3(boolean p3){
        this.porta3 = p3;
    }
    public boolean abrePorta(){
        return true;
    }
    public boolean fechaPorta(){
        return false;
    }


    public int qtdDePortasAbertas() {
        int sum = 0;
        if (porta1 == true) {
            sum += 1;
        }
        if (porta2 == true) {
            sum += 1;
        }
        if (porta3 == true) {
            sum += 1;
        }
        return sum;
    }

    public String toString() {
        return "A quantidade de portas abertas é de: "
                + qtdDePortasAbertas()
                + " porta(s) aberta(s)!";
    }
}

