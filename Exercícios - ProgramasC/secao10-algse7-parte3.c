//Elabore um programa que gera e escreva os n� �mpares dos numeros entre 100 e 200

#include <stdio.h>

int main(){

	//Vari�veis
	int n = 100;

	//Processamento
	for(n = 100; n <= 200; n++){
		if(n % 2 != 0){
			printf("%d\n", n);
		}
	}
}
