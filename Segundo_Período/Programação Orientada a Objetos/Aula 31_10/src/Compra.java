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



        Carrinho c1 = new Carrinho();
        Carrinho c2 = new Carrinho(1,500);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1);
        c1.addProduto(p2);
        c1.addProduto(p1,0);
        c1.getProduto(0).setPreco(500);
        System.out.println(c1.getProduto(p1));
        c1.calculaValorTotal();
        System.out.println(c1);
    }
}

