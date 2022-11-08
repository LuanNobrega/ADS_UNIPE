package models;

import utils.Disciplina;

import java.util.ArrayList;

public class Aluno extends Pessoa{

    private double cra;
    private ArrayList<Disciplina> disciplinas;

    public Aluno(String nome, String email, String telefone, double cra,String cpf) {
        super(nome, email, telefone,cpf);
        this.cra = cra;
        disciplinas = new ArrayList<>();
    }


    public double getCra() {
        return cra;
    }

    public void setCra(double cra) {
        this.cra = cra;
    }

    public int encontraDisciplina(String nomeDisciplina) {
        for (Disciplina d : disciplinas){
            if (nomeDisciplina.equals(d.getNome())){
                return disciplinas.indexOf(d);
            }
        }
        return -1;
    }

    public void addDisciplina(Disciplina d) {
        if(encontraDisciplina(d.getNome()) == -1){
            disciplinas.add(d);
        }else{
            System.out.println("A disciplina já existe!");
        }
    }

    public void removeDisciplina(String nomeDisciplina) {
        int indice = encontraDisciplina(nomeDisciplina);
        if(indice == -1){
            System.out.println("A disciplina não existe");
        }else{
            disciplinas.remove(indice);
        }
    }


    public String toString() {
        return "Aluno{" +
                super.toString() + //nome, email, telefone
                ", cra=" + cra +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
