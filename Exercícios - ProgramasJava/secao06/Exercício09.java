//A secretaria do Meio Ambiente que controla....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exerc�cio09 {

	public static void main(String[] args) {
	
	//Vari�veis
	float pollution_level;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o n�vel de polui��o: ");
	pollution_level = teclado.nextFloat();
	
	//Processamento de Sa�da
	if(pollution_level >= 0.3 && pollution_level < 0.4) {
		System.out.print("As empresas pertecentes ao grupo 1 devem suspender suas atividades.");
	}
	
	if(pollution_level >= 0.4 && pollution_level < 0.5) {
		System.out.print("As empresas pertecentes aos grupos 1 e 2 devem suspender suas atividades.");
	}
	
	if(pollution_level >= 0.5) {
		System.out.print("Todas as empresas devem suspender as atividades.");
	}
	
	if(pollution_level < 0.3) {
		System.out.print("O n�vel de polui��o est� dentro do limite aceit�vel.\nNenhuma empresa dever� suspender as atividades. ");
	}

	teclado.close();
	}

}
