package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String caracteristica1, caracteristica2, caracteristica3;
		
		System.out.println("\nDigite a caracteristicas do animal 1: ");
		caracteristica1 = leia.nextLine();
		System.out.println("\nDigite a caracteristicas do animal 2: ");
		caracteristica2 = leia.nextLine();
		System.out.println("\nDigite a caracteristicas do animal 3: ");
		caracteristica3 = leia.nextLine();
		
		if (caracteristica1.equals("vertebrado")) {
            if (caracteristica2.equals("ave")) {
                if (caracteristica3.equals("carnivoro")) {
                    System.out.println("O animal é a Águia.");
                } else if (caracteristica3.equals("onivoro")) {
                    System.out.println("O animal é o Pombo.");
                }
            } else if (caracteristica2.equals("mamifero")) {
                if (caracteristica3.equals("onivoro")) {
                    System.out.println("O animal é o Homem.");
                } else if (caracteristica3.equals("herbivoro")) {
                    System.out.println("O animal é a Vaca.");
                }
            }
        } else if (caracteristica1.equals("invertebrado")) {
            if (caracteristica2.equals("inseto")) {
                if (caracteristica3.equals("hematofago")) {
                    System.out.println("O animal é a Pulga.");
                } else if (caracteristica3.equals("herbivoro")) {
                    System.out.println("O animal é a Lagarta.");
                }
            } else if (caracteristica2.equals("anelideo")) {
                if (caracteristica3.equals("hematofago")) {
                    System.out.println("O animal é a Sanguessuga.");
                } else if (caracteristica3.equals("onivoro")) {
                    System.out.println("O animal é a Minhoca.");
                }
            }
        } else {
            System.out.println("Não foi possível identificar o animal.");
        }
		
		leia.close();

	}

}
