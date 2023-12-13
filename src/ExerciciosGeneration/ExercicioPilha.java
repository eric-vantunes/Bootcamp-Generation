package ExerciciosGeneration;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		int op;
		String livro, livroRemovido;
		
		while(true) {
            System.out.println("\n1 - Adicionar livro");
            System.out.println("\n2 - Listar livros");
            System.out.println("\n3 - Retirar livro");
            System.out.println("\n0 - Sair");
            
            op = leia.nextInt();
            
            switch(op) {
            	case 1:
            		System.out.println("Digite o nome do livro: ");
            		livro = leia.next();
            		pilha.push(livro);
            		System.out.println("\nO livro foi adicionado");
            		break;
            	case 2:
            		System.out.println("\nLista de livros na pilha: ");
            		for(String livros : pilha) {
            			System.out.println(livros);
            		}
            		break;
            	case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        livroRemovido = pilha.pop();
                        System.out.println("\nUm livro foi retirado da pilha!");
                    }
                    break;
            	case 0:
            		System.out.println("Programa finalizado, obrigado por usar o nosso sistema! ");
            		return;
            	default: 
            		System.out.println("Opção inválida! ");
                  
            }
		}
	}
}

