import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriarArquivo {

	public static void main(String[] args) throws IOException {
		String[] nome= {"Nicole","Diamila","Gizeuda"};
		
		// utilizando uma função para criar um arquivo
		FileWriter arquivo = new FileWriter("c:\\Nicole.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Nome das pessoas"+"%n");
		
		for (int registros=0; registros<3; registros++) {
			gravarArquivo.printf(nome[registros]+"%n");
		}
		arquivo.close();
		System.out.println("Arquivo gerado na unidade c:\nomes.txt");
	}

}