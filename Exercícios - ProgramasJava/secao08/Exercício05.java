// Fa�a um programa que carregue um vetor com 10 n� inteiros. Calcule e mostre os n� 
// superiores a 50 e suas respectivas posi��es. Mostrar mensagem caso n�o tenha esta 
// condi��o.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
	
	//Vari�veis
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
			System.out.printf("O n�mero %d est� na posi��o %d.\n", vec[i], i);
			tem_maior_50 = true;
		}
	}
		if(!tem_maior_50) {
			System.out.print("N�o existe nenhum n�mero maior que 50.");
		}
		
		teclado.close();
	}

}
