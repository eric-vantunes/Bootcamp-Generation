package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int totalDePares = 0, totalDeImpares = 0, contador, numero;
		
		System.out.println("\nDigite 10 número inteiros: ");
		
		for(contador = 1; contador <=10; contador++) {
			System.out.println("\nDigite o " + contador + "º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				totalDePares++;
			} else {
				totalDeImpares++;
			}
		}
		
	    System.out.println("\nTotal de números pares: " + totalDePares);
        System.out.println("Total de números ímpares: " + totalDeImpares);
		
		leia.close();

	}

}
