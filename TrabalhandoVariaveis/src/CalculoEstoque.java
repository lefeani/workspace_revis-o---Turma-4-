import java.util.Scanner;

public class CalculoEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String produto;
		int quantidade;
		double valor;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o produto desejado");
		produto = teclado.next();
		System.out.println("Digite quantidade de produtos");
		quantidade = teclado.nextInt();
		System.out.println("Digite o valor do produto");
		valor = teclado.nextDouble();
		System.out.println("O produto "+produto+ " contem o valor de R$"+quantidade*valor+ " em estoque ");
		
	}

}
