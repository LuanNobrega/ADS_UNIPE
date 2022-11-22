package models;

public class Livro extends Item{
    private String isbn;
    private String editora;

    public Livro(int codigo, String titulo, String subtitulo, int anoPublicacao, double preco, String isbn, String editora) {
        super(codigo, titulo, subtitulo, anoPublicacao, preco);
        this.isbn = isbn;
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" + super.toString() +
                "isbn='" + isbn + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }

    @Override
    public void printaTituloCompleto(){
        System.out.println(titulo + "" + getSubtitulo());
    }
}
