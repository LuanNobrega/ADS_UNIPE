package aplication;

import models.Aluno;
import models.Professor;
import utils.Disciplina;

public class Principal {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Girafales","girafales@eu.com",
                "129382103","doutor",2500.00,"1231231");

        Disciplina d1 = new Disciplina(01,"Cálculo 1",prof1);
        Disciplina d2 = new Disciplina(02,"POO",prof1);

        Aluno a1 = new Aluno("João", "joao@eu.com","213213",
                9.2,"1231231");
        a1.addDisciplina(d1);
        a1.addDisciplina(d2);
        a1.removeDisciplina(d2.getNome());

    }
}
    //Lê sobre herânça;
    //Fazer uma classe mãe chamada automóvel e criar classes filhas como moto, caminhão
    //triciclo, etc.
