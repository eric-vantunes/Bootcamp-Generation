package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
				
		int numero[] = new int[10];
		int numDesejado, x;
		boolean numEncontrado;
		
		Scanner leia = new Scanner(System.in);
			
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o número da posição " + (i + 1) + ": ");
			numero[i] = leia.nextInt();
		}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numDesejado = leia.nextInt();
		
		numEncontrado = false;
		
		for (int i = 0; i < 10; i++) {
			x = numero[i];
			if(x == numDesejado) {
				System.out.println("O número " + numDesejado + "está localizado na posição: " + (x - 1));
				numEncontrado = true;
			}
		}
		
		if(!numEncontrado) {
			System.out.println("O número " + numDesejado + "não foi encontrado! ");
		}

	}

}
