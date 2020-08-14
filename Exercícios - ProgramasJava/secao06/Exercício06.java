//Elabore um algoritmo que leia as variáveis c e n....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
	
	//Variáveis
	float worked_h, e, wage, extra_wage, total;
	int employee;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o código do colaborador: ");
	employee = teclado.nextInt();
	
	System.out.print("Informe a quantidade de horas trabalhadas: ");
	worked_h = teclado.nextFloat();
	
	//Processamento e Saídas
	if(worked_h > 50) {
		e = worked_h - 50;
		extra_wage = e * 20;
		wage = 50 * 10;
		total = wage + extra_wage;
		System.out.println("O colaborador de código " + employee + " receberá R$" + extra_wage + " das horas extras trabalhadas.");
		System.out.print("O colaborador receberá um total de R$" + total);
		}
	else {
		extra_wage = 0;
		total = worked_h * 10;
		System.out.println("O colaborador de código " + employee + " não teve horas extras no referido mês.");
		System.out.print("O colaborador receberá um total de R$" + total);
	}
	
		teclado.close();
	}

}
