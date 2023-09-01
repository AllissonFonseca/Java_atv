package br.fonseca;

import java.util.Scanner;

public class Ex1_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Em qual ano você nasceu?:");
		int nasc = input.nextInt();
		int anoAtual = 2023;
		int idade = anoAtual - nasc;
		
		if (idade >= 18) {
			System.out.println("Você poderá votar este ano " + idade);
		}
		else {
			System.out.println("Você não poderá votar este ano " + idade);
		}
		
	}

}
