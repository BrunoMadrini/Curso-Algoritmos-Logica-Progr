//Fa�a um programa que carregue um vetor com 10 n� inteiros. Calcule e mostre
//os n� superiores a 50 e suas respectivas posi��es. Mostrar mensagem caso
//n�o tenha esta condi��o.

#include <stdio.h>

int main(){

	//Vari�veis
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
			printf("O n�mero %d est� na posi��o %d\n", vetor[i], i);
			tem_maior_50 = 1;
		}
	}
		if(tem_maior_50 < 1){
			printf("N�o existem valores maiores que 50.");
		}
}
