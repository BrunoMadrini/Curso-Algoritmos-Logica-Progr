// Fa�a um programa que receba um c�digo num�rico inteiro e um vetor de cinco posi��es de 
// n�meros reais. Se o c�digo for zero, termine o programa. Se o c�digo for 1, mostre o 
// vetor na ordem direta, se o c�digo for 2, mostre o vetor na ordem inversa.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
	
	//Vari�veis
	float [] vec = new float [5];
	int cod;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("C�digos para opera��o\n");
	System.out.print("0 - Para encerrar o programa.\n");
	System.out.print("1 - Para mostrar os valores na ordem informada.\n");
	System.out.print("2 - Para mostrar os valores em ordem invertida a informada.\n");
	System.out.print("Informe o c�digo: ");
	cod = teclado.nextInt();
	
	//Processamento
	if(cod != 0) {
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe um n�mero real: ");
			vec[i] = teclado.nextFloat();
		}
	
	if(cod == 1) {
		for (int i = 0; i < 5; i++) {
			System.out.println(vec[i]);
		}
	}
	
	if(cod == 2) {
		for(int i = (vec.length - 1); i >= 0; i--) {
			System.out.println(vec[i]);
			}
		}
	}
	
	teclado.close();
	}

}
