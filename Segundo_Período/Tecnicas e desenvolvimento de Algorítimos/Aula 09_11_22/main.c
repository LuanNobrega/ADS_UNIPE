#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
/*
typedef struct pessoa{
    int cpf;
    float peso;
    char nome[50]
}t_pessoa;

int main(int argc, char *argv[]){

    t_pessoa p1;
    printf("Hello world!\n");
    printf("Digite seu cpf: ");
    scanf("%d", &p1.cpf);
    printf("Digite seu peso: ");
    scanf("%d", &p1.peso);
    printf("Digite seu Nome: ");
    scanf("%d", &p1.nome);

    printf("O seu cpf é: %d", p1.cpf);
    printf("O seu peso é: %d", p1.peso);
    printf("O seu nome é: %d", p1.nome);

    return 0;


}


//Criar uma estrutura de dados de nome "Aluno" que terá os seguintes atributos: int RGM,
//char nome[50], int cpf, int turma (0, 1 ou 2).
//Criar duas variáveis do tipo aluno que vai receber os dados do usuário.
//Faça um contador para saber quais desses alunos são da turma "0 (ZERO)";

typedef struct aluno{
    int RGM;
    char nome[50];
    int cpf;
    int turma;
}t_aluno;

int main(int argc, char *argv[]){

    setlocale(LC_ALL, "Portuguese");

    t_aluno a1;
    t_aluno a2;

    int count =0;

    printf("Aluno 1, Digite o seu RGM: ");
    scanf("%d", &a1.RGM);
    printf("Aluno 1, Digite o seu nome: ");
    scanf("%s", &a1.nome);
    printf("Aluno 1, Digite o seu CPF: ");
    scanf("%d", &a1.cpf);
    printf("Aluno 1, Digite a sua turma: ");
    scanf("%d", &a1.turma);
    if(a1.turma == 0){
                count++;
            };

    printf("Aluno 2, Digite o seu RGM: ");
    scanf("%d", &a2.RGM);
    printf("Aluno 2, Digite o seu nome: ");
    scanf("%s", &a2.nome);
    printf("Aluno 2, Digite o seu CPF: ");
    scanf("%d", &a2.cpf);
    printf("Aluno 2, Digite a sua turma: ");
    scanf("%d", &a2.turma);
    if(a2.turma == 0){
            count++;
        };


    printf("O RGM do aluno 1 é: %d\n", a1.RGM);
    printf("O nome do aluno 1 é: %s\n", a1.nome);
    printf("O cpf do aluno 1 é: %d\n", a1.cpf);
    printf("O turma do aluno 1 é: %d\n", a1.turma);

    printf("O RGM do aluno 2 é: %d\n", a2.RGM);
    printf("O nome do aluno 2 é: %s\n", a2.nome);
    printf("O cpf do aluno 2 é: %d\n", a2.cpf);
    printf("O turma do aluno 2 é: %d\n", a2.turma);

    printf("Quantos alunos são da turma ZERO: %d", count);

    return 0;



//Criar uma estrutura chamada "animal" com os seguintes atributos:
//char especie, float peso, int quantidades de patas;
//Receba os dados do usuário de dois animais e exiba os dados apenas dos que tiverem mais de 3 patas;

typedef struct anima{
    char especie[50];
    float peso;
    int qtd_patas;
}t_animal;

int main(int argc, char *argv[]){

    setlocale(LC_ALL, "Portuguese");

    t_animal a1;
    t_animal a2;

    int count =0;

    printf("Qual a especie do animal 1: ");
    scanf("%s", &a1.especie);
    printf("Qual o peso do animal 1: ");
    scanf("%f", &a1.peso);
    printf("Quantas patas o animal 1 tem: ");
    scanf("%d", &a1.qtd_patas);



    printf("Qual a especie do animal 2: ");
    scanf("%s", &a2.especie);
    printf("Qual o peso do animal 2: ");
    scanf("%f", &a2.peso);
    printf("Quantas patas o animal 2 tem: ");
    scanf("%d", &a2.qtd_patas);

    if(a1.qtd_patas > 3){
        printf("A espécie do animal 1 é: %s\n", a1.especie);
        printf("O peso do animal 1 é: %f\n", a1.peso);
        printf("A quantidade de patas do animal 1 é: %d\n", a1.qtd_patas);;
    };


    if(a2.qtd_patas > 3){
        printf("A espécie do animal 2 é: %s\n", a2.especie);
        printf("O peso do animal 2 é: %f\n", a2.peso);
        printf("A quantidade de patas do animal 2 é: %d\n", a2.qtd_patas);

    };

    return 0;
}*/

//Criar uma struct chamada pessoa,
//char nome[50], int cpf, int idade, float salario;
//Criar um vetor do tipo pessoa de 10 espaços, receba do usuário os dados e conte quantas pessoas
//recebem entre 3500 e 4500.

typedef struct pessoa{
    char nome[50];
    int cpf;
    int idade;
    float salario;
}t_pessoa;

int main(int argc, char *argv[]){

    setlocale(LC_ALL, "Portuguese");

    t_pessoa pessoa[10];

    int i = 0;
    int count = 0;

    for(i=1; i<12; i++){
        printf("Qual o nome da pessoa %d: ", i);
        scanf("%s", &pessoa[i].nome);
        printf("Qual o cpf da pessoa %d: ", i);
        scanf("%d", &pessoa[i].cpf);
        printf("Qual a idade da pessoa %d: ", i);
        scanf("%d", &pessoa[i].idade);
        printf("Qual o salário da pessoa %d: ", i);
        scanf("%f", &pessoa[i].salario);

        if(pessoa[i].salario >= 3500 && pessoa[i].salario <= 4500){
            count++;
        };
    };

    printf("A quantidade de pessoas que recebem entre 3500 e 4500 é: %d", count);

}

