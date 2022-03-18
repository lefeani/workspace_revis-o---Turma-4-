import java.util.Scanner;

public class Analise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String senha;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a senha do sistema");
		senha = teclado.next();
		System.out.println("A quantidade de digitos da senha é "+senha.length());
		
		if(senha.length()<9) {
			System.out.println("A senha deverá ser no mínimo maior que 9!");
		}else if(senha.equals("gama@2022")){
			System.out.println("Senha com sucesso!!!");
		}else {
			System.out.println(" A senha informada é inválida");
		}
		
		
	}

}
