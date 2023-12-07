package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nomeColaborador, cargo;
		int codigoCargo;
		float salario, reajuste, novoSalario;
		
		
		System.out.println("\nDigite o nome do Colaborador: ");
		nomeColaborador = ler.nextLine();
		System.out.println("\nDigite o código do cargo do Colaborador de 1 a 6: ");
		codigoCargo = ler.nextInt();
		System.out.println("\nDigite o salário do Colaborador: ");
		salario = ler.nextFloat();
		
		switch (codigoCargo) {
        case 1:
            cargo = "Gerente";
            reajuste = 0.10f;
            break;
        case 2:
            cargo = "Vendedor";
            reajuste = 0.07f;
            break;
        case 3:
            cargo = "Supervisor";
            reajuste = 0.09f;
            break;
        case 4:
            cargo = "Motorista";
            reajuste = 0.06f;
            break;
        case 5:
            cargo = "Estoquista";
            reajuste = 0.05f;
            break;
        case 6:
            cargo = "Técnico de TI";
            reajuste = 0.08f;
            break;
        default:
            System.out.println("Código de cargo inválido.");
            return;
		}
		
		novoSalario = salario + (reajuste * salario);
		
        System.out.println("\nNome do colaborador: " + nomeColaborador);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", novoSalario);
        
        ler.close();
	}

}
