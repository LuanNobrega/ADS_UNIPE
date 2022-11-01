import java.util.ArrayList;

public class Carrinho {
    private int codigo;
    private double valorTotal;
    private ArrayList<Produto> produtos;

    public Carrinho(){
        produtos = new ArrayList<>();

    }
    public Carrinho(int codigo, double valorTotal){
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        produtos = new ArrayList<>();

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

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public Produto getProduto(int indice){
        return produtos.get(indice); //retorna o produto que está naquela posição
    }
    public int getProduto(Produto produto){
        return produtos.indexOf(produto); //retorna a posição do produto
    }
    public void addProduto(Produto p){
        produtos.add(p); //adiciona o produto p no fim da lista
    }
    public void addProduto(Produto p, int indice){
        produtos.add(indice,p); //adiciona o produto naquela posição
    }

    public void calculaValorTotal(){
        valorTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++){
            valorTotal += produtos.get(i).getPreco();
        }
        //forEach
       /* for (Produto p : produtos)
            valorTotal += p.getPreco();*/
    }
    public String toString(){
        return "Carrinho com código " + codigo +
                " e valor R$" + valorTotal +
                "\nProdutos: " + produtos;
    }
}
