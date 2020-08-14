//Ler uma variável numérica e imprimi-lá apenas se a mesma for maior que 100, caso
//contrário imprimi-lá com o valor zero.

#include <stdio.h>

int main(){

	//Variáveis
	float num;

	//Entrada
	printf("Informe um valor numérico: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	if(num > 100){
		printf("O valor informado é %0.2f", num);}
	else{
		num = 0;
		printf("O valor informado é %0.2f", num);
	}
}
