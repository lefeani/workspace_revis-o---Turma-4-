import java.util.Scanner;

public class ExecutarCaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		do {
		
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Sair");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a opção desejada");
		opcao=teclado.nextInt();
		
		// Com a variável opção já tendo um conteúdo, vamos escolher qual opção será executado
		
		switch(opcao) {
		case 1:
			int num1,num2,total;
			System.out.println("Digite o Primeiro número");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			num2 = teclado.nextInt();
			total=num1+num2;
			System.out.println("O resultado da soma de :"+num1+"+"+num2+"="+total);
			
			break;
		case 2:
			System.out.println("Digite o Primeiro número");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			num2 = teclado.nextInt();
			total=num1-num2;
			System.out.println("O resultado da soma de :"+num1+"-"+num2+"="+total);
			break;
		case 3:
			System.out.println("Digite o Primeiro número");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			num2 = teclado.nextInt();
			total=num1/num2;
			System.out.println("O resultado da soma de :"+num1+"/"+num2+"="+total);
			break;
		case 4:
			System.out.println("Digite o Primeiro número");
			num1 = teclado.nextInt();
			System.out.println("Digite o Segundo número");
			num2 = teclado.nextInt();
			total=num1*num2;
			System.out.println("O resultado da soma de :"+num1+"*"+num2+"="+total);
			break;
		case 5:
			System.out.println("Sair");
			break;
		default:
			System.out.println("Opção inválida");
		}
	
	}while(opcao<5 ||opcao==0||opcao>5);

	}

}