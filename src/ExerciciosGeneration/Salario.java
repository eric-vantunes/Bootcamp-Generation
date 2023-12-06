package ExerciciosGeneration;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um salário: ");
		salario = leia.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\nNovo salário: " + novoSalario);
		
		leia.close();

	}

}
