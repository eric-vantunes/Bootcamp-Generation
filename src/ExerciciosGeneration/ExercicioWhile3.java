package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, menorDe21 = 0, maiorDe50 = 0;
		
		while(true) {
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if(idade <= 0) {
				System.out.println("\nDigite zero para parar");
				break;
			}
			
			if(idade < 21) {
				menorDe21++;
			} else if(idade > 50) {
				maiorDe50++;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorDe21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maiorDe50);
		
		leia.close();

	}

}
