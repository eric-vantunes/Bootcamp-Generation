package EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
	public static void main(String[] args) {
		Queue<String> agenda = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int op;

		do {

			System.out.println("\n------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Agendamento?");
			System.out.println("\n(2) Mostrar agenda?");
			System.out.println("\n(3) Pesquisar Agendamento?");
			System.out.println("\n(4) Agendamento concluido?");
			System.out.println("\n(0) Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();

			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome: ");
				agenda.add(ler.nextLine());
				break;
			case 2:
				System.out.println("\nNomes agendados: ");
				System.out.println(agenda);
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o nome: ");
				System.out.println("\nEste nome:" + agenda.contains(ler.nextLine()));
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nNome: " + agenda.remove() + " atendimento concluido");
				break;
			default:
				break;
			}

		} while (op != 0);

		ler.close();
	}

}
