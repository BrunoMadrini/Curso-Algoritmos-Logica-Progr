//Jo�o da Silva, pescador....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
	
	//Vari�veis
	float fished, fine, over;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Qual o valor, em kg, de peixes pescados: ");
	fished = teclado.nextFloat();
	
	//Processamento e Sa�da
	if(fished > 50) {
		over = fished - 50;
		fine = over * 4;
		System.out.println("A quantidade pescada ultrapassou o limite di�rio.\nVoc� ter� que pagar uma multa de R$ " + fine);
		System.out.print("O valor, em kg, do excesso foi de " + over + ".");
	}
	else {
		over = 0;
		fine = 0;
		System.out.print("A quantidade pescada n�o ultrapassou o limite di�rio.");
	}
	
	teclado.close();
	}

}
