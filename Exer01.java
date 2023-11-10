package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int C;
		
		System.out.println("\n**** Operações aritiméticas ****");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A:");
		A = scan.nextInt();
		
		System.out.println("\nEntre com o número B:");
		B = scan.nextInt();
		
		System.out.println("\nEntre com o número C");
		C = scan.nextInt();
		
		if(A + B > C) {
			System.out.println("\nA soma de A + B é maior que C");
		}else if(A + B < C) {
			System.out.println("\nA soma de A + B é menor que C");
		}else {
			System.out.println("\nA soma de A + B é igual a C");
		
		}
		
	}

}
