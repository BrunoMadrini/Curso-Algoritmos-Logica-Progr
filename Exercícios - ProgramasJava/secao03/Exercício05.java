//Tendo como dados de entrada a altura da pessoa, construa um algoritmo que 
//calcule o peso ideal.

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {

	//Vari�veis
	float height, ideal_weight;
	Scanner teclado = new Scanner (System.in);
	
	
	//Entrada
	System.out.print("Informe sua altura em metros: ");
	height = teclado.nextFloat();
	
	//Processamento
	ideal_weight = (float) ((72.7 * height) - 58); //usar CAST float para transformar o padr�o double em float	

	//Sa�da
	System.out.print("Seu peso ideal � " + ideal_weight + " kilos.");
	
	teclado.close();
	}

}
