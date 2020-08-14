//Faça um programa que carregue um vetor com 10 nº inteiros. Calcule e mostre
//os nº superiores a 50 e suas respectivas posições. Mostrar mensagem caso
//não tenha esta condição.

#include <stdio.h>

int main(){

	//Variáveis
	int vetor[10];
	char tem_maior_50 = 0;

	//Entrada
	for(int i = 0; i < 10; i++){
		printf("Informe um valor (%d/10): ", (i+1));
		fflush(stdout);
		scanf("%d", &vetor[i]);
		}
	for(int i = 0; i < 10; i++){
		if(vetor[i] > 50){
			printf("O número %d está na posição %d\n", vetor[i], i);
			tem_maior_50 = 1;
		}
	}
		if(tem_maior_50 < 1){
			printf("Não existem valores maiores que 50.");
		}
}
