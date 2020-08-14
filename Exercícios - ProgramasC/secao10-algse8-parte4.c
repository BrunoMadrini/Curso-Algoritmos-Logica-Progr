//Faça um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seg
//mostre a soma de todos elementos.

#include <stdio.h>

int main(){

	//Variáveis
	int vetor[20], soma = 0;

	//Entrada
	for(int i = 0; i < 20; i++){
		printf("Informe um valor (%d/20): ", (i + 1));
		fflush(stdout);
		scanf("%d", &vetor[i]);
		soma = soma + vetor[i];
	}
	printf("A soma do vetor é %d", soma);
}
