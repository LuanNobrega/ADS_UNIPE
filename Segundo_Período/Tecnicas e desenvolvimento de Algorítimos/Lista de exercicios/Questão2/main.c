#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    int A = 0;

	printf("Insira um n�mero qualquer: ");
	scanf("%d", &A);

	if (A%2 == 0) {
		printf("N�mero inserido � par!");
		printf("\n%d", A);
	}
	else {
		printf("N�mero inserido � �mpar!");
		printf("\n%d", A);
	}


    return 0;
}
