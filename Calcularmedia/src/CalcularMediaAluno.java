import java.util.Scanner;

	public class CalcularMediaAluno {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			String nome,classe,matricula;
			double nota1, nota2, nota3, nota4,media = 0;
		
			
			System.out.println("Digite a classe dos alunos");
			classe = input.next();
			

			for(int i=0 ; i<4 ; i++) {
				
			System.out.println("Digite a matricula do aluno");
			matricula = input.next();
				
			System.out.println("Digite o nome do aluno");
			nome = input.next();
			
			System.out.println("Digite a nota 1º bimestre: ");
			nota1 = input.nextDouble();
			
			System.out.println("Digite a nota 2º bimestre:: ");
			nota2 = input.nextDouble();
			
			System.out.println("Digite a nota 3º bimestre: ");
			nota3 = input.nextDouble();
			
			System.out.println("Digite a nota 4º bimestre: ");
			nota4 = input.nextDouble();
			
			media = (nota1+nota2+nota3+nota4)/4;
			
			System.out.printf("Média: %s \n",media);
			
			if(media < 5) {
				System.out.println("Aluno reprovado");
			}else {
				System.out.println("Aluno Aprovado");
			}
	}
			
		
	}
			
	}

