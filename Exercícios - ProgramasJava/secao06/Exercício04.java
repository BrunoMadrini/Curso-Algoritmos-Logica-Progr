//Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
//que calcule seu peso ideal.

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
	//Vari�veis
	float height, ideal_weight;
	char sex;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe sua altura em metros: ");
	height = teclado.nextFloat();
	
	System.out.print("Informe F para feminino ou M para Masculino: ");
	sex = teclado.next().charAt(0); //Recebe apenas uma string na primeira posi��o
		
	//Processamento
	if( sex == 'M' || sex == 'm') {
		ideal_weight = (float) ((72.7 * height) - 58); //CAST
		System.out.print("O peso ideal para a altura informada, em uma pessoa do sexo masculino, � de " + ideal_weight + " kilos.");
	}
	
	if( sex == 'F' || sex == 'f') {	
		ideal_weight = (float) ((62.1 * height) - 47.7); //CAST
		System.out.print("O peso ideal para a altura informada, em uma pessoa do sexo feminino, � de " + ideal_weight + " kilos.");
	
	} else {
	System.out.print("Sexo n�o reconhecido, favor iniciar novamente.");
	}

	teclado.close();
	}

}
