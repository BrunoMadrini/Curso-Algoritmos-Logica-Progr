//Fa�a um algoritmo que converta metros para cent�metros

#include <stdio.h>

int main(){

	//Vari�veis
	float centimetro, metro;

	//Entrada
	printf("Informe o valor em metros: ");
	fflush(stdout);
	scanf("%f", &metro);

	//Processamento
	centimetro = metro * 100;

	//Sa�da
	printf("O valor � de %0.2f cm", centimetro);
}
