//Ler uma vari�vel num�rica e imprimi-l� apenas se a mesma for maior que 100, caso contr�rio
// imprimi-l� com o valor zero.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
	
	//Vari�veis
	float n1;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um valor: ");
	n1 = teclado.nextFloat();
	
	//Processamento
	if(n1 > 100) {
		System.out.print("O valor informado � " + n1);
	}else {
		n1 = 0;
		System.out.print(+ n1);
	}
	
	teclado.close();
	}

}
