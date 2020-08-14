//Desenvolva um algoritmo que leia 4 nº, calcule o quadrado de cada um...

#include <stdio.h>

int main(){

	//Variáveis
	float num1, num2, num3, num4, q1, q2, q3, q4;

	//Entrada
	printf("Informe o valor do primeiro número: ");
	fflush(stdout);
	scanf("%f", &num1);

	printf("Informe o valor do segundo número: ");
	fflush(stdout);
	scanf("%f", &num2);

	printf("Informe o valor do terceiro número: ");
	fflush(stdout);
	scanf("%f", &num3);

	printf("Informe o valor do quarto número: ");
	fflush(stdout);
	scanf("%f", &num4);

	//Processamento
	q1 = num1 * num1;
	q2 = num2 * num2;
	q3 = num3 * num3;
	q4 = num4 * num4;

	if(q3 >= 1000){
		printf("O valor do terceiro número ao quadrado é %0.2f", q3);
		}
	else{
		printf("O valor recebido do primeiro número é %0.2f e seu quadrado é %0.2f\n", num1, q1);
		printf("O valor recebido do segundo número é %0.2f e seu quadrado é %0.2f\n", num2, q2);
		printf("O valor recebido do terceiro número é %0.2f e seu quadrado é %0.2f\n", num3, q3);
		printf("O valor recebido do quarto número é %0.2f e seu quadrado é %0.2f", num4, q4);
	}


}
