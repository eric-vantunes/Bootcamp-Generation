package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int codigoOperacao;
		
        System.out.println("Digite o 1º número: ");
        numero1 = ler.nextFloat();

        System.out.println("Digite o 2º número: ");
        numero2 = ler.nextFloat();
        
        System.out.println("Digite o código da operação matemática de 1 a 4: ");
        codigoOperacao = ler.nextInt();
        
        switch (codigoOperacao) {
        case 1:
        	resultado = numero1 + numero2;
        	System.out.println(numero1 + " + " + numero2 + " = " + resultado);
        	break;
        case 2:
        	resultado = numero1 - numero2;
        	System.out.println(numero1 + " - " + numero2 + " - " + resultado);
        	break;
        case 3:
        	resultado = numero1 * numero2;
        	System.out.println(numero1 + " * " + numero2 + " = " + resultado);
        	break;
        	
        case 4:
        	resultado = numero1 / numero2;
        	System.out.println(numero1 + " / " + numero2 + " = " + resultado);
        	break;
        	
        default:
        	System.out.println("Operação inválida! ");
        }
        
	}

}
