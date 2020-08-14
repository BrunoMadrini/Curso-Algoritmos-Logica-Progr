//Elabora um algoritmo que leia um número. Se positivo, armazene-o em a, se negativo
//armazene-o em b. No final, mostrar o resultado.

#include <stdio.h>

int main(){

	//Variáveis
	float a, b, num;

	//Entrada
	printf("Informe um valor: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	if(num > 0){
		a = num;
		printf("O número informado %0.2f é positivo", a);
	}
	else{
		b = num;
		printf("O número informado %0.2f é negativo", b);
		}
}
