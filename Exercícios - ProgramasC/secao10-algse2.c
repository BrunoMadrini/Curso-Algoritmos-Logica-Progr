//Fa�a um algoritmo para somar 2 n�meros e multiplicar o resultado pelo 1�.

#include <stdio.h>

int main(){

	//Vari�veis
	int num1, num2, resultado;

	//Entrada
	printf("Informe o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d", &num1);
	printf("Informe o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	resultado = (num1 + num2) * num1;

	//Sa�da
	printf("O resultado obtido �: %d", resultado);
}
