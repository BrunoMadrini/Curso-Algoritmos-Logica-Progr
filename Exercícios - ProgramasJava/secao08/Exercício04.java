//Faça um algoritmo que leia e mostre um vetor de 20 elementos inteiros, em seguida mostre
//a soma de todos elementos.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
	
	//Variáveis
	int [] vec = new int [20];
	int sum = 0;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	for(int i = 0; i < 20; i++) {
	System.out.printf("Informe um valor para o vetor %d/20: ", (i+1));
	vec[i] = teclado.nextInt();
	sum = sum + vec[i];
		}
	
	//Saída
	System.out.printf("A soma é %d.", sum);
	
	teclado.close();
	}
}
