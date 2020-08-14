//Fa�a um programa para mostrar a taboada de um numero informado.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
	
	//Vari�veis
	int num;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um n�mero entre 1 e 10: ");
	num = teclado.nextInt();
	
	//Processamento
	while(num < 1 || num > 10) {
		//Entrada
		System.out.print("Informe um n�mero entre 1 e 10: ");
		num = teclado.nextInt();
	}
	for(int i = 1; i <= 10; i++) {
		System.out.printf("%d x %d = %d\n", num, i, (num * i));
	}
	
	teclado.close();
	}

}
