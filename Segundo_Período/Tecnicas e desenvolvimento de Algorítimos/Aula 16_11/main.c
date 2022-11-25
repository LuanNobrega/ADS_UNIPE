#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct aluno{
    float n1;
    float n2;
    float n3;
    float media;
    float menorNota;
    float maiorNota;
}t_aluno;

float media(float x, float y, float z){
    return ((x+y+z)/3);
}

void resultado(float media){
    if(media >= 6){
        printf("APROVADO\n\n");
    }else if(media >=5 && media <6){
        printf("FINAL\n\n");
    }else{
        printf("REPROVADO\n\n");
    }
}

int verificaEntrada(float ent){
    if(ent < 0 || ent >= 10){
        printf("Digite um valor dentro do intervalo de 0 a 10\n");
        return 1;
    }else{
        return 0;
    }
}

int main()
{
    setlocale(LC_ALL, "portuguese");
    int tam = 0;
    int i = 0;
    int segue = 0;
    float maiorMedia = 0;
    float menorMedia = 10;

    printf("Quantos alunos você quer adicionar na turma: ");
    scanf("%d", &tam);

    t_aluno turma[tam];

    for(i=0; i < tam; i++){
        do{
            printf("Digite a primeira nota do aluno %d: \n", i+1);
            scanf("%f", &turma[i].n1);;
        }while(verificaEntrada(turma[i].n1) == 1);
        do{
            printf("Digite a segunda nota do aluno %d: \n", i+1);
            scanf("%f", &turma[i].n2);;
        }while(verificaEntrada(turma[i].n2) == 1);
        do{
            printf("Digite a terceira nota do aluno %d: \n", i+1);
            scanf("%f", &turma[i].n3);;
        }while(verificaEntrada(turma[i].n3) == 1);

        turma[i].menorNota = 10;

        if(turma[i].n1 > turma[i].maiorNota){
            turma[i].maiorNota = turma[i].n1;
        }

        if(turma[i].n1 < turma[i].menorNota){
            turma[i].menorNota = turma[i].n1;
        }

        if(turma[i].n2 > turma[i].maiorNota){
            turma[i].maiorNota = turma[i].n2;
        }

        if(turma[i].n2 < turma[i].menorNota){
            turma[i].menorNota = turma[i].n2;
        }

        if(turma[i].n3 > turma[i].maiorNota){
            turma[i].maiorNota = turma[i].n3;
        }

        if(turma[i].n3 < turma[i].menorNota){
            turma[i].menorNota = turma[i].n3;
        }

        printf("Maior nota é: %f\n", turma[i].maiorNota);
        printf("Menor nota é: %f\n", turma[i].menorNota);

        turma[i].media = media(turma[i].n1, turma[i].n2, turma[i].n3);

        printf("A média do aluno é: %0.2f\n", turma[i].media);

        resultado(turma[i].media);

        if(turma[i].media > maiorMedia){
            maiorMedia = turma[i].media;
        }

        if(turma[i].media < menorMedia){
            menorMedia = turma[i].media;
        }
    }

    printf("Maior média: %f", maiorMedia);
    printf("Menor média: %f", menorMedia);

    return 0;
}
