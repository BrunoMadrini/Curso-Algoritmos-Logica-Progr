//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
//que calcule seu peso ideal, utilizando as fórmulas.

#include<stdio.h>

int main(){

	//Variáveis
	float peso_ideal, altura;
	char sexo;

	//Entrada
	printf("Informe M para Masculino e F para Feminino: ");
	fflush(stdout);
	scanf("%c", &sexo);

	printf("Informe a altura, em metros: ");
	fflush(stdout);
	scanf("%f", &altura);

	//Processamento
	if(sexo == 'm' || sexo == 'M'){
		peso_ideal = (72.7 * altura) - 58;
		printf("O peso ideal para a altura informada, em uma pessoa do sexo masculino é %0.2f kilos", peso_ideal);
	}
	if(sexo == 'f' || sexo == 'F'){
		peso_ideal = (62.1 * altura) - 44.7;
		printf("O peso ideal para a altura informada, em uma pessoa do sexo feminino é %0.2f kilos", peso_ideal);
	}
	if(sexo != 'f' && sexo != 'm' && sexo != 'M' && sexo != 'F'){
		printf("Sexo não reconhecido");
	}
}
