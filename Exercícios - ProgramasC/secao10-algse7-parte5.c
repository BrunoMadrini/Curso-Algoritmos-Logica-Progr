//Fa�a um programa que leia os nomes de usu�rios e a sua senha e n�o aceite a senha
//igual ao nome de usu�rio, mostrando uma mensagem de erro e voltando ao inicio.

#include <stdio.h>
#include <string.h>

int main(){

	//Vari�veis
	char nome[100], senha[100];


	//Entradas
	printf("Informe o nome: ");
	//Utilizaremos o gets ao inv�s do scanf, pois � um array
	fflush(stdout);
	gets(nome);

	printf("Infome a senha: ");
	fflush(stdout);
	gets(senha);

	//Processamento
	//A fun��o !strcmp serve para comparar dois arrays (strings)
	while(!strcmp(nome, senha)){
		printf("O nome e a senha devem ser diferentes!\n");
		printf("Informe no nome: ");
		fflush(stdout);
		gets(nome);

		printf("Infome a senha: ");
		fflush(stdout);
		gets(senha);
		printf("Ok");
	}
}
