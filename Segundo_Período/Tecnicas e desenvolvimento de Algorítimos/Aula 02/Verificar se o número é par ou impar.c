#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    // VERIFICAR SE UM N�MERO � PAR OU IMPAR:

    int numero1 = 0;

    printf("Digite o n�mero a ser verificado: ");
    scanf("%d", &numero1);

    if (numero1 %2 == 0){
        printf("O n�mero � PAR");
    } else {
        printf("O n�mero � IMPAR");
    }

}
