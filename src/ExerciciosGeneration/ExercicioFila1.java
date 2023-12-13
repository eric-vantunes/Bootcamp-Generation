package ExerciciosGeneration;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int op;
		String nomeCliente;

		while (true) {
			System.out.println("\n1 - Adicionar cliente");
			System.out.println("\n2 - Listar cliente");
			System.out.println("\n3 - Chamar cliente");
			System.out.println("\n0 - Sair");

			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				nomeCliente = leia.next();
				fila.add(nomeCliente);
				System.out.println("\nO cliente " + nomeCliente + " foi adicionado");
				break;
			case 2:
				System.out.println("\nLista de clientes na fila: ");
				for (String nome : fila) {
					System.out.println(nome);
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nFila está vazia!");
				} else {
					nomeCliente = fila.poll();//Remove cliente.
					System.out.println("O cliente foi chamado");
					for (String nome : fila) {
						System.out.println(nome);
					}
				}
				break;
			case 0:
				System.out.println("\nPrograma finalizado, obrigado por usar nosso sistema!");
				return;
			default:
				System.out.println("Opção inválida!");
			}

		}
	}

}
