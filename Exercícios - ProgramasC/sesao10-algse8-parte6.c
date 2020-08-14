//Faça um programa que receba um código numérico inteiro e um vetor de cinco
//posições de números reais. Se o código for zero, termine o programa. Se o código
//for 1, mostre o vetor na ordem direta, se o código for 2, mostre o vetor na
//ordem inversa.

#include <stdio.h>

int main(){

	//Variáveis
	int codigo;
	float vetor[5];

	for(int i = 0; i < 5; i++){
		printf("Informe um valor para o vetor (%d/5): ", (i+1));
		fflush(stdout);
		scanf("%f", &vetor[i]);
		}

		printf("\nCódigos para operação\n");
		printf("0 - Para encerrar o programa\n");
		printf("1 - Para mostrar os valores na ordem informada\n");
		printf("2 - Para mostrar os valores em ordem invertida a informada\n");
		printf("Informe um código para operação: \n");
		fflush(stdout);
		scanf("%d", &codigo);

		if(codigo == 1){
			for(int i = 0; i < 5; i++){
				printf("%0.2f\n", vetor[i]);
			}
		}
		if(codigo == 2){
			for(int i = 4; i >= 0; i--){
				printf("%0.2f\n", vetor[i]);
			}
		}
		if(codigo == 0 ){
			printf("Ok. Programa finalizado!");
		}



}
