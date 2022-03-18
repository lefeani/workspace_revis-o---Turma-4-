import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Aqui iremos pegar o valor digitado no teclado
		Scanner teclado = new Scanner(System.in);
		// Aqui criei uma variável para receber o valor numérico
		int numero_tabuada;
		// Aqui vou mostrar a mensagem na tela
		System.out.println("Informe o valor para executar a tabuada");
		// Aqui vou atribuir o valor que digitei no teclado a variável
		numero_tabuada = teclado.nextInt();
		
		// Criar o laço de repetição do nosso processo da tabuada
		for(int contador=1; contador<=10; contador++) {
			System.out.println(contador+" x "+numero_tabuada+" = "+(contador*numero_tabuada));
		}
		
	}

}
