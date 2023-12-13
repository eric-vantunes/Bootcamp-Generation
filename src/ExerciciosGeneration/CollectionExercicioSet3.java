package ExerciciosGeneration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionExercicioSet3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		HashSet<Integer> numeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número inteiro, não repetido: ");
			numeros.add(leia.nextInt());
		}

		Iterator<Integer> iterator = numeros.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
