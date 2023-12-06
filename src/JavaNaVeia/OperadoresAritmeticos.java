package JavaNaVeia;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("\nDigite o primeiro número: ");
		x = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		y = leia.nextInt();
		
		x += y;
		
		System.out.println("\nSoma: " + x);
		
		leia.close();

	}

}
