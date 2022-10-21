#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");
    int A, B, C = 0;

    printf("Digite o valor de A: ");
    scanf("%d", &A);
    printf("Digite o valor de B: ");
    scanf("%d", &B);
    printf("Digite o valor de C: ");
    scanf("%d", &C);

    if(A > B && B > C){
        printf("A sequencia decrescente é: %d %d %d,", A, B, C);
    }else if(A > C && C > B){
        printf("A sequencia decrescente é: %d %d %d,", A, C, B);
    }else if(B > A && A > C){
        printf("A sequencia decrescente é: %d %d %d,", B, A, C);
    }else if(B > C && C > A){
        printf("A sequencia decrescente é: %d %d %d,", B, C, A);
    }else if(C > A && A > B){
        printf("A sequencia decrescente é: %d %d %d,", C, A, B);
    }else if(C > B && B > A){
        printf("A sequencia decrescente é: %d %d %d,", C, B, A);
    }else{
        printf("Existem números iguais!");
    }


    return 0;
}
