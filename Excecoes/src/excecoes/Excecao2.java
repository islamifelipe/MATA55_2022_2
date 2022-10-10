package excecoes;

import java.util.Scanner;

public class Excecao2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		try { // maneira mais apropriada de tratar exceções em java
			System.out.print ("Tentando ");
			System.out.print ("dividir ");
			System.out.println ("x / y");
			System.out.println(x / y);
		} catch(ArithmeticException e){
			/*  As exceções são objetos que descrevem um erro, indicando a
				causa do erro, a linha de código onde o erro aconteceu, e
				possivelmente outras informações.
			*/
			System.out.println("Erro: divisão por zero");

		}
		
		
	/*o  que acontece se, em vez de digitarmos um número, 
	 * digitarmos uma palavra?*/
		
		System.out.println("Fim");

	}
}
