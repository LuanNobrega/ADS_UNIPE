public class Principal {
    public static void main(String[] args){
        Porta p1 = new Porta();
        p1.abre();
        p1.estaAberta();
        p1.fecha();
        p1.estaAberta();
        p1.pinta("Amarelo");
        p1.pinta("Verde");
        p1.pinta("Cinza");
        p1.setDimensaoX(1.9);
        p1.setDimensaoY(1.1);
        p1.setDimensaoZ(0.3);
        System.out.println(p1);
        p1.setDimensaoX(2.0);
        p1.setDimensaoY(1.2);
        p1.setDimensaoZ(0.22);
        System.out.println(p1);

    }
}
