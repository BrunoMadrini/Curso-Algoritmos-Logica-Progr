//Ler um nº e verificar se ele é par ou impar. Quando for par armazenar esse valor em
//p e quando for impar armazenar em i. Mostrr par ou impar no final

#include <stdio.h>

int main (){

	//Variáveis
	int num, i, p;

	//Entrada
	printf("Informe um número: ");
	fflush(stdout);
	scanf("%d", &num);

	//Processamento
	if(num % 2 == 0){
		p = num;
		printf("O número informado %d é par.", p);
		}
	else{
		i = num;
		printf("O número informado %d é ímpar.", i);
		}
}
