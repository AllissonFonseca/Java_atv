package br.fonseca;

import java.util.Scanner;

public class Ex1_9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite quantas horas você trabalhou neste mês?:");
		int ht = input.nextInt();
		int hr = 100;
		int acres = 50;
		
		if (ht == 160) {
			System.out.println("Seu salario foi de R$16,000");
		}
		else if (ht > 160) {
			int resultfinal = (ht - 160) * (hr + acres) + (16000);
			System.out.println("Seu salario foi de R$" + resultfinal);
		}
		else {
			System.out.println("Você sera demitido em breve, aguarde");
		}
	}
}

