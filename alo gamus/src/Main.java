
public class Main {

	public static void main (String[] args) {
		/*int idade = 19;	
		System.out.println("agora descobri como falar que minha é "+idade);
		idade = idade+1;
		System.out.println("ano que vem terei "+idade);
		idade = idade-1;
		idade = idade+idade;
		System.out.println("o dobro da minha idade atual é "+idade+" anos");
		System.out.println("printando pela primeirca vez java");
		*/
		
		
		// use /**/ para linhas e mais linhas de comentarios, ja  depois, use // para somente uma
		
		
		/* tipos de variaveis possiveis
		int numero_integro = 19;
		String textos = " qualquer coisa que venha entre parenteses ";
		boolean verdade_ou_mentira = true;
		boolean mentira_ne = false;
		char letra_apenas = 'a';
		double float_de_python = 19.9;
		
		System.out.println(numero_integro+textos+" "+verdade_ou_mentira+" "+mentira_ne+" "+letra_apenas+" "+float_de_python);
		*/
		
		/*para transformar uma variavel em constante apenas adicione "final" antes de declarar
		 final int aloo = 10;
		 System.out.println(aloo);
		 */
		// array simples
		/*
		String[] nome = new String [5];
		nome[0] = "awwo";
		nome[1] = "isso é pica";
		System.out.println(nome[0]);
		*/
		// array multi
		String[][] nome = new String [5][5];
		nome[0][0] = "awwo";
		nome[1][0] = "isso é pica";
		nome[0][1] = "2";
		nome[1][1] = "40";
		System.out.println(nome[0][1]);		
		
	}
}
