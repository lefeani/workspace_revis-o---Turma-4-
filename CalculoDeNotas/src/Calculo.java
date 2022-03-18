import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Área de declaração das variáveis
		String nome_aluno;
		double nota1,nota2,media;
		
		// Área destinada para pegar as informações do aluno
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o nome do aluno");
		nome_aluno = teclado.next();
		System.out.println("Digite a primeira nota");
		nota1=teclado.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2;
		System.out.println("O nome do(a) aluno(a) é "+nome_aluno+" e obteve a média "+media);
		
		if(media<5) {
			System.out.println("Aluno está reprovado!");
		}else if(media==5){
			System.out.println("Aluno está recuperação!");
		}else {
			System.out.println("Aluno está aprovado!");
		}
		
		
	}

}
