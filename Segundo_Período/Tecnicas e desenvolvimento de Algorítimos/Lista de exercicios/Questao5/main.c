#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int num = 0;

    printf("Digite um n�mero.");
    scanf("%d", &num);

    if(num%2 == 0){
        num = num + 5;
        printf("A vari�vel � par!\nO resultado final �: %d", num);
    }else{
        num = num + 8;
        printf("A vari�vel � impar!\nO resultado final �: %d", num);
    }

    return 0;
}
