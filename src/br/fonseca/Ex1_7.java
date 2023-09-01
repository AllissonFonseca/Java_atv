package br.fonseca;

import java.util.Scanner;

public class Ex1_7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Escreva um numero:");
		int num1 = input.nextInt();
		System.out.println("Escreva outro numero:");
		int num2 = input.nextInt();
		
		if (num1 < num2) {
			System.out.println(num1 + " ," + num2);
		}
		else {
			System.out.println(num2 + " ," + num1);
		}
	}

}
