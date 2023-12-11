package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioMatriz3 {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o número da posição " + i + "," + j + ": ");
				matriz[i][j] = leia.nextInt();
			}
		}
		
		System.out.println("Elementos Diagonal Principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i]);
			somaDiagonalPrincipal += matriz[i][2 - i];
		}
		System.out.println("Elementos Diagonal Secundaria: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][2 - i]);
			somaDiagonalSecundaria += matriz[i][2 - i];
		}
		
		System.out.println("Soma do elementos da Diagonal Principal" + somaDiagonalPrincipal);
		System.out.println("Soma do elementos da Diagonal Principal" + somaDiagonalSecundaria);
	}

}
