//Construa um algoritmo que leia 10 valores inteiros e positivos e a) encontre o maior
//valor, b) encontre o menor valor e calcule a m�dia dos n� lidos.

#include <stdio.h>

int main(){

	//Vari�veis
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

		//Sa�da
		printf("O maior n�mero �: %0.2f\n", maior);
		printf("O menor n�mero �: %0.2f\n", menor);
		printf("A m�dia dos n�meros informados � %0.2f", media);
}
