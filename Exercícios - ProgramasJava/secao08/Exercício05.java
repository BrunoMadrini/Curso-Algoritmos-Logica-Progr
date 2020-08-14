// Faça um programa que carregue um vetor com 10 nº inteiros. Calcule e mostre os nº 
// superiores a 50 e suas respectivas posições. Mostrar mensagem caso não tenha esta 
// condição.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
	
	//Variáveis
	int[] vec = new int[10];
	boolean tem_maior_50 = false;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada e Processamento
	for(int i = 0; i < 10; i++) {
		System.out.printf("Informe o valor para o vetor (%d/10): ", (i + 1));
		vec[i] = teclado.nextInt();
	}
	
	for(int i = 0; i < 10; i++) {
		if(vec[i] > 50) {
			System.out.printf("O número %d está na posição %d.\n", vec[i], i);
			tem_maior_50 = true;
		}
	}
		if(!tem_maior_50) {
			System.out.print("Não existe nenhum número maior que 50.");
		}
		
		teclado.close();
	}

}
