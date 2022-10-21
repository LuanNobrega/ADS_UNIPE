#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");
    int a = 0;
    int b = 0;
    int c = 0;
    int soma = 0;

    printf("Digite o valor de a: \n");
    scanf("%d", &a);
    printf("Digite o valor de b: \n");
    scanf("%d", &b);
    printf("Digite o valor de c: \n");
    scanf("%d", &c);

    soma = a + b;

    if(soma < c){
        printf("A soma de a e b é menor que c.");
    }else{
        printf("A soma de a e b é maior que c.");
    }

    return 0;
}
