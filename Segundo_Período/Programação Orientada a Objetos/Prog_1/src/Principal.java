import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();

        Pessoa p1 = new Pessoa(name, idade);

        p1.fazAniversario(1);
        p1.fazAniversario(1);
        p1.fazAniversario(1);
        p1.fazAniversario(1);
        p1.fazAniversario(1);

        System.out.println("Parabéns "+p1.getName()+", sua idade nova é: "+p1.getIdade());

    }
}
