package models;

public class Revista extends Item{
    private int edicao;
    private String nomeDiagramador;

    public Revista(int codigo, String titulo, String subtitulo, int anoPublicacao, double preco, int edicao, String nomeDiagramador) {
        super(codigo, titulo, subtitulo, anoPublicacao, preco);
        this.edicao = edicao;
        this.nomeDiagramador = nomeDiagramador;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getNomeDiagramador() {
        return nomeDiagramador;
    }

    public void setNomeDiagramador(String nomeDiagramador) {
        this.nomeDiagramador = nomeDiagramador;
    }

    @Override
    public String toString() {
        return "Revista{" + super.toString() +
                "edicao=" + edicao +
                ", nomeDiagramador='" + nomeDiagramador + '\'' +
                '}';
    }
}
