////Fa�a um algoritmo para somar 2 n�meros e multiplicar o resultado pelo 1�.

package br.com.brunomadrini.secao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
	//Vari�veis
	int num1, num2, sum, mult;
	Scanner teclado = new Scanner(System.in);
	
	//Estradas
	System.out.print("Informe o primeiro n�mero: ");
	num1 = teclado.nextInt();
	
	System.out.print("Informe o segundo n�mero: ");
	num2 = teclado.nextInt();
	
	//Processamento
	sum = num1 + num2;
	mult = sum * num1;
	
	
	//Sa�da
	System.out.print("O resultado �: " +mult);
	
	teclado.close();
	}

}
