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
			
			float soma = 0;
			
			while(true) {
				System.out.println("Informe a Idade: ");
				idade = leia.nextInt();
				System.out.println("Gênero (1 - Mulher Cis; 2 - Homem Cis; 3 - Não Binário; 4 - Mulher Trans; 5 - Homem Trans; 6 - Outros): )");
				genero = leia.nextInt();
	            System.out.println("Pessoa Desenvolvedora (1 - Backend; 2 - Frontend; 3 - Mobile; 4 - FullStack): ");
	            pessoaDesenvolvedora = leia.nextInt();
	            	            	            
	            //Backend
	            if(pessoaDesenvolvedora == 1) {
	            	contadorBackend++;
	            }
	            //Frontend
	            else if(genero == 1 || genero == 4) {
	            	if(pessoaDesenvolvedora == 2) {
	            		contadorFrontendMulher++;
	            	}
	            //Mobile	
	            } else if (genero == 2 || pessoaDesenvolvedora == 5) {
	            	if(pessoaDesenvolvedora == 3 && idade > 40) {
	            		contadorMobileMaior40++;
	            	}
	            }
	            
	            //Fullstack
	            if(genero == 3) {
	            	if(pessoaDesenvolvedora == 4 && idade < 30) {
	            		contadorFullStackNaoBinarioMenor30++;
	            	}
	            }
	            contadorPessoas++;   
	            
	            soma = soma + idade;
	            
	            System.out.println("\nDeseja continuar (S/N)");
	            char continuar = leia.next().charAt(0);
	            if(continuar == 'N' || continuar == 'n') {
	            	break;
	            }
			}
			
	        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + contadorBackend);
	        System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + contadorFrontendMulher);
	        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + contadorMobileMaior40);
	        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + contadorFullStackNaoBinarioMenor30);
	        System.out.println("\nO número total de pessoas que responderam à pesquisa: " + contadorPessoas);
	        System.out.println("\nA média de idade das pessoas que responderam à pesquisa: " + soma / contadorPessoas);
	        
	       	} 
			
	}

