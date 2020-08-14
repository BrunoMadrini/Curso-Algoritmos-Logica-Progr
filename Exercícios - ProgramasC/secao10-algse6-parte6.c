//Elabore um algoritmo que leia as variáveis c e n....

#include <stdio.h>

int main(){

	//Variáveis
	float h, e, salario, total;
	char func;

	//Entrada
	printf("Informe o código do colaborador: ");
	fflush(stdout);
	scanf("%c", &func);

	printf("Informe o número de horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &h);

	//Processamento
	if(h <= 50){
		salario = h *10;
		e = 0;
		printf("O colaborador do código %c receberá %0.2f reais\n",func, salario);
		printf("Não tem valor excedente de horas trabalhadas");
		}
	else{
		e = (h - 50) * 20;
		salario = 50 * 10;
		total = salario + e;
		printf("O valor que o colaborador %c receberá de horas normais trabalhadas é de %0.2f\n",func, salario);
		printf("O valor a receber de horas extras trabalhadas é de %0.2f\n", e);
		printf("O valor total a receber é de %0.2f reais", total);

	}


}
