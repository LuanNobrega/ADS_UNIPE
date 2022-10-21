public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public boolean isAberta() {
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

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
    this.aberta = false;
    }

    public void pinta(String cor){
        this.cor = cor;
        System.out.println("Você pintou de "+cor);
    }

    public boolean estaAberta(){
        if(this.aberta == true){
            System.out.println("A porta está aberta!");
            return true;
        }else{
            System.out.println("A porta está fechada!");
            return false;
        }
    }

    public String toString(){
        return "A porta tem "
                +dimensaoX+ " de altura, com "
                +dimensaoY+ " de largura e "
                +dimensaoZ+ " de espessura";
    }

}
