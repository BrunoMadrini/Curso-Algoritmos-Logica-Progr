// Faça um programa que carregue um vetor com dez números inteiros. Mostre o vetor na ordem
// inversa a que foi digitado.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
	
	//Variáveis
	int[] vec = new int [10];
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	for(int i = 0; i < 10; i++) {
		System.out.print("Informe um valor para o vetor: ");
		vec[i] = teclado.nextInt();
	}
	for(int i = 9; i >= 0; i--) {	//Podemos utilizar (int i = (vec.length - 1); i >= 0; i--)
		System.out.println(vec[i]);
	}
	
	teclado.close();
	}

}
