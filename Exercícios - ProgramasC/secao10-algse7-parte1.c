//Fa�a um algoritmo que determine o maior entre N n�meros. A condi��o de parada � a
//entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior at� que a
//entrada seja igual a zero.

#include <stdio.h>

int main(){

	//Vari�veis
	float num, maior = 0;

	//Entrada
	printf("Informe o valor de um n�mero: ");
	fflush(stdout);
	scanf("%f", &num);

	//Processamento
	while(num != 0){
		if(num > maior){
			maior = num;
		}
		printf("Informe o valor de um n�mero: ");
		fflush(stdout);
		scanf("%f", &num);
		}
	printf("O maior n�mero informado foi: %0.0f", maior);
}
