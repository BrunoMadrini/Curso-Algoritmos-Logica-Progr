//Faça um programa que leia os nomes de usuários e a sua senha e não aceite a senha
//igual ao nome de usuário, mostrando uma mensagem de erro e voltando ao inicio.

#include <stdio.h>
#include <string.h>

int main(){

	//Variáveis
	char nome[100], senha[100];


	//Entradas
	printf("Informe o nome: ");
	//Utilizaremos o gets ao invés do scanf, pois é um array
	fflush(stdout);
	gets(nome);

	printf("Infome a senha: ");
	fflush(stdout);
	gets(senha);

	//Processamento
	//A função !strcmp serve para comparar dois arrays (strings)
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
