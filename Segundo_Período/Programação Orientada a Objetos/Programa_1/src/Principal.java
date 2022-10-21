public class Principal {
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        p1.setName("Luan");
        p1.setIdade(30);

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.println(p1.toString());
    }
}
