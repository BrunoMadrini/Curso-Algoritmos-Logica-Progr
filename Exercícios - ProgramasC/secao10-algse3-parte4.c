//Fa�a um algoritmo que pergunta quanto voc� ganha por hora e o n�mero de horas trabal
// no m�s. Calcule e mostre o total do sal�rio no referido m�s.

#include<stdio.h>

int main(){

	//Vari�veis
	float valor_hora, qtd_hora, total;

	//Entrada
	printf("Informe o valor, em R$, da hora trabalhada: ");
	fflush(stdout);
	scanf("%f", &valor_hora);

	printf("Informe a quantidade das horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &qtd_hora);

	// Processamento
	total = valor_hora * qtd_hora;

	//Sa�da
	printf("O valor total � receber no referido m�s � de R$ %0.2f", total);
}
