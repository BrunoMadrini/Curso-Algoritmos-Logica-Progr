// Faça um programa que receba um código numérico inteiro e um vetor de cinco posições de 
// números reais. Se o código for zero, termine o programa. Se o código for 1, mostre o 
// vetor na ordem direta, se o código for 2, mostre o vetor na ordem inversa.

package br.com.brunomadrini.secao08;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
	
	//Variáveis
	float [] vec = new float [5];
	int cod;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Códigos para operação\n");
	System.out.print("0 - Para encerrar o programa.\n");
	System.out.print("1 - Para mostrar os valores na ordem informada.\n");
	System.out.print("2 - Para mostrar os valores em ordem invertida a informada.\n");
	System.out.print("Informe o código: ");
	cod = teclado.nextInt();
	
	//Processamento
	if(cod != 0) {
		for(int i = 0; i < 5; i++) {
			System.out.print("Informe um número real: ");
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
