//Tendo como dados de entrada a altura da pessoa, construa um algoritmo que 
//calcule o peso ideal.

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {

	//Variáveis
	float height, ideal_weight;
	Scanner teclado = new Scanner (System.in);
	
	
	//Entrada
	System.out.print("Informe sua altura em metros: ");
	height = teclado.nextFloat();
	
	//Processamento
	ideal_weight = (float) ((72.7 * height) - 58); //usar CAST float para transformar o padrão double em float	

	//Saída
	System.out.print("Seu peso ideal é " + ideal_weight + " kilos.");
	
	teclado.close();
	}

}
