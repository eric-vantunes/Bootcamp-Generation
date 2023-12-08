package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioCondicional5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nomeProduto;
		int codigoProduto, quantidade; 
		double precoUnitario, total;
		
		System.out.println("\nFavor digite o código do produto de 1 a 6: ");
		codigoProduto = ler.nextInt();
		
		System.out.println("\nFavor digite a quantidade comprada: ");
		quantidade = ler.nextInt();
		
		switch(codigoProduto) {
			case 1:
				nomeProduto = "Cachorro Quente";
				precoUnitario = 10.00;
				break;
			case 2:
				nomeProduto = "X-Salada";
				precoUnitario = 15.00;
				break;
			case 3:
				nomeProduto = "X-Bacon";
				precoUnitario = 18.00;
				break;
			case 4:
				nomeProduto = "Bauru";
				precoUnitario = 12.00;
				break;
			case 5:
				nomeProduto = "Refrigerante";
				precoUnitario = 8.00;
				break;
			case 6:
				nomeProduto = "Suco de Laranja";
				precoUnitario = 13.00;
				break;
            default:
                System.out.println("Código de produto inválido.");
                return;
		}
		
		total = quantidade * precoUnitario;
		
		System.out.println("\nProduto: " + nomeProduto);
		System.out.printf("\nValor total foi: R$ %.2f\n ", total);
		
		ler.close();

	}
	

}
