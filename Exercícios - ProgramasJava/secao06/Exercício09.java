//A secretaria do Meio Ambiente que controla....

package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
	
	//Variáveis
	float pollution_level;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe o nível de poluição: ");
	pollution_level = teclado.nextFloat();
	
	//Processamento de Saída
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
		System.out.print("O nível de poluição está dentro do limite aceitável.\nNenhuma empresa deverá suspender as atividades. ");
	}

	teclado.close();
	}

}
