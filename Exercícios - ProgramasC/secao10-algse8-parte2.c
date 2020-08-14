// Escreva um algoritmo que leia dois vetores de 10 posições e faça a soma dos elementos
// do mesmo índice, colocando o resultado em um terceiro valor. Mostre o vetor final.

#include<stdio.h>

int main(){

	//Variáveis
	int vetor1[10], vetor2[10], soma[10];

	//Entrada
	for(int i = 0; i < 10; i++){
		printf("Informe o valor do primeiro vetor: ");
		fflush(stdout);
		scanf("%d", &vetor1[i]);
		printf("Informe o valor do segundo vetor: ");
		fflush(stdout);
		scanf("%d", &vetor2[i]);
		soma[i] = vetor1[i] + vetor2[i];
	}
	//Processamento
	for(int i = 0; i < 10; i++){
		printf("A soma é: %d\n", soma[i]);

	}
}
