#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int num, dobro, triplo = 0;

    printf("Digite um n�mero: ");
    scanf("%d", &num);

    if(num>0){
        dobro = num*num;
        printf("O n�mero � positivo.\nSeu dobro �: %d", dobro);
    }else{
        triplo = num*num*num;
        printf("O n�mero � negativo.\nSeu triplo �: %d", triplo);
    }

    return 0;
}
