public class Casa {

    private boolean aberta;
    private String cor;
    private String porta1;
    private String porta2;
    private String porta3;

    public Casa(boolean aberta, String cor, String porta1, String)

    public boolean getAberta(){
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

    public void pintar(String p){
        this.cor = p;
    }

    private void abre(){
        this.aberta = true;
    }
    private void fecha(){
        this.aberta = false;
    }
}
