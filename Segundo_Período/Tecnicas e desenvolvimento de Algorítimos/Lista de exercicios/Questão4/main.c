#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int num, dobro, triplo = 0;

    printf("Digite um número: ");
    scanf("%d", &num);

    if(num>0){
        dobro = num*num;
        printf("O número é positivo.\nSeu dobro é: %d", dobro);
    }else{
        triplo = num*num*num;
        printf("O número é negativo.\nSeu triplo é: %d", triplo);
    }

    return 0;
}
