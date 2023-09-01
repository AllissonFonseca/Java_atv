package br.fonseca;

import java.util.Scanner;

public class Ex1_3 {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas maçãs irá comprar?");
        float numero = input.nextFloat();
        double valor = numero + 0.30 * numero;

        if (numero < 12) {
            System.out.println("irá custar: " + valor);
        } else {
            System.out.println("irá custar: " + numero);
        }
        input.close();
    }



}
