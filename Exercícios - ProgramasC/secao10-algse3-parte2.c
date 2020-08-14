//Faça um algoritmo que peça dois números  e imprima a soma

#include <stdio.h>

int main(){

	//Variáveis
	int num1, num2, soma;

	//Entrada
	printf("Informe o primeiro número: ");
	fflush(stdout);
	scanf("%d", &num1);
	printf("Informe o segundo número: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	soma = num1 + num2;

	//Saída
	printf("O resultado da soma dos números informados é %d.", soma);
}
