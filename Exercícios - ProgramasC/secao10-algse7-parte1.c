//Faça um algoritmo que determine o maior entre N números. A condição de parada é a
//entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior até que a
//entrada seja igual a zero.

#include <stdio.h>

int main(){

	//Variáveis
	float num, maior = 0;

	//Entrada
	printf("Informe o valor de um número: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	while(num != 0){
		if(num > maior){
			maior = num;
		}
		printf("Informe o valor de um número: ");
		fflush(stdout);
		scanf("%f", &num);
		}
	printf("O maior número informado foi: %0.0f", maior);
}
