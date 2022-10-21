import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome1;
        String sobrenome1;
        double salarioMensal1;
        System.out.println("Insira o nome do empregado 1: ");
        nome1 = input.nextLine();
        System.out.println("Insira o sobrenome do empregado 1: ");
        sobrenome1 = input.nextLine();
        System.out.println("Insira o salário mensal do empregado 1: ");
        salarioMensal1 = input.nextDouble();
        input.nextLine();
        Empregado emp1 = new Empregado(nome1,sobrenome1,salarioMensal1);

        String nome2;
        String sobrenome2;
        double salarioMensal2;
        System.out.println("\nInsira o nome do empregado 2: ");
        nome2 = input.nextLine();
        System.out.println("Insira o sobrenome do empregado 2: ");
        sobrenome2 = input.nextLine();
        System.out.println("Insira o salário mensal do empregado 2: ");
        salarioMensal2 = input.nextDouble();
        Empregado emp2 = new Empregado(nome2, sobrenome2, salarioMensal2);

        emp1.salarioAnual();
        emp2.salarioAnual();
        emp1.aumentoSalario();
        emp2.aumentoSalario();
    }
}
