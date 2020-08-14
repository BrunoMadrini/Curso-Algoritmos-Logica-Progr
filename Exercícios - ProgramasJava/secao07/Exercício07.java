//Sua organização acaba de contratar um estagiário...

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
	
	//Variáveis
	int cont_t = 0, cont_sit_1 = 0, cont_sit_2 = 0, cont_sit_3 = 0, cont_sit_4 = 0, 
	id, def; 
	float p1, p2, p3, p4;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe a identificação do mouse: ");
	id = teclado.nextInt();
	
	while(id != 0) {
		System.out.println("1 - Necessita de esfera.");
		System.out.println("2 - Necessita de limpeza.");
		System.out.println("3 - Necessita de troca do cabo ou conector.");
		System.out.println("4 - Quebrado ou Inutilizável.");
		System.out.print("Informe o tipo de defeito: ");
		def = teclado.nextInt();
		
	//Processamento
		if(def == 1) {
			cont_sit_1 = cont_sit_1 + 1;
		}
		if(def == 2) {
			cont_sit_2 = cont_sit_2 + 1;
		}
		if(def == 3) {
			cont_sit_3 = cont_sit_3 + 1;
		}
		if(def == 4) {
			cont_sit_4 = cont_sit_4 + 1;
		}
		cont_t = cont_t + 1;
		
	//Entrada novamente
		System.out.print("Informe a identificação do mouse: ");
		id = teclado.nextInt();
	}
	
	p1 = ((float)cont_sit_1 / (float)cont_t) * (float) 100;
	p2 = ((float)cont_sit_2 / (float)cont_t) * (float) 100;
	p3 = ((float)cont_sit_3 / (float)cont_t) * (float) 100;
	p4 = ((float)cont_sit_4 / (float)cont_t) * (float) 100;
	
	//Saída
	System.out.printf("Quantidade de mouses: %d\n\n", cont_t);
	System.out.println("Situação \t\t\t\t\t\tQuantidade \tPercentual\n");
	System.out.printf("1 - Necessita de esfera \t\t\t\t%d \t\t%.2f\n", cont_sit_1, p1);
	System.out.printf("2 - Necessita de limpeza \t\t\t\t%d \t\t%.2f\n", cont_sit_2, p2);
	System.out.printf("3 - Necessita de troca do cabo ou conector \t\t%d \t\t%.2f\n", cont_sit_3, p3);
	System.out.printf("4 - Quebrado ou Inutilizável \t\t\t\t%d \t\t%.2f\n", cont_sit_4, p4);
	
	teclado.close();
	}

}
