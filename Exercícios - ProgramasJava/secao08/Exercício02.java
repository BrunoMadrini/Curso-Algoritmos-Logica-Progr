// Escreva um algoritmo que leia dois vetores dse 10 posi��es  e fa�a a soma dos elementos
// de mesmo �ndice, colocando o resultado em um terceiro vetor. Mostrar or vetor resultante.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
	
	//Vari�veis
	int [] vec1 = new int [10]; //Criamos vetor do tipo int de 10 elementos
	int [] vec2 = new int [10];
	int [] sum = new int [10];
	Scanner teclado = new Scanner (System.in);
	
	//Processamento
	for (int i = 0; i < 10; i++) {
		System.out.print("Informe o valor para o primeiro vetor: ");
		vec1[i] = teclado.nextInt();
		System.out.print("Informe o valor para o segundo vetor: ");
		vec2[i] = teclado.nextInt();
		
		sum[i] = vec1[i] + vec2[i];
	}
	for(int i = 0; i < 10; i++) {
		System.out.println(sum[i]);
	}
	
	teclado.close();
	}

}
