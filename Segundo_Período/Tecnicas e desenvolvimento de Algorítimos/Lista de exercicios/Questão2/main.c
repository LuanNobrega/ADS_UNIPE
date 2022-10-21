#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int A = 0;

	printf("Insira um número qualquer: ");
	scanf("%d", &A);

	if (A%2 == 0) {
		printf("Número inserido é par!");
		printf("\n%d", A);
	}
	else {
		printf("Número inserido é ímpar!");
		printf("\n%d", A);
	}


    return 0;
}
