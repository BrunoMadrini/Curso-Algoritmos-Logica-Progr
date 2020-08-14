//Desenvolva um algoritmo que leia 4 nº, calcule o quadrado de cada um...

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
	
	//Variáveis
	float n1, n2, n3, n4, q1, q2, q3, q4;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o valor do primeiro número: ");
	n1 = teclado.nextFloat();
	
	System.out.print("Informe o valor do segundo número: ");
	n2 = teclado.nextFloat();
	
	System.out.print("Informe o valor do terceiro número: ");
	n3 = teclado.nextFloat();
	
	System.out.print("Informe o valor do quarto número: ");
	n4 = teclado.nextFloat();
	
	//Processamento
	q1 = n1 * n1;
	q2 = n2 * n2;
	q3 = n3 * n3;
	q4 = n4 * n4;
	
	//Saída
	if(q3 >= 1000) {
		System.out.print("O quadrado de " + n3 + " é " + q3);
	}
	else {
		System.out.println("O quadrado de " + n1 + " é " + q1);
		System.out.println("O quadrado de " + n2 + " é " + q2);
		System.out.println("O quadrado de " + n3 + " é " + q3);
		System.out.print("O quadrado de " + n4 + " é " + q4);
	}
	
	teclado.close();
	}

}
