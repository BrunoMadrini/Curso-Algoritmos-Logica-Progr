//Faça um algoritmo que leia um nº inteiro e mostre uma mensagem indicando se este
//número é par ou impar, e se é positivo ou negativo.


package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
	
	//Variáveis
	int num;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informar um número inteiro: ");
	num = teclado.nextInt();
	
	//Processamento e Saída
	if(num >= 0 && num % 2 == 0) {
		System.out.print("O número informado é par e positivo.");
	}
	if(num >= 0 && num % 2 != 0) {
		System.out.print("O número informado é ímpar e positivo.");
	}
	if(num < 0 && num % 2 == 0) {
		System.out.print("O número informado é par e negativo.");
	}
	if(num < 0 && num % 2 != 0) {
		System.out.print("O número informado é ímpar e negativo.");
	}
	
	teclado.close();
	}

}
