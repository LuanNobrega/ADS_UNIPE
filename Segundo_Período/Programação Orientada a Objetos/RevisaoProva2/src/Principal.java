import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Porta p1 = new Porta(true,"a",1,1,1);
        System.out.println("A porta está aberta, true ou false?: ");
        p1.setAberta(input.nextBoolean());
        System.out.println("Digite a sua cor: ");
        p1.setCor(input.next());
        System.out.println("Digite a sua Altura: ");
        p1.setAltura(input.nextDouble());
        System.out.println("Digite o seu comprimento: ");
        p1.setComprimento(input.nextDouble());
        System.out.println("Digite a sua largura: ");
        p1.setLargura(input.nextDouble());
        System.out.println(p1);











    }
}
