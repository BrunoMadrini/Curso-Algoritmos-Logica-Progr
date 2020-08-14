//Fa�a um algoritmo que carregue um vetor de 5 elementos inteiros e em seguida armezene
// em um vetor apenas os numeros pares maiores que 0. No final deve mostrar os elementos
// do vetor na tela.

package br.com.brunomadrini.secao08;

import java.util.ArrayList;

public class Exerc�cio01 {

	public static void main(String[] args) {
	
	//Vari�veis	
	ArrayList<Integer> vetor = new ArrayList<Integer>(); //Estrutura Collection
	ArrayList<Integer> pares = new ArrayList<Integer>();
	
	for (int i = 0; i < 5; i++) {	// Estrutura de repeti��o
		vetor.add(i);				// Adiciona cada valor de i no vetor principal
		if(i % 2 == 0) {			// Verifica se � par
			if(i > 0) {				// Verifica se o i � maior que zero		
			pares.add(i);			// Se for par, adiciona o valor de i ao vetor pares
			}
		}	
	}
	
	for(Integer n : pares) {		// Para cada inteiro, dentro do vetor de pares, o valor ser� colocado na vari�vel n
		System.out.println(n);
	}
	
	}

}
