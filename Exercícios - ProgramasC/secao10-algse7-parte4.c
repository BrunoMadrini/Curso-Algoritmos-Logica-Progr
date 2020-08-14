//Construa um algoritmo que leia 10 valores inteiros e positivos e a) encontre o maior
//valor, b) encontre o menor valor e calcule a média dos nº lidos.

#include <stdio.h>

int main(){

	//Variáveis
	float maior = -999, menor = 999, soma = 0, i = 0, num, media;

	//Entrada
	for(i = 0; i < 10; i++){
		printf("Informe um valor: ");
		fflush(stdout);
		scanf("%f", &num);

	//Processamento
		if(num > 0){
		if(num > maior){
			maior = num;
		}
		if(num < menor){
		menor = num;
		}
		soma = soma + num;
		}else{
			i--;
		}
	}
		media = soma / 10;

		//Saída
		printf("O maior número é: %0.2f\n", maior);
		printf("O menor número é: %0.2f\n", menor);
		printf("A média dos números informados é %0.2f", media);
}
