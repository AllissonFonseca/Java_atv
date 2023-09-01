package br.fonseca;

import java.util.Scanner;

public class Ex1_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu salario fixo:");
		double sf = input.nextDouble();
		System.out.println("Digite o valor das vendas feitas:");
		double vf = input.nextDouble();
		
		if (vf <= 1500.0) {
		double comissao = vf * 0.03;
		
		double salariototalsc = sf + comissao;
		
		System.out.println("Seu salario total foi de: R$" + salariototalsc);
		}
		else {
	    double comissao = 1500.0 * 0.03 + (vf - 1500.0) * 0.05;
		
		double salariototal = sf + comissao;
		
		System.out.println("Seu salario total foi de: R$" + salariototal);
	}
}
}
