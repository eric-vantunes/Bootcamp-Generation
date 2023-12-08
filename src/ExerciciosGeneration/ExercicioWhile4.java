package ExerciciosGeneration;

import java.util.Scanner;

public class ExercicioWhile4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
			int 
			idade, 
			genero, 
			pessoaDesenvolvedora, 
			contadorFrontendMulher = 0, 
			contadorBackend = 0, 
			contadorMobileMaior40 = 0, 
			contadorFullStackNaoBinarioMenor30 = 0, 
			contadorPessoas = 0;
			
			double soma = 0;
			
			while(true) {
				System.out.println("Informe a Idade: ");
				idade = leia.nextInt();
				System.out.println("Gênero (1 - Mulher Cis; 2 - Homem Cis; 3 - Não Binário; 4 - Mulher Trans; 5 - Homem Trans; 6 - Outros): )");
				genero = leia.nextInt();
	            System.out.println("Pessoa Desenvolvedora (1 - Backend; 2 - Frontend; 3 - Mobile; 4 - FullStack): ");
	            pessoaDesenvolvedora = leia.nextInt();
	            
	            System.out.println("\nDeseja continuar (S/N)");
	            char resposta = leia.next().charAt(0);
	            
	            if(resposta == 'N' || resposta == 'n') {
	            	break;
	            }
	            
	            if(pessoaDesenvolvedora == 1) {
	            	contadorBackend++;
	            } else if(genero == 1 || genero == 4) {
	            	if(pessoaDesenvolvedora == 2) {
	            		contadorFrontendMulher++;
	            	}
	            } else if (genero == 3 && pessoaDesenvolvedora == 4) {
	            	if(idade < 30) {
	            		contadorFullStackNaoBinarioMenor30++;
	            	}
	            }
	            
	            soma = soma + idade;
	            contadorPessoas++;
			}
			
	        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + contadorBackend);
	        System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorFrontendMulher);
	        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contadorMobileMaior40);
	        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contadorFullStackNaoBinarioMenor30);
	        System.out.println("\nO número total de pessoas que responderam à pesquisa: " + contadorPessoas);
	        System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " + soma / contadorPessoas);
	        
	        leia.close();

	} 

}
