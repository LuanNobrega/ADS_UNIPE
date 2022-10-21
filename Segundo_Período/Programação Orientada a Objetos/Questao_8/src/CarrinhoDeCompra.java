public class CarrinhoDeCompra {

    private String codigo;
    private Produto produto1;
    private Produto produto2;

    public CarrinhoDeCompra(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public void setProduto1(Produto produto1) {
        this.produto1 = produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }

    public void setProduto2(Produto produto2) {
        this.produto2 = produto2;
    }

    public void valorASerPago(){
        double valorFinal;
        valorFinal = produto1.getPreco() + produto2.getPreco();
        System.out.println("O valor total a ser pago é: R$ "+valorFinal);
    }

    public String toString() {
        return "CarrinhoDeCompra{" +
                "codigo='" + codigo + '\'' +
                ", produto1=" + produto1 +
                ", produto2=" + produto2 +
                '}';
    }
}
