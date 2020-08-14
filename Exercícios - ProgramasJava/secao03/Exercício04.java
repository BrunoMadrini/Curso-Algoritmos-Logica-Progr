//Faça um alg. que pergunta quanto você ganha por hora e o n de horas trab
//no mês. Calcule e mostre o total do salário no referido mês.

package br.com.brunomadrini.secao03;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
	
	//Variáveis
	float hour_value, worked_hours, pay;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
	worked_hours = teclado.nextFloat();
	
	System.out.print("Informe o valor, em reais, da hora trabalhada: ");
	hour_value = teclado.nextFloat();
	
	//Processamento
	pay = hour_value * worked_hours;
	
	//Saída
	System.out.print("O salário do mês será de R$ " + pay + "." );

	teclado.close();
	}

}
