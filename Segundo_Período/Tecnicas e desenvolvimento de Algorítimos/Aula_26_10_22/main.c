//EXEMPLO 1:
/*
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
typedef struct agenda {
    char nome[70];
    char endereco[120];
    int telefone;
}t_agenda;

int main()
{
    setlocale(LC_ALL, "portuguese");
    t_agenda contato = {"Luan", "Rua Rua", 828442};
    printf("Nome: %s\n", contato.nome);
    printf("Endereço: %s\n", contato.endereco);
    printf("Telefone: %d\n", contato.telefone);

    printf("Hello world!\n");
    return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct agenda {
    char nome[20];
    int telefone;
}t_agenda;

int main(){
    setlocale(LC_ALL, "portuguese");
    t_agenda contato[4];
    int i;

    for(i = 0; i < 4; i ++){
        printf("Digite o nome: ");
        scanf("%s", &contato[i].nome);
        printf("Digite o telefone: ");
        scanf("%d", &contato[i].telefone);
    }
    for(i = 0; i < 4; i++){
        printf("%s",contato[i].nome);
        printf("%d",contato[i].telefone);
    }

}*/

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "portuguese");
    /*
    int matriz[3][3];
    int l = 0;
    int c = 0;

    for(l=0; l<3; l++){
        for(c=0; c<3; c++){
            printf("Digite um valor: ");
            scanf("%d", &matriz[l][c]);
        }
    }


    printf("Digite um valor: ");
    scanf("%d", &matriz[0][0]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[0][1]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[0][2]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[1][0]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[1][1]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[1][2]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[2][0]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[2][1]);
    printf("Digite um valor: ");
    scanf("%d", &matriz[2][2]);


    printf("%d - %d - %d\n",matriz[0][0],matriz[0][1],matriz[0][2]);
    printf("%d - %d - %d\n",matriz[1][0],matriz[1][1],matriz[1][2]);
    printf("%d - %d - %d\n",matriz[2][0],matriz[2][1],matriz[2][2]);
    */

    //Criar matriz 4x4 e os valores sendo adicionados pelo usuário
    //1 - Mostre a soma de todos os elementos da matriz;
    //2 - Mostre apenas os elementos da diagonal principal;
    //3 - Conte quantos elementos estão entre 15 e 35;

    int matriz[4][4];

    int l=0;
    int c=0;
    int soma = 0;
    int contador = 0;


    for(l=0; l<4; l++){
        for(c=0; c<4; c++){
            printf("Digite um valor ");
            scanf("%d", &matriz[l][c]);
            soma = soma + matriz[l][c];
        }
    }

    printf("Soma é igual a %d\n", soma);


    printf("Elementos da diagonal:\n");
    for(l=0; l<4; l++){
            for(c=0; c<4; c++){
                if(l == c){
                   printf("%d\n",matriz[l][c]);
                }
            }
    }



    for(l=0; l<4; l++){
        for(c=0; c<4; c++){
           if(matriz[l][c] >= 15 && matriz[l][c] <= 35){
            contador = contador + 1;
           }
        }
    }

    printf("A quantidade de elementos dentro do intervalo é: %d", contador);

}









