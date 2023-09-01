package br.fonseca;

import java.util.Scanner;

public class Ex1_8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a hora que o jogo iniciou:");
		int hr1 = input.nextInt();
		System.out.println("Digite a hora que o jogo acabou:");
		int hr2 = input.nextInt();
	    int duracao = hr2 - hr1;
		
		if (duracao > 24) {
			System.out.println("A partida excedeu o tempo maximo " + duracao + " Horas");
		}	else {
			System.out.println("A partida durou " + duracao + " Horas");
			}
		}
	}

