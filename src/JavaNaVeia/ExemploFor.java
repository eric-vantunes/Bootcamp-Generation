package JavaNaVeia;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int contador;
		
		System.out.println("As vezes são limitadas, INSCREVA-SE JÁ");
		
		for(contador = 1; contador < 4; contador++) {
			System.out.println("\nVocê foi o " + contador + "°! digite seu nome: ");
			nome = leia.nextLine();
			leia.close();
		}
		
		System.out.println("Vagas esgotadas");
		
	}

}
