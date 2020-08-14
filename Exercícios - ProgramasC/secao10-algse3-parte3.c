//Faça um algoritmo que converta metros para centímetros

#include <stdio.h>

int main(){

	//Variáveis
	float centimetro, metro;

	//Entrada
	printf("Informe o valor em metros: ");
	fflush(stdout);
	scanf("%f", &metro);

	//Processamento
	centimetro = metro * 100;

	//Saída
	printf("O valor é de %0.2f cm", centimetro);
}
