package app;

import models.AdmBD;
import models.Dev;
import models.Gerente;
import utils.Departamento;

public class main {
    public static void main(String[] args) {
        Dev d1 = new Dev(123, "Luan", "1234", 4000, "front", "Javascript","React");
        AdmBD a1 = new AdmBD(321, "João", "321", 7000, "MySQL");
        Gerente g1 = new Gerente(213, "Maria", "231", 12000, "Scrum");

        Departamento depto = new Departamento();
        depto.addFuncionario(d1);
        depto.addFuncionario(g1);
        depto.addFuncionario(a1);
        depto.exibeSquad();
        depto.exibeBonificacoes();
    }
}
