//Elabore um programa que gera e escreva os n� �mpares dos numeros entre 100 e 200.

package br.com.brunomadrini.secao07;

public class Exerc�cio03 {

	public static void main(String[] args) {
	
	//Vari�veis
	int n = 100;
	
	//Processamento
	for(n = 100; n <= 200; n++) {
	if(n % 2 != 0) {
	System.out.println(+ n);
		
	}

	}
	
	}

}
