//Elabora um algoritmo que leia a idade de um nadador e classifique-o em uma das
//categorias.


package br.com.brunomadrini.secao06;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
	
	//Variáveis
	int age;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	System.out.print("Informe a idade do nadador: ");
	age = teclado.nextInt();
	
	//Processamento e Saída
	if (age >= 5 && age <= 7) {
		System.out.print("O nadador pertece a categoria Infantil A.");
		}
	if (age >=8 && age <= 11) {
		System.out.print("O nadador pertence a categoria Infantil B.");
		}
	if (age >=12 && age <= 13) {
		System.out.print("O nadador pertence a categoria Juvenil A.");
		}
	if (age >=14 && age <= 17) {
		System.out.print("O nadador pertence a categoria Juvenil B.");
		}
	if (age >= 18) {
		System.out.print("O nadador pertence a categoria Adulto.");
		}
	if(age < 5) {
		System.out.print("O nadador não pertence a nenhuma categoria.");
		}	
	
	teclado.close();
	}
}
