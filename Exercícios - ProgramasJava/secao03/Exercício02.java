//Fa�a um algoritmo que pe�a dois n�meros e imprima a soma

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {

	//Vari�veis
	float n1, n2, sum;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o primeiro n�mero: ");
	n1 = teclado.nextFloat();
	
	System.out.print("Informe o segundo n�mero: ");
	n2 = teclado.nextFloat();
	
	//Processamento
	sum = n1 + n2;
		
	//Sa�da
	System.out.print("O resultado da soma dos n�meros informados �: " + sum);
	
	teclado.close();
	}

}