//Faça um algoritmo para somar 2 números e multiplicar o resultado pelo 1º.

#include <stdio.h>

int main(){

	//Variáveis
	int num1, num2, resultado;

	//Entrada
	printf("Informe o primeiro número: ");
	fflush(stdout);
	scanf("%d", &num1);
	printf("Informe o segundo número: ");
	fflush(stdout);
	scanf("%d", &num2);

	//Processamento
	resultado = (num1 + num2) * num1;

	//Saída
	printf("O resultado obtido é: %d", resultado);
}
