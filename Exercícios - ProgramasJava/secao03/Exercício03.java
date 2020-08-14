//Faça um algoritmo que converta metros para centímetros

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
	//Variáveis
	float cm, m;
	Scanner teclado = new Scanner(System.in);
	
	//Entrada
	System.out.print("Informe o valor em metros: ");
	m = teclado.nextFloat();
	
	//Processamento
	cm = m * 100;
	
	//Saída
	System.out.print(m + " metros são " + cm + " centímetros");
	
	teclado.close();
	}

}