import java.util.ArrayList;

public class AgendaTelefonica {
    private ArrayList<Contato> contatos;

    public AgendaTelefonica(){
        contatos = new ArrayList<>();
    }

    /*public boolean procuraContato(Contato contato){
        return contatos.contains(contato);
        if(Contatos.indexOf(contato) == -1){
            return false;
        }else {
            return true;
        }
    }*/

    public int procuraContato(Contato contato){
        return contatos.indexOf(contato);
    }

    public void addContato(Contato contato){
        if(procuraContato(contato) == -1) { //O -1 é da propriedade indexOf;
            contatos.add(contato);
        }else{
            System.out.println("Este contato já existe");
        }
    }

    public void removeContato(Contato contato){
        if(procuraContato(contato) == -1) { //O -1 é da propriedade indexOf;
            System.out.println("Este contato não existe");
        }else{
            contatos.remove(contato);
        }
    }

    public void editarContato(Contato contato, String novoNome){
        int indice = procuraContato(contato);
        if (indice == -1){
            System.out.println("Este contato não existe");
        }else{ //se ele existe
            contatos.get(indice).setNome(novoNome);
        }
    }

    public String toString() {
        return "AgendaTelefone{" +
                "contatos=" + contatos +
                '}';
    }
}
