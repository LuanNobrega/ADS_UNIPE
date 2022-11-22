package models;

public class Gibi extends Item{
    private String faixaEtaria;
    private String ilustrador;

    public Gibi(int codigo, String titulo, String subtitulo, int anoPublicacao, double preco, String faixaEtaria, String ilustrador) {
        super(codigo, titulo, subtitulo, anoPublicacao, preco);
        this.faixaEtaria = faixaEtaria;
        this.ilustrador = ilustrador;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    @Override
    public String toString() {
        return "Gibi{" + super.toString() +
                "faixaEtaria='" + faixaEtaria + '\'' +
                ", ilustrador='" + ilustrador + '\'' +
                '}';
    }
}
