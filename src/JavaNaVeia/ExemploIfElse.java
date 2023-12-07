package JavaNaVeia;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
		float n1, n2, n3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a nota 1: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com a nota 2: ");
		n2 = ler.nextFloat();
		System.out.println("\nEntre com a nota 3: ");
		n3 = ler.nextFloat();
		
		media = (n1 + n2 + n3)/3;
		
		System.out.println("\nMédia aritmética: " + media);
		
		if(media >=7 && media <=10) {
			System.out.println("\nVocê foi aprovado!!! ");
		} else if (media>=5 && media<7){
			System.out.println("\nVocê ficou de Exame!!! ");
		} else {
			System.out.println("\nVocê foi reprovado!!!");
		}
		
		ler.close();

	}

}
