//Elabora um algoritmo que leia um n�mero. Se positivo, armazene-o em a, se negativo
//armazene-o em b. No final, mostrar o resultado.

#include <stdio.h>

int main(){

	//Vari�veis
	float a, b, num;

	//Entrada
	printf("Informe um valor: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	if(num > 0){
		a = num;
		printf("O n�mero informado %0.2f � positivo", a);
	}
	else{
		b = num;
		printf("O n�mero informado %0.2f � negativo", b);
		}
}
