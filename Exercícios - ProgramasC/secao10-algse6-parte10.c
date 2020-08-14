//Elaborar um algoritmo que leia a idade de um nadador e classifique-o em uma das
//categorias.

#include <stdio.h>

int main(){

	//Variáveis
	int idade;

	//Entrada
	printf("Informe a idade do nadador: ");
	fflush(stdout);
	scanf("%d", &idade);

	//Processamento
	if (idade >= 5 && idade <= 7){
	printf("O nadador pertece a categoria Infantil A");
	}
	if (idade >=8 && idade <= 11){
		printf("O nadador pertence a categoria Infantil B");
	}
	if (idade >=12 && idade <= 13){
			printf("O nadador pertence a categoria Juvenil A");
	}
	if (idade >=14 && idade <= 17){
			printf("O nadador pertence a categoria Juvenil B");
	}
	if (idade >= 18){
			printf("O nadador pertence a categoria Adulto");
	}
	if(idade < 5){
		printf("O nadador não pertence a nenhuma categoria");
	}

}
