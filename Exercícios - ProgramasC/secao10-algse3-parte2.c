//Fa�a um algoritmo que pe�a dois n�meros  e imprima a soma

#include <stdio.h>

int main(){

	//Vari�veis
	int num1, num2, soma;

	//Entrada
	printf("Informe o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d", &num1);
	printf("Informe o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	soma = num1 + num2;

	//Sa�da
	printf("O resultado da soma dos n�meros informados � %d.", soma);
}
