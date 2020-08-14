//Faça um algoritmo que pergunta quanto você ganha por hora e o número de horas trabal
// no mês. Calcule e mostre o total do salário no referido mês.

#include<stdio.h>

int main(){

	//Variáveis
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

	//Saída
	printf("O valor total à receber no referido mês é de R$ %0.2f", total);
}
