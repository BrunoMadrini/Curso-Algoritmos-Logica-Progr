//Fa�a um algoritmo que converta metros para cent�metros

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
	//Vari�veis
	float cm, m;
	Scanner teclado = new Scanner(System.in);
	
	//Entrada
	System.out.print("Informe o valor em metros: ");
	m = teclado.nextFloat();
	
	//Processamento
	cm = m * 100;
	
	//Sa�da
	System.out.print(m + " metros s�o " + cm + " cent�metros");
	
	teclado.close();
	}

}