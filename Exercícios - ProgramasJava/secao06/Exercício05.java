//João da Silva, pescador....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
	
	//Variáveis
	float fished, fine, over;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Qual o valor, em kg, de peixes pescados: ");
	fished = teclado.nextFloat();
	
	//Processamento e Saída
	if(fished > 50) {
		over = fished - 50;
		fine = over * 4;
		System.out.println("A quantidade pescada ultrapassou o limite diário.\nVocê terá que pagar uma multa de R$ " + fine);
		System.out.print("O valor, em kg, do excesso foi de " + over + ".");
	}
	else {
		over = 0;
		fine = 0;
		System.out.print("A quantidade pescada não ultrapassou o limite diário.");
	}
	
	teclado.close();
	}

}
