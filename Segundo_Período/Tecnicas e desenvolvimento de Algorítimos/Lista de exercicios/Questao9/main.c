#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");
    float preco = 0;
    float desconto = 0;
    float juros = 0;
    int escolha;
    printf("Digite o pre�o: ");
    scanf("%f", &preco);
    printf("Digite o n�mero:\n 1 para � vista em dinheiro ou cheque\n 2 para � vista no cart�o de cr�dito\n 3 para dividir em duas vezes\n 4 para dividir em 4 vezes \n ");
    scanf("%d", &escolha);
    switch (escolha){
        case 1:
            printf("Recebe 10 por cento de desconto");
            preco = preco - (preco*0.1);
            printf("\nO valor a ser pago �: %0.2f", preco);
            break;
        case 2:
            printf("\nRecebe 15 por cento de desconto");
            preco = preco - (preco*0.15);
            printf("\nO valor a ser pago �: %0.2f", preco);
            break;
        case 3:
            preco = preco;
            printf("\nO valor a ser pago �: %0.2f", preco);
            break;
        case 4:
            printf("\nPre�o normal mais acrescimo de 10 por cento juros");
            preco = preco + (preco*0.1);
            printf("\nO valor a ser pago �: %0.2f", preco);
            break;
        default:
            printf("\nOp��o inv�lida");
            break;
    }
    return 0;
}
