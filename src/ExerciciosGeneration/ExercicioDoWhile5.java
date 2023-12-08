package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioDoWhile5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if(numero >= 0) {
				soma = soma + numero;
			}
		} while (numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);

	}

}
