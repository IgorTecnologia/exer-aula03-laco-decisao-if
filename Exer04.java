package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String palavra1, palavra2, palavra3;

		System.out.println("\nDefinindo o animal através das caracteristicas");
		System.out.println("\nVertebrado | ave | carnívoro | onivoro");
		System.out.println("\nInvertebrado | inseto | hematófago | herbívero | onivoro");

		System.out.println("\nEntre com a palavra 1: ");
		palavra1 = leia.next();

		System.out.println("\nEntre com a palavra 2: ");
		palavra2 = leia.next();

		System.out.println("\nEntre com a palavra 3: ");
		palavra3 = leia.next();

		if (palavra1.equalsIgnoreCase("Vertebrado")) {
			if (palavra2.equalsIgnoreCase("Ave")) {
				if (palavra3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("\nÉ uma águia");
				} else {
					System.out.println("\nÉ uma pomba");
				}
			} else if (palavra3.equalsIgnoreCase("Onivoro")) {
				System.out.println("\nÉ um ser humano");
			} else {
				System.out.println("\nÉ uma vaca");
			}
		} 
		
			if (palavra1.equalsIgnoreCase("Invertebrado")) {
				if (palavra2.equalsIgnoreCase("Inseto")) {
					if (palavra3.equalsIgnoreCase("hematofago")) {
						System.out.println("\nÉ uma pulga");
					} else {
						System.out.println("\nÉ uma largata");
					}
				} else if (palavra3.equalsIgnoreCase("onívoro")) {
					System.out.println("\nÉ uma Sanguessuga");
				} else {
					System.out.println("\nÉ uma minhoca");
				}

			}
	}
}


