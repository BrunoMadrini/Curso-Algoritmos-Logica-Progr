// Faça um programa que carregue um vetor com dez números inteiros. Mostre o vetor na
// ordem inversa que foi digitado.

#include <stdio.h>

int main(){

	//Variáveis
	int vetor[10];

	//Entrada
	for(int i = 0; i < 10; i++){
		printf("Informe um valor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	//Processamento/Saída
		for(int i = 9; i >= 0; i--){
			printf("%d\n", vetor[i]);
		}

}
