//Elabora um algoritmo que leia um n�mero. Se positivo, armazene-o em a, se negativo
//armazene-o em b. No final, mostrar o resultado.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
	//Vari�veis
	float num, a, b;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um n�mero: ");
	num = teclado.nextFloat();
	
	//Processamento
	if(num >= 0) {
	a = num;
	System.out.print("O n�mero " + a + " � positivo.");
	
	}else {
	b = num;
	System.out.print("O n�mero " + b + " � negativo.");	
	}
	
	teclado.close();
	}

}
