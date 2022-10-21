#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    float altura, peso = 0.0;
    int sexo = 0;

    printf("Qual o seu sexo?\nDigite 1 para MASCULINO ou digite 2 para FEMININO.");
    scanf("%d", &sexo);

    switch(sexo){
    case 1:
        printf("Qual a sua altura? ");
        scanf("%f", &altura);
        peso = ((72.7*altura)-58);
        printf("O peso ideal da pessoa é: %f", peso);
        break;
    case 2:
        printf("Qual a sua altura? ");
        scanf("%f", &altura);
        peso = ((62.1 * altura)-44.7);
        printf("O peso ideal da pessoa é: %f", peso);
        break;
    default:
        printf("Você não digitou uma opção válida para o sexo.");
        break;
    }

    return 0;
}
