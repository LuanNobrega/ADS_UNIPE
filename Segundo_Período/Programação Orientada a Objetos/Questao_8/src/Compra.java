public class Compra {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

        produto1.setNome("Água");
        produto1.setMarca("Da boa");
        produto1.setCodigo("123456789");
        produto1.setPreco(2.0);

        produto2.setNome("Água com gás");
        produto2.setMarca("Da boa, mas nem tanto");
        produto2.setCodigo("987654321");
        produto2.setPreco(7.5);

        carrinho.setProduto1(produto1);
        carrinho.setProduto2(produto2);

        carrinho.valorASerPago();
    }

}
