//Faça um programa que leia os nomes de usuários e a sua senha e não aceite a senha
//igual ao nome de usuário, mostrando uma mensagem de erro e voltando ao inicio.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
	
	//Variáveis
	String nome, senha; //String tem que ser com S.
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o nome de usuário: ");
	nome = teclado.next(); //Next devolve uma String.
	
	System.out.print("Informe uma senha: ");
	senha = teclado.next();
	
	//Processamento
	while (nome.equals(senha)) { //Função para comparar duas strings.
		System.out.println("ERRO! O nome de usuário deve ser diferente da senha!!");
		//Entrada novamente
		System.out.print("Informe o nome de usuário: ");
		nome = teclado.next(); //Next devolve uma String.
		
		System.out.print("Informe uma senha: ");
		senha = teclado.next();
	}
	
	teclado.close();
	}

}
