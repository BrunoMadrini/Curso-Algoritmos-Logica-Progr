//João da silva, pescador,....

#include <stdio.h>

int main(){

	//Variáveis
	float p, e, multa;

	//Entrada
	printf("Informe a quantidade, em kg, de peixes pescados: ");
	fflush(stdout);
	scanf("%f", &p);

	//Processamento
	if(p > 50){
		e = p - 50;
		multa = e * 4;
		printf("A quantidade pescada ultrapassa o limite diário.\nVocê terá que pagar uma multa de %0.2f reais\n", multa);
		printf("Execesso de %0.2f kilos", e);
	}
	else{
		e = 0;
		printf("A quantidade pescada está dentro do limite diário, não terá multa por execesso.");

	}

}
