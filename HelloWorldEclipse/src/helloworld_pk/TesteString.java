package helloworld_pk;

public class TesteString {
	public static void main(String args[]) {
		// imprimir uma string
	//	System.out.println("PAF 0");
		
		// concatena duas strings
		System.out.println("PAF " + "1");
		
		// converte o inteiro 2 para string e concatena
	//	System.out.println("PAF " + 2);
		
		/* Convete o float 3.4 para string 
		 * e concatena com "PAF ". Resultando na string "PAF 3.4". 
		 * A string "PAF 3.4" é atribuída a um objeto
		 * do tipo String chamado "my_string_3"
		*/
	//	String my_string_3 = "PAF " + 3.4;
		
		
		/* Concatena as strings "PAF " e "4" resultando em "PAF 4"
		 * A string "PAF 4" é atribuída a um objeto
		 * do tipo String chamada "my_string_4"
		*/
	//	String my_string_4 = "PAF " + "4";
		
		
	//	System.out.println(my_string_3);
	//	System.out.println(my_string_4);
	//	System.out.println(my_string_3 + " "+my_string_4);
		


		// Manipulando strings
	/*	String x = "Alo mundo";
		System.out.println(x); 
		String y = x.toUpperCase();
		System.out.println(y); 
		char quinto = y.charAt(4);
		System.out.println(quinto); 
		int tamanho = y.length(); 
		System.out.println(tamanho); 
		String z = y + "!!!"; 
		System.out.println(z);*/
		
		
		// comparando strings
		/*String a = "alo mundo";
		String b = "ALO MUNDO".toLowerCase();
		System.out.println(a == b);
		System.out.println(a.equals(b));*/
		
		String a = "alo mundo";
		String b = "ALO MUNDO".toLowerCase(); //"alo mundo"
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
