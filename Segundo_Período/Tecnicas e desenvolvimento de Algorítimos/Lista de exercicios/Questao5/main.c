#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int num = 0;

    printf("Digite um número.");
    scanf("%d", &num);

    if(num%2 == 0){
        num = num + 5;
        printf("A variável é par!\nO resultado final é: %d", num);
    }else{
        num = num + 8;
        printf("A variável é impar!\nO resultado final é: %d", num);
    }

    return 0;
}
