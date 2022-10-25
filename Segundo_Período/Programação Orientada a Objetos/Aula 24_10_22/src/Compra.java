import java.util.Arrays;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("coxinha");
        p1.setPreco(2.0);
        System.out.println(p1.getPreco());
        p1.getPreco("R$");

        Produto p2 = new Produto();
        p2.setNome("Iphone");
        p2.setPreco(6000);

        int[] numeros ={1,6,9,4,2};
        int[] numeros2 ={11,1,1,1,1};
        String[] nomes ={"Arnaldo", "Rodolfo", "Maria"};

        Arrays.sort(nomes);
        int posicao = Arrays.binarySearch(nomes,"João");
        System.out.println(Arrays.equals(numeros2,numeros));
        System.out.println(Arrays.toString(nomes));

        Carrinho c1 = new Carrinho(4);
        Carrinho c2 = new Carrinho(1,500,2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2); //não consegue inserir
        c1.getProduto(0).setPreco(500);
        c1.calculaValorTotal();
        System.out.println(c1);

        c1.soma(1,43,5,34,534,5,34,5,253,5,345,2342,34,52,3);
        c1.soma(2.2,3.3,4.4);
    }
}

