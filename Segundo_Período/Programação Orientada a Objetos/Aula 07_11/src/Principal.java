public class Principal {
    public static void main(String[] args) {
        AgendaTelefonica a1 = new AgendaTelefonica();
        Contato c1 = new Contato("Fulano", "eu@eu.com");
        c1.addTelefone("19238921");
        c1.addTelefone("1232131");
        a1.addContato(c1);

        Contato c2 = new Contato("Sicrano","eueu@eu.com");
        a1.addContato(c2);
        System.out.println(a1);
        a1.removeContato(c2.getNome());
        System.out.println(a1);
        a1.editarContato(c1.getNome(),"Beltrano");
        System.out.println(a1);

    }
}
