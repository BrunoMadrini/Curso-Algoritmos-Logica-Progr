//Ler um n� e verificar se ele � par ou impar. Quando for par armazenar esse valor em
//p e quando for impar armazenar em i. Mostrr par ou impar no final

#include <stdio.h>

int main (){

	//Vari�veis
	int num, i, p;

	//Entrada
	printf("Informe um n�mero: ");
	fflush(stdout);
	scanf("%d", &num);

	//Processamento
	if(num % 2 == 0){
		p = num;
		printf("O n�mero informado %d � par.", p);
		}
	else{
		i = num;
		printf("O n�mero informado %d � �mpar.", i);
		}
}
