import java.util.Scanner; /* Importando bibilioteca Scanner do java */


public class Programa { /* Declarando uma classe em Java chamado Programa */ 

	public static void main(String[] args) { /* Método principal do java */
		
		Scanner sc = new Scanner(System.in); /* Criando um objeto da  classe Scanner que será utilizado para ler os dados digiatos
												pelo usuário */					
		
		System.out.println("Digite a primeira coordenada x:");
		int x = sc.nextInt();
		
		System.out.println("Digite a primeira coordenada y:");
		int y = sc.nextInt();
		
		while(x != 0 && y != 0){ /* Criei uma condicional while o para verificar
		 							se o número for diferente de zero */
			
			if(x > 0 && y > 0) { /* Utilizei a condicional para verificar
			 						o quadrante do número digitado */ 
				
				System.out.println("Primeiro Quadrante");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Segundo Quadrante:");
				
			}
			else if (x  < 0 && y < 0) {
				System.out.println("Terceiro Quadrante:");
			}
			
			else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante:");
			}
			
			System.out.println("Digite a primeira coordenada x:");
			 x = sc.nextInt();
			
			System.out.println("Digite a segunda coordenada y:");
			 y = sc.nextInt();
			
			
		}
		System.out.println("Voce digitou uma coordenada nula(0)! "); /* Mensagem para o usuário
		 																se o número digitado for 0 */
		sc.close(); /* Encerrei a conexão com a fonte de entrada */

	}

}
