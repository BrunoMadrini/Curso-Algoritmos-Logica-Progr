//Ler um n� e verificar se ele � par ou impar. Quando for par armazenar esse valor em
//p e quando for impar armazenar em i. Mostrar par ou impar no final.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
	
	//Vari�veis
	float num, i, p;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um n�mero: ");
	num = teclado.nextFloat();
	
	//Processamento
	if(num % 2 == 0) {
	p = num;
	System.out.print("O n�mero " + p + " � par.");
		
	}else {
	i = num;
	System.out.print("O n�mero " + i + " � impar.");
	}
	
	teclado.close();
	}

}
