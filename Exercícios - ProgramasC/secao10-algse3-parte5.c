//Tendo como dados de entrada a altura da pessoa, construa um algoritmo que calcule o
//seu peso ideal, usando a f�rmula.

#include<stdio.h>

int main(){

	//Vari�veis
	float altura, peso_ideal;

	//Entrada
	printf("Informe o valor da sua altura: ");
	fflush(stdout);
	scanf("%f", &altura);

	//Processamento
	peso_ideal = (72.7 * altura) - 58;

	//Sa�da
	printf("O peso ideal para a altura informada � de %0.2f kilos", peso_ideal);

}
