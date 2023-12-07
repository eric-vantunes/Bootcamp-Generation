package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("\nDigite o número A: ");
		a = ler.nextInt();
		System.out.println("\nDigite o número B: ");
		b = ler.nextInt();
		System.out.println("\nDigite o número C: ");
		c = ler.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("\nA soma de A + B é maior que C");
		} else if (soma < c ) {
			System.out.println("\nA soma de A + B é menor que C");
		} else {
			System.out.println("\nA soma de A + B é igual a C");
		}
		
		
		ler.close();

	}

}
