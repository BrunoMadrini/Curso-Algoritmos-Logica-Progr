// Fa�a um programa que carregue um vetor com dez n�meros inteiros. Mostre o vetor na
// ordem inversa que foi digitado.

#include <stdio.h>

int main(){

	//Vari�veis
	int vetor[10];

	//Entrada
	for(int i = 0; i < 10; i++){
		printf("Informe um valor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	//Processamento/Sa�da
		for(int i = 9; i >= 0; i--){
			printf("%d\n", vetor[i]);
		}

}
