package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioDoWhile6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int numero, soma = 0, quantidade = 0;
		double media;
		
		do {
			System.out.println("\nDigite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0) {
				soma = soma + numero;
				quantidade++;
			}
		} while(numero != 0 );
		
		media = soma / quantidade;
		
		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	}

}
