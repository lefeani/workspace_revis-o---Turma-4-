import java.util.Scanner;

public class CriaRegistro {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] produtos = new String[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int contador=0; contador<5; contador++) {
			System.out.println("Insira o "+contador+" º, produto:");
			produtos[contador]=teclado.next();
			
		}
		
		// Laço de Repetição
		int contagem=1;
		for(int retorno=0; retorno<5; retorno++) {
			System.out.println(contagem+"-"+produtos[retorno]);
			
		}
		
	}

}
