
#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    float num1 = 0;
    float num2 = 0;
    float maiorNum = 0;
    float menorNum = 0;

    printf("Digite o primeiro n�mero: ");
    scanf("%f", &num1);
    printf("Digite o segundo n�mero: ");
    scanf("%f", &num2);

    if(num1 > num2){
        printf("O maior n�mero �: %0.1f e o menor n�mero �: %0.1f",num1, num2);
    }else if(num2 > num1) {
        printf("O maior n�mero �: %0.1f e o menor n�mero �: %0.1f",num2, num1);
    }else{
        printf("Os n�meros s�o iguais");
    }
}
