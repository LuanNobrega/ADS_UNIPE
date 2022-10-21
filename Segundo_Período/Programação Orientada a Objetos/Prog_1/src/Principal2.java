import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o seu CPF: ");
        String cpf = input.nextLine();
        System.out.println("Digite a sua idade: ");
        double idade = input.nextDouble();

        Pessoa2 p2 = new Pessoa2(nome, cpf, idade);

        p2.fazAniversario();
        System.out.println(p2);
        p2.fazAniversario();
        p2.fazAniversario();

        System.out.println(p2);



    }
}
