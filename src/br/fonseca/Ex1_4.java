package br.fonseca;

import java.util.Scanner;

public class Ex1_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Diga sua nota da 1a:");
		float nota1 = input.nextFloat();
		System.out.println("Diga sua nota da 2a:");
		float nota2 = input.nextFloat();
		float resultado = (nota1 + nota2) /2;
		
		if (resultado >= 6) {
			System.out.println("Aprovado " +  resultado);
            }
		else {
			System.out.println("Reprovado " +  resultado);
			}
		}
	}

