//Fa�a um programa que leia os nomes de usu�rios e a sua senha e n�o aceite a senha
//igual ao nome de usu�rio, mostrando uma mensagem de erro e voltando ao inicio.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
	
	//Vari�veis
	String nome, senha; //String tem que ser com S.
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o nome de usu�rio: ");
	nome = teclado.next(); //Next devolve uma String.
	
	System.out.print("Informe uma senha: ");
	senha = teclado.next();
	
	//Processamento
	while (nome.equals(senha)) { //Fun��o para comparar duas strings.
		System.out.println("ERRO! O nome de usu�rio deve ser diferente da senha!!");
		//Entrada novamente
		System.out.print("Informe o nome de usu�rio: ");
		nome = teclado.next(); //Next devolve uma String.
		
		System.out.print("Informe uma senha: ");
		senha = teclado.next();
	}
	
	teclado.close();
	}

}
