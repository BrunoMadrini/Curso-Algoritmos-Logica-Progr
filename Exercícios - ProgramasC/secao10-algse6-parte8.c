//Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando se este
//n�mero � par ou impar, e se � positivo ou negativo.

#include <stdio.h>

int main(){

	//Vari�veis
	int n;

	//Entrada
	printf("Informe um valor: ");
	fflush(stdout);
	scanf("%d", &n);

	//Processamento
	if( n % 2 == 0 && n > 0){
		printf("O n�mero informado %d � par e positivo", n);
	}
	if( n % 2 == 0 && n < 0){
		printf("O n�mero informado %d � par e negativo", n);
	}
	if (n % 2 != 0 && n > 0){
		printf("O n�mero informado %d � impar e positivo", n);
	}
	if( n % 2 != 0 && n < 0){
		printf("O n�mero informado %d � impar e negativo", n);
	}

}
