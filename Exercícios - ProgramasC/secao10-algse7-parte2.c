//Faça um algoritmo que conte de 1 a 100 e a cada multiplo de 10 emita uma msg de
//que o numero é multiplo de 10.

#include <stdio.h>

int main(){
	//Variáveis
	int i=1;

		//Processamento
	for(i = 1; i <= 100; i++){
		printf("%d\n", i);
		if(i % 10 == 0){
			printf("Múltiplo de 10\n");
		}

	}
}
