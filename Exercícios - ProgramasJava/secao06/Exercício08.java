//Fa�a um algoritmo que leia um n� inteiro e mostre uma mensagem indicando se este
//n�mero � par ou impar, e se � positivo ou negativo.


package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
	
	//Vari�veis
	int num;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informar um n�mero inteiro: ");
	num = teclado.nextInt();
	
	//Processamento e Sa�da
	if(num >= 0 && num % 2 == 0) {
		System.out.print("O n�mero informado � par e positivo.");
	}
	if(num >= 0 && num % 2 != 0) {
		System.out.print("O n�mero informado � �mpar e positivo.");
	}
	if(num < 0 && num % 2 == 0) {
		System.out.print("O n�mero informado � par e negativo.");
	}
	if(num < 0 && num % 2 != 0) {
		System.out.print("O n�mero informado � �mpar e negativo.");
	}
	
	teclado.close();
	}

}
