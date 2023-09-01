package br.fonseca;

import java.util.Scanner;

public class Ex1_2 {

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner input = new Scanner(System.in);
	        System.out.println("Digite um numero:");
	        int numero = input.nextInt();

	        if (numero >= 0) {
	            System.out.println("Positivo");
	        } else {
	            System.out.println("Negativo");
	        }
	        input.close();
	    }

	} 

