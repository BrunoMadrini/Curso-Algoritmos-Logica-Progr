//Desenvolva um algoritmo que leia 4 n�, calcule o quadrado de cada um...

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
	
	//Vari�veis
	float n1, n2, n3, n4, q1, q2, q3, q4;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o valor do primeiro n�mero: ");
	n1 = teclado.nextFloat();
	
	System.out.print("Informe o valor do segundo n�mero: ");
	n2 = teclado.nextFloat();
	
	System.out.print("Informe o valor do terceiro n�mero: ");
	n3 = teclado.nextFloat();
	
	System.out.print("Informe o valor do quarto n�mero: ");
	n4 = teclado.nextFloat();
	
	//Processamento
	q1 = n1 * n1;
	q2 = n2 * n2;
	q3 = n3 * n3;
	q4 = n4 * n4;
	
	//Sa�da
	if(q3 >= 1000) {
		System.out.print("O quadrado de " + n3 + " � " + q3);
	}
	else {
		System.out.println("O quadrado de " + n1 + " � " + q1);
		System.out.println("O quadrado de " + n2 + " � " + q2);
		System.out.println("O quadrado de " + n3 + " � " + q3);
		System.out.print("O quadrado de " + n4 + " � " + q4);
	}
	
	teclado.close();
	}

}
