//Construa um algoritmo que leia 10 valores inteiros e positivos e a) encontre o maior
//valor, b) encontre o menor valor e calcule a média dos nº lidos.

package br.com.brunomadrini.secao07;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
	
	//Variáveis
	float maior = -999, menor = 999, soma = 0, i = 0, num, media;
	Scanner teclado = new Scanner (System.in);
	
	//Entrada
	for (i = 0; i < 10; i++){
		System.out.print("Informe um valor: ");
		num = teclado.nextFloat();
		
	//Processamento
	if(num > 0){
		if(num > maior){
			maior = num;
			}
		if(num < menor){
			menor = num;
			}
		soma = soma + num;
		
		}else{
				i--;
			}
		}
			media = soma / 10;

	//Saída
	System.out.println("O maior número é: " + maior);
	System.out.println("O menor número é: " + menor);
	System.out.println("A média dos números informados é: " + media);
	
	teclado.close();
	}


}

