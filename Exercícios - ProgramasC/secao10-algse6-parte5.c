//Jo�o da silva, pescador,....

#include <stdio.h>

int main(){

	//Vari�veis
	float p, e, multa;

	//Entrada
	printf("Informe a quantidade, em kg, de peixes pescados: ");
	fflush(stdout);
	scanf("%f", &p);

	//Processamento
	if(p > 50){
		e = p - 50;
		multa = e * 4;
		printf("A quantidade pescada ultrapassa o limite di�rio.\nVoc� ter� que pagar uma multa de %0.2f reais\n", multa);
		printf("Execesso de %0.2f kilos", e);
	}
	else{
		e = 0;
		printf("A quantidade pescada est� dentro do limite di�rio, n�o ter� multa por execesso.");

	}

}
