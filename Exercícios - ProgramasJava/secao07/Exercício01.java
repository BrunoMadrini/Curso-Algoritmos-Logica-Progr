//Fa�a um algoritmo que determine o maior entre N n�meros. a Condi��o de parada � a
//entrada do valor 0, ou seja, o algoritmo deve ficar calculando o maior at� que a
//entrada seja igual a zero.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
	
	//Vari�veis
	float num, maior = 0;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.println("Para cancelar o programa insira 0");
	System.out.print("Informe um valor: ");
	num = teclado.nextFloat();
	
	//Processamento e Sa�da
	while(num != 0) {
		if(num > maior) {
			maior = num;
		}
		System.out.println("Para cancelar o programa insira 0");
		System.out.print("Informe um valor: ");
		num = teclado.nextFloat();
	}
	
	System.out.print("O maior n�mero informado foi " + maior);
	
	teclado.close();
	}

}
