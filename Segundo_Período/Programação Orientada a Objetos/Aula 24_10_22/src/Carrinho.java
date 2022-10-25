import java.util.Arrays;

public class Carrinho {
    private int codigo;
    private double valorTotal;
    private Produto[] produtos;

    public Carrinho(int tamanhoArray){
        produtos = new Produto[tamanhoArray];

    }
    public Carrinho(int codigo, double valorTotal, int tamanhoArray){
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        produtos = new Produto[tamanhoArray];

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto[] getProdutos(){
        return produtos;
    }

    public Produto getProduto(int indice){
        return produtos[indice];
    }
    public void addProduto(Produto p){
        if (produtos[produtos.length - 1] != null){ //array cheio
            System.out.println("Array cheio!\nNão foi possível adicionar o produto " + p.getNome());
        }else {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] == null) {
                    produtos[i] = p;
                    break;
                }
            }
        }
    }

    public void soma(int...numeros){
        int somaNumeros = 0;
        for (int numero : numeros) {
            somaNumeros += numero;
        }
        System.out.println(somaNumeros);
    }

    public void soma(double a, double b, double c){
        System.out.println(a+b+c);
    }

    public void calculaValorTotal(){
        valorTotal = 0.0;
//        for (int i = 0; i< produtos.length; i++){
//            Produto p = produtos[i];
//            soma += p.getPreco();
//        }
        //forEach
        for (Produto p : produtos) {
            valorTotal += p.getPreco();
        }
    }
    public String toString(){
        return "Carrinho com código " + codigo +
                " e valor R$" + valorTotal +
                "\nProdutos: " + Arrays.toString(produtos);
    }
}
