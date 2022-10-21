#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    float peso, altura, IMC = 0.0;

    printf("Digite o seu peso atual: ");
    scanf("%f", &peso);
    printf("Digite a sua altura: ");
    scanf("%f", &altura);

    IMC = (peso/(altura*altura));

    if(IMC <= 18.5){
        printf("Abaixo do peso!");
    }else if(IMC > 18.5 && IMC <= 25){
        printf("Peso Normal!");
    }else if(IMC90 > 25 && IMC <= 30){
        printf("Acima do peso!");
    }else{
        printf("Obeso!");
    }


    return 0;
}
