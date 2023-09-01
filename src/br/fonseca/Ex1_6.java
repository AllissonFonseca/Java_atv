package br.fonseca;

import java.util.Scanner;

public class Ex1_6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero:");
		int num1 = input.nextInt();
		System.out.println("Digite outro numero(Diferente do primeiro");
		int num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + " É o maior");	
		}
		else if (num1 < num2) {
			System.out.println(num2 + " É o maior");
		}
		else {
			System.out.println("Eles são iguais");
		   
		}
	}
}
