////Faça um algoritmo para somar 2 números e multiplicar o resultado pelo 1º.

package br.com.brunomadrini.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
	//Variáveis
	int num1, num2, sum, mult;
	Scanner teclado = new Scanner(System.in);
	
	//Estradas
	System.out.print("Informe o primeiro número: ");
	num1 = teclado.nextInt();
	
	System.out.print("Informe o segundo número: ");
	num2 = teclado.nextInt();
	
	//Processamento
	sum = num1 + num2;
	mult = sum * num1;
	
	
	//Saída
	System.out.print("O resultado é: " +mult);
	
	teclado.close();
	}

}
