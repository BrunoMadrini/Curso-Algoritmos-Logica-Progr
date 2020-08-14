//Faça um algoritmo para "calcular o estoque médio de uma peça".

#include <stdio.h>

int main(){

	//Variáveis
	int qtd_max, qtd_min, est_med;

	//Entrada
	printf("Informe a quantidade mínima: ");
	fflush(stdout);
	scanf("%d", &qtd_min);
	printf("Informe a quantidade máxima: ");
	fflush(stdout);
	scanf("%d", &qtd_max);

	//Processamento
	est_med = (qtd_min + qtd_max) / 2;

	//Saída
	printf("A quantidade média do estoque é de %d peças", est_med);
}
