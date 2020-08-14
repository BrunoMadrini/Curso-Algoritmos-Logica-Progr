//Faça um programa para mostrar a tabuada de um numero informado.

#include <stdio.h>

int main(){

	//Variáveis
	int num, mult;

	//Entradas
	printf("Informe um valor entre 1 e 10: ");
	fflush(stdout);
	scanf("%d", &num);

	//Processamento
	if(num > 0 && num <= 10 ) {
		for (int i = 1; i <=10; i++) {
			mult = i * num;
			printf("%d x %d = %d\n", num, i, mult);
		}
	}

	else{
		printf("Erro!! O valor informado deve estar entre 1 e 10.\n");
		printf("Informe um valor entre 1 e 10: ");
		fflush(stdout);
		scanf("%d", &num);

		if(num > 0 && num <= 10 ) {
			for (int i = 0; i <=10; i++) {
			mult = i * num;
			printf("%d x %d = %d", num, i, mult);

			}
		}
	}
}

