//Faça um algoritmo que peça dois números e imprima a soma

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {

	//Variáveis
	float n1, n2, sum;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o primeiro número: ");
	n1 = teclado.nextFloat();
	
	System.out.print("Informe o segundo número: ");
	n2 = teclado.nextFloat();
	
	//Processamento
	sum = n1 + n2;
		
	//Saída
	System.out.print("O resultado da soma dos números informados é: " + sum);
	
	teclado.close();
	}

}