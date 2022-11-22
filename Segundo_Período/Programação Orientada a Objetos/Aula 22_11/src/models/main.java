package models;

public class main {
    public static void main(String[] args) {
        Autor a1 = new Autor("JRR", "Sobrenome1", "Brasil");
        Autor a2 = new Autor("Autor2", "Sobrenome2", "Brasil");
        Gibi g1 = new Gibi(1,"Turma da Mônica","Cebolinha x Mônica",1989,2.50,"Maurício de Souza","06-12 anos");
        Revista r1 = new Revista(2,"Capricho","asdsa",2002,38,01,"Sicrano");
        Livro l1 = new Livro(3,"Senhor dos Anéis", "A sociedade do anel",1978,35.78,"Martins Fontes","2132131-0-23");

        //polimorfismo
        Item i1;
        //i1 = new Revista();
        //i1 = new Livro();
        //i1 = new Gibi();

        //Revista r2 = new Livro(); --- NÃO PODE
        l1.addAutor(a1);
        g1.addAutor(a2);
        r1.addAutor(a2);
        l1.printaTituloCompleto();
        r1.printaTituloCompleto();
        //polimorfismo
        imprimeTituloECodigo(l1);
        imprimeTituloECodigo(r1);
        imprimeTituloECodigo(g1);

    }
    /*public static void imprimeTituloECodigo(Revista r){
       System.out.println(r.getCodigo() + " " + r.getTitulo());
    }
    public static void imprimeTituloECodigo(Livro r){
       System.out.println(r.getCodigo() + " " + r.getTitulo());
    }
    public static void imprimeTituloECodigo(Gibi r){
       System.out.println(r.getCodigo() + " " + r.getTitulo());
    }*/
    public static void imprimeTituloECodigo(Item i){ //polimorfismo
        System.out.println(i.getCodigo() + " " + i.getTitulo());
    }

}
