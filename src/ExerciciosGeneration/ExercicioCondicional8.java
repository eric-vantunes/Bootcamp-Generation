package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float saldo = 1000.00f, valorSaque, valorDeposito;
		int codigoOperacao;
		
		System.out.println("Digite o Código da Operação de 1 a 3: ");
		codigoOperacao = ler.nextInt();
		
		switch (codigoOperacao) {
			case 1:
				System.out.println("\nSaldo");
				System.out.printf("Saldo: R$ %.2f\n", saldo);
				break;
			case 2:
				System.out.println("\nSaque");
				System.out.println("Qual valor a ser sacado ? ");
				valorSaque = ler.nextFloat();
				if(valorSaque > saldo) {
					System.out.println("Saldo insuficiente! ");
				} else {
					saldo = saldo - valorSaque;
					System.out.printf("Novo Saldo: R$ %.2f\n ", saldo);
				}
				break;
			case 3:
				System.out.println("\nDepósito");
				System.out.println("Digite o valor a ser depositado: ");
				valorDeposito = ler.nextFloat();
				saldo = saldo + valorDeposito;
				System.out.printf("Novo Saldo: R$ %.2f\n ", saldo);
				break;
			default:
				System.out.println("\nOperação Inválida");
				break;
		}
		
		ler.close();
		

	}

}
