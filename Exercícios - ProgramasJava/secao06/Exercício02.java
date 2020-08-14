//Elabora um algoritmo que leia um número. Se positivo, armazene-o em a, se negativo
//armazene-o em b. No final, mostrar o resultado.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
	//Variáveis
	float num, a, b;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um número: ");
	num = teclado.nextFloat();
	
	//Processamento
	if(num >= 0) {
	a = num;
	System.out.print("O número " + a + " é positivo.");
	
	}else {
	b = num;
	System.out.print("O número " + b + " é negativo.");	
	}
	
	teclado.close();
	}

}
