
public class GerarRegistros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome={"Bruno","Alex","Erika","Jonathan","Ricardo","Rogério","Nicole","Amanda"};
		
		
		System.out.println(nome.length);
		
		// System.out.println(nome[6]);
		int numero_reg=1;
	    for(int contador=0; contador<=8; contador++) {
	    	
			System.out.println(numero_reg+"-"+nome[contador]);
			numero_reg++;
		}
	}

}
