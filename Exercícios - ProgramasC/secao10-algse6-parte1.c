//Ler uma vari�vel num�rica e imprimi-l� apenas se a mesma for maior que 100, caso
//contr�rio imprimi-l� com o valor zero.

#include <stdio.h>

int main(){

	//Vari�veis
	float num;

	//Entrada
	printf("Informe um valor num�rico: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	if(num > 100){
		printf("O valor informado � %0.2f", num);}
	else{
		num = 0;
		printf("O valor informado � %0.2f", num);
	}
}
