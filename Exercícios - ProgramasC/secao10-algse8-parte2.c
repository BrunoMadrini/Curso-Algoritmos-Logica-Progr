// Escreva um algoritmo que leia dois vetores de 10 posi��es e fa�a a soma dos elementos
// do mesmo �ndice, colocando o resultado em um terceiro valor. Mostre o vetor final.

#include<stdio.h>

int main(){

	//Vari�veis
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
		printf("A soma �: %d\n", soma[i]);

	}
}
