//Elabore um algoritmo que leia as vari�veis c e n....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
	
	//Vari�veis
	float worked_h, e, wage, extra_wage, total;
	int employee;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o c�digo do colaborador: ");
	employee = teclado.nextInt();
	
	System.out.print("Informe a quantidade de horas trabalhadas: ");
	worked_h = teclado.nextFloat();
	
	//Processamento e Sa�das
	if(worked_h > 50) {
		e = worked_h - 50;
		extra_wage = e * 20;
		wage = 50 * 10;
		total = wage + extra_wage;
		System.out.println("O colaborador de c�digo " + employee + " receber� R$" + extra_wage + " das horas extras trabalhadas.");
		System.out.print("O colaborador receber� um total de R$" + total);
		}
	else {
		extra_wage = 0;
		total = worked_h * 10;
		System.out.println("O colaborador de c�digo " + employee + " n�o teve horas extras no referido m�s.");
		System.out.print("O colaborador receber� um total de R$" + total);
	}
	
		teclado.close();
	}

}
