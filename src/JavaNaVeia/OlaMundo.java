package JavaNaVeia;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		String nome = "Eric Antunes";
		int idade = 25;
		float altura = (float) 1.81;
				
		System.out.println("\nEntre com seu nome: ");
		nome = leia.nextLine();
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nEntre com sua altura: ");
		altura = leia.nextFloat();
				
		System.out.println(
				"\nMeu nome é: " + nome + 
				"\nEu tenho: "+idade+" ano(s) de vida... " + 
			    "\nEu tenho: "+altura+ " metro(s) de altura... ");
		
		leia.close();
	} 
}
