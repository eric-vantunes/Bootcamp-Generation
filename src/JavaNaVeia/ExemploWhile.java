package JavaNaVeia;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int resultado, opcao, num;
		
		System.out.println("\n--Calculadora que só multiplica por 5-- ");
		System.out.println("\nDigite um numero diferente de 0: ");
		opcao = leia.nextInt();
		
		while(opcao != 0) {
			resultado = opcao * 5;
			System.out.println("\nO resultado da multiplicação é: " + resultado);
			
			System.out.println("\n Entre com outro numero ou digite 0 para sair: ");
			opcao = leia.nextInt();
					
		}
		System.out.println("\n Obrigado por usar nossa Calculadora futuristica! ");

	}

}
