//Fa�a um alg. que pergunta quanto voc� ganha por hora e o n de horas trab
//no m�s. Calcule e mostre o total do sal�rio no referido m�s.

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
	
	//Vari�veis
	float hour_value, worked_hours, pay;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
	worked_hours = teclado.nextFloat();
	
	System.out.print("Informe o valor, em reais, da hora trabalhada: ");
	hour_value = teclado.nextFloat();
	
	//Processamento
	pay = hour_value * worked_hours;
	
	//Sa�da
	System.out.print("O sal�rio do m�s ser� de R$ " + pay + "." );

	teclado.close();
	}

}
