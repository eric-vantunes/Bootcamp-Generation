package ExerciciosGeneration;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("\nDigite o salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("\nDigite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5 ) - descontos;
		
		System.out.println("\nSalário liquído: " + salarioLiquido);
		
		leia.close();
	}

}
