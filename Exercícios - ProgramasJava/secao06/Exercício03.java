//Ler um nº e verificar se ele é par ou impar. Quando for par armazenar esse valor em
//p e quando for impar armazenar em i. Mostrar par ou impar no final.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
	
	//Variáveis
	float num, i, p;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe um número: ");
	num = teclado.nextFloat();
	
	//Processamento
	if(num % 2 == 0) {
	p = num;
	System.out.print("O número " + p + " é par.");
		
	}else {
	i = num;
	System.out.print("O número " + i + " é impar.");
	}
	
	teclado.close();
	}

}
