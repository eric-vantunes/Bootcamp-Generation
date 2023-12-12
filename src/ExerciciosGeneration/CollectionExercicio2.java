package ExerciciosGeneration;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		int numEncontrado, posicao;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\nDigite um número: ");
			numeros.add(leia.nextInt());
		}
		
		System.out.println("Lista de números: ");
		for(int numero : numeros) {
			System.out.println(numero + " ");
		}
		
		System.out.println();
		
		System.out.println("Digite o número que deseja encontrar: ");
		numEncontrado = leia.nextInt();
		
		posicao = numeros.indexOf(numEncontrado);
		
		if(posicao >= 0) {
			System.out.println("O número " + numEncontrado + " está na posição: " + posicao);
		} else {
			System.out.println("O número " + numEncontrado + " não foi encontrado! ");
		}
		

	}

}
