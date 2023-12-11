package JavaNaVeia;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][2];
		int contPares=0, somaImpar=0, linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0; linha<3; linha++) {
			for(coluna=0; coluna<2; coluna++) {
				System.out.println("\nEntre com um número na linha " + linha + " e na coluna " + coluna);
				numeros[linha][coluna] = leia.nextInt();
				
				if(numeros[linha][coluna] % 2 == 0) {
					contPares++;
				} else {
					somaImpar += numeros[linha][coluna];
				}
			}
		}
		
		System.out.println("\nEu tenho: " + contPares + " numeros pares...");
		System.out.println("\nSomatório do números ímpares: " + somaImpar);

	}

}
