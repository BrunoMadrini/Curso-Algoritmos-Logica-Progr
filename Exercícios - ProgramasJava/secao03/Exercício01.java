//Fa�a um algoritmo para "calcular o estoque m�dio de uma pe�a".

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
	
	//Vari�veis
	int min, max;
	float med;
	Scanner teclado = new Scanner(System.in);
	
	//Entrada
	System.out.print("Informe a quantidade m�nima de pe�as: ");
	min = teclado.nextInt();
	
	System.out.print("Informe a quantidade m�xima de pe�as: ");
	max = teclado.nextInt();
	
	//Processamento
	med = (min + max) / 2;
	
	//Sa�da
	System.out.print("O estoque m�dio de pe�as �: " + med);
	
	teclado.close();
	}

}
