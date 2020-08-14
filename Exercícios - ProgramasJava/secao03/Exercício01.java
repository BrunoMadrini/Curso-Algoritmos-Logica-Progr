//Faça um algoritmo para "calcular o estoque médio de uma peça".

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
	
	//Variáveis
	int min, max;
	float med;
	Scanner teclado = new Scanner(System.in);
	
	//Entrada
	System.out.print("Informe a quantidade mínima de peças: ");
	min = teclado.nextInt();
	
	System.out.print("Informe a quantidade máxima de peças: ");
	max = teclado.nextInt();
	
	//Processamento
	med = (min + max) / 2;
	
	//Saída
	System.out.print("O estoque médio de peças é: " + med);
	
	teclado.close();
	}

}
