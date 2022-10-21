public class Principal {
    public static void main(String[] args){
        Porta p1 = new Porta();

        p1.abre();
        p1.fecha();
        p1.pinta("Vermelho");
        p1.pinta("Azul");
        p1.pinta("VBranco");
        p1.setDimensaoX(1.5);
        p1.setDimensaoY(1.4);
        p1.setDimensaoZ(1.0);
        p1.setDimensaoX(1.1);
        p1.setDimensaoY(1.0);
        p1.setDimensaoZ(0.8);
        p1.setDimensaoX(1.0);
        p1.setDimensaoY(0.8);
        p1.setDimensaoZ(0.5);
        p1.estaAberta();
    }
}
