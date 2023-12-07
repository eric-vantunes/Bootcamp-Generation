package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		int numero;
		
		System.out.println("\nDigite um número inteiro: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("\nO número " + numero + " é par e positivo!");
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("\nO número " + numero + " é par e negativo");
		} else if (numero < 0){
			System.out.println("\nO número " + numero + " é impar e negativo!");
		} else if (numero > 0){
			System.out.println("\nO número " + numero + " é ímpar e positivo");
		} else {
			System.out.println("\nO número é zero");
		}
				
		leia.close();

	}

}
