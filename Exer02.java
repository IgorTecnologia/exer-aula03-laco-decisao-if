package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("\n**** Verificando números ****");
		
		System.out.println("\nEntre com um número:");
		numero = scan.nextInt();
		
		if(numero % 2 == 0 && numero >=0) {
			System.out.println("\nNúmero " + numero + " é par e positivo!");
		}else if(numero % 2 != 0 && numero < 0) {
			System.out.println("\nNúmero " + numero + " é ímpar e negativo!");
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("\nNúmero " + numero + " é par e negativo!");
		}else if(numero % 2 != 0 && numero >=0) {
			System.out.println("\nNúmero " + numero + " é ímpar e positivo!");
		}

	}

}
