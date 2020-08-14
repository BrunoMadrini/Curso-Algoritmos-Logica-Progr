//Faça um algoritmo que determine o maior entre N números. a Condição de parada é a
//entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior até que a
//entrada seja igual a zero.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
	
	//Variáveis
	float num, maior = 0;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.println("Para cancelar o programa insira 0");
	System.out.print("Informe um valor: ");
	num = teclado.nextFloat();
	
	//Processamento e Saída
	while(num != 0) {
		if(num > maior) {
			maior = num;
		}
		System.out.println("Para cancelar o programa insira 0");
		System.out.print("Informe um valor: ");
		num = teclado.nextFloat();
	}
	
	System.out.print("O maior número informado foi " + maior);
	
	teclado.close();
	}

}
