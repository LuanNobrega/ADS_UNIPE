package utils;

import models.Funcionario;
import models.Gerente;

import java.util.ArrayList;

public class Departamento {
    private int codigo;
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        funcionarios = new ArrayList<>();
    }

    public Departamento(){
        funcionarios = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }

    public void exibeSquad(){
        for(Funcionario f : funcionarios) {
            if (f instanceof Gerente) { // instanceof = Significa instancia de...
                System.out.println(f);
            }
        }

        for(Funcionario f : funcionarios){
            if(!(f instanceof Gerente)){ // instanceof = Não for instancia de...
                System.out.println(f);
            }
        }
    }

    public void exibeBonificacoes(){
        for(Funcionario f : funcionarios){
            System.out.println(f.getNome() + " : " + f.getBonificacaoAnual());
        }
    }
}
