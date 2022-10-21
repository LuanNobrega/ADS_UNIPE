public class Aula04 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("NICK", "Amarela", 0.4f);
        Caneta c2 = new Caneta("BIC", "Preta", 0.8f);
        //c1.setModelo("BIC");
        //c1.modelo = "BIC";
        //c1.setPonta(0.5f);
        //System.out.println("Tenho uma caneta " + c1.getModelo() +" de ponta "+c1.getPonta());
        c1.status();
        c2.status();
    }
}
