import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Leitura {
		  public static void main(String[] args){
		    String mostra="";
		    String nomeArq="c:\\nomes.txt"; //Nome do arquivo, pode ser absoluto, ou pastas /dir/teste.txt
		    String linha="";
		    File arq = new File(nomeArq);
		 
		    //Arquivo existe
		    if (arq.exists()){
		      mostra="Arquivo - '"+nomeArq+"', aberto com sucesso!\n";
		      mostra+="Tamanho do arquivo "+Long.toString(arq.length())+"\n";
		      // System.out.println(mostra);
		      //tentando ler arquivo
		      try{
		        mostra+="Conteudo:\n";
		        // System.out.println(mostra);
		        //abrindo arquivo para leitura
		        FileReader reader = new FileReader(nomeArq);
		        //leitor do arquivo
		        BufferedReader leitor = new BufferedReader(reader);
		        while(true){
		          linha=leitor.readLine();
		        // System.out.println(linha);
		          if(linha==null)
		            break;
		          mostra+=linha+"\n";
 
		        }
		      }
		      catch(Exception erro) {}
		      JOptionPane.showMessageDialog(null,mostra,"Arquivo...",1);
		    }
		    //Se nao existir
		    else
		      JOptionPane.showMessageDialog(null,"Arquivo nao existe!","Erro",0);
		  }
		
	}