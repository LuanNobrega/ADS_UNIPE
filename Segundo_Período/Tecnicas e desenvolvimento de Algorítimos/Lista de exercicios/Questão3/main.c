#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int A = 0;
    int B = 0;
    int soma = 0;
    int multiplicacao = 0;
    int C = 0;

    printf("Insira um valor para A: ");
    scanf("%d", &A);
    printf("Insira um valor para B: ");
    scanf("%d", &B);

    if(A == B){
        soma = A + B;
        C = soma;
        printf("O valor de C é: %d", C);
    }else{
        multiplicacao = A*B;
        C = multiplicacao;
        printf("O valor de C é: %d", multiplicacao);
    }

    return 0;
}
