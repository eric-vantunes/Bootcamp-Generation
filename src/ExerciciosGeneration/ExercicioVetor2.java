package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioVetor2 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		int soma = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número da posição " + (i + 1) + ": ");
			numeros[i] = leia.nextInt();
		}
		System.out.println("Elementos pares: ");
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2==0) {
				System.out.println(numeros[i]);
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		
		media = soma / numeros.length;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	}

}
