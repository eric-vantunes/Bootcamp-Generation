package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		boolean isFirst;
		
		System.out.println("\nDigite o nome do doador: ");
		name = input.nextLine();
		System.out.println("\nDigite a idade do doador: ");
		age = input.nextInt();
		System.out.println("\nÉ sua primeira doação de sangue? (True/False)");
		isFirst = input.nextBoolean();
		
		if (age >= 18 && age <= 69) {
            if (age >= 60 && age <= 69) {
                if (isFirst) {
                    System.out.println(name + ", você não está apto para doar sangue!");
                } else {
                    System.out.println(name + ", você está apto para doar sangue.");
                }
            } else {
                System.out.println(name + ", você está apto para doar sangue.");
            }
        } else {
            System.out.println(name + ", você não está apto para doar sangue!");
        }

        input.close();
    }

}
