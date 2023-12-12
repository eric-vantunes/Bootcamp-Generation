package ExerciciosGeneration;

import java.util.HashSet;
import java.util.Scanner;

public class CollectionExercicioSet4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		HashSet<Integer> numeros = new HashSet<>();
		int numero;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numeros.add(leia.nextInt());
		}
		
		System.out.println("Digite o número que deseja encontrar: ");
		numero = leia.nextInt();
		
		if(numeros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		System.out.println("Set: ");
		for (int numSet : numeros) {
			System.out.println(numSet);
		}
	}

}
