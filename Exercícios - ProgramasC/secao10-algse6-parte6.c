//Elabore um algoritmo que leia as vari�veis c e n....

#include <stdio.h>

int main(){

	//Vari�veis
	float h, e, salario, total;
	char func;

	//Entrada
	printf("Informe o c�digo do colaborador: ");
	fflush(stdout);
	scanf("%c", &func);

	printf("Informe o n�mero de horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &h);

	//Processamento
	if(h <= 50){
		salario = h *10;
		e = 0;
		printf("O colaborador do c�digo %c receber� %0.2f reais\n",func, salario);
		printf("N�o tem valor excedente de horas trabalhadas");
		}
	else{
		e = (h - 50) * 20;
		salario = 50 * 10;
		total = salario + e;
		printf("O valor que o colaborador %c receber� de horas normais trabalhadas � de %0.2f\n",func, salario);
		printf("O valor a receber de horas extras trabalhadas � de %0.2f\n", e);
		printf("O valor total a receber � de %0.2f reais", total);

	}


}
