#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    // VERIFICAR SE UM NÚMERO É PAR OU IMPAR:

    int numero1 = 0;

    printf("Digite o número a ser verificado: ");
    scanf("%d", &numero1);

    if (numero1 %2 == 0){
        printf("O número é PAR");
    } else {
        printf("O número é IMPAR");
    }

}
