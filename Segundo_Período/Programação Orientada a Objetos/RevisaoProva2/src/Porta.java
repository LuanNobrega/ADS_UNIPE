public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double comprimento;
    private double largura;

    public Porta(boolean aberta, String cor, double altura, double comprimento, double largura) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;
    }

    public void pinta(String s){
        this.cor = s;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", comprimento=" + comprimento +
                ", largura=" + largura +
                '}';
    }

    public boolean estaAberta(){
        if(aberta = true){
            System.out.println("A porta está aberta!");
            return true;
        }else{
            System.out.println("A porta está fechada!");
            return false;
        }
    }

}
