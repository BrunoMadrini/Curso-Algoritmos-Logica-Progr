//Fa�a um algoritmo para "calcular o estoque m�dio de uma pe�a".

#include <stdio.h>

int main(){

	//Vari�veis
	int qtd_max, qtd_min, est_med;

	//Entrada
	printf("Informe a quantidade m�nima: ");
	fflush(stdout);
	scanf("%d", &qtd_min);
	printf("Informe a quantidade m�xima: ");
	fflush(stdout);
	scanf("%d", &qtd_max);

	//Processamento
	est_med = (qtd_min + qtd_max) / 2;

	//Sa�da
	printf("A quantidade m�dia do estoque � de %d pe�as", est_med);
}
