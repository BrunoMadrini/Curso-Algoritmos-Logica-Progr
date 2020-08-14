//Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este
//número é par ou impar, e se é positivo ou negativo.

#include <stdio.h>

int main(){

	//Variáveis
	int n;

	//Entrada
	printf("Informe um valor: ");
	fflush(stdout);
	scanf("%d", &n);

	//Processamento
	if( n % 2 == 0 && n > 0){
		printf("O número informado %d é par e positivo", n);
	}
	if( n % 2 == 0 && n < 0){
		printf("O número informado %d é par e negativo", n);
	}
	if (n % 2 != 0 && n > 0){
		printf("O número informado %d é impar e positivo", n);
	}
	if( n % 2 != 0 && n < 0){
		printf("O número informado %d é impar e negativo", n);
	}

}
