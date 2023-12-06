package ExerciciosGeneration;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, calculoDiferenca;
		
		System.out.println("\nEntre com o valor 1:");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com o valor 2:");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com o valor 3:");
		n3 = leia.nextFloat();
		System.out.println("\nEntre com o valor 4:");
		n4 = leia.nextFloat();
		
		calculoDiferenca = (n1 * n2) - (n3 * n4);
		
		System.out.println("/nA diferença entre os produtos foram: " + calculoDiferenca);
		
		leia.close();
	}

}
