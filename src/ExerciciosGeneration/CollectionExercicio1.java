package ExerciciosGeneration;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\nDigite uma cor: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("\nLista das cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\nCores odernadas: ");
		for(String cor : cores) {
			System.out.println(cor);
		}

	}

}
