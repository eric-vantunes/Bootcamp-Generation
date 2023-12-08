package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, contador;
		
		System.out.println("\nDigite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		numero2 = leia.nextInt();
		
		
		if(numero1 > numero2) {
			System.out.println("\nNúmero informado inválido, o primeiro número deve ser menor.");
			System.exit(0);
		} 
		
		
		for(contador = numero1; contador <= numero2; contador++) {
			
			if(contador % 3 == 0 && contador % 5 == 0) {
				System.out.println(contador + " é multiplo de 3 e 5");
			}
		}
		
		leia.close();
		
		
	}

}
