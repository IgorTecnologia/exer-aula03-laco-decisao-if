package com.igor.cursojava.aula03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
	
		String nome;
		int idade;
		boolean doador;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o nome:");
		nome = scan.nextLine();
		
		System.out.println("\nDigite a idade:");
		idade = scan.nextInt();
		
		System.out.println("\nPrimeira doação de sangue ?");
		doador = scan.nextBoolean();
		
		if(idade < 18) {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		}else if(idade >=18 && idade <60) {
			System.out.println("\n" + nome + " está apto para doar sangue!");
		}
		if(idade >=60 && idade <= 69 && doador == true) {
			System.out.println("\n" + nome + " não está apto para doar sangue!");	
		}else if(idade >=60 && idade <=69 && doador == false ) {
			System.out.println("\n" + nome + " está apto para doar sangue!");
		}else {
			System.out.println("\nInformações inválidas");
		}
	}
}
