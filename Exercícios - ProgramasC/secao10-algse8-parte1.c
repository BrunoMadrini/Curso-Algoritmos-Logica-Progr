//Faça um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armezene
// em um vetor apenas os numeros pares maiores que 0. no final deve mostrar os elemenn
// do vetor na tela.

#include <stdio.h>

int main(){

	//Variáveis
	int vetor[5], pares[5], cont_p = 0;

	//Processamento
	for(int i = 0; i < 5; i++){
		printf("Informe o valor para o vetor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);
			if(vetor[i] % 2 == 0){
			if(vetor[i] > 0){
				pares[cont_p] = vetor[i];
				cont_p = cont_p + 1;
			}
		}
	}
	for(int i = 0; i < cont_p; i++){
		printf("%d", pares[i]);
		}
}
