//Fa�a um algoritmo que conte de 1 a 100 e a cada multiplo de 10 emita uma msg de que o 
//numero � multiplo de 10.

package br.com.brunomadrini.secao07;

public class Exerc�cio02 {

	public static void main(String[] args) {
	
	//Vari�veis
	int i = 1;
	
	//Processamento
	for(i = 1; i <= 100; i++) {
	System.out.println(+ i);
	
	if(i % 10 == 0) {
	System.out.println("M�ltiplo de 10");
	
		}
	
	}

	}
	
}
