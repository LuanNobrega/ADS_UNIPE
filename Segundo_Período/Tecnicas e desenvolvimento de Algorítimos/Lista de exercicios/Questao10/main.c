#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");
    float nota1 = 0;
    float nota2 = 0;
    float nota3 = 0;
    float ME = 0;
    float MA = 0;
    printf("Digite a nota 1: ");
    scanf("%f", &nota1);
    printf("Digite a nota 2: ");
    scanf("%f", &nota2);
    printf("Digite a nota 3: ");
    scanf("%f", &nota3);
    ME = (nota1 + nota2 + nota3)/3;

    MA = (nota1 + nota2 * 2 + nota3 * 3 + ME)/7;

    printf("\nA média de aproveitamento é: %0.2f", MA);

    if(MA >= 90){
        printf("\nConceito A");
    }else if(MA < 90 && MA >= 75){
        printf("\nConceito B");
    }else if(MA < 75 && MA >= 60){
        printf("\nConceito C");
    }else if(MA < 60 && MA >= 40){
        printf("\nConceito D");
    }else{
        printf("\nConceito E");
    }
    return 0;
}
