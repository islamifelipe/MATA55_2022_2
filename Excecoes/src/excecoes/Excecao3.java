package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try { // maneira mais apropriada de tratar exceções em java
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			System.out.println(x / y);
		} catch(ArithmeticException e){
			System.out.println("Erro: divisão por zero");
		} catch(InputMismatchException e) {
			System.out.println("Entrada inválida");

		}
		
		
		System.out.println("Fim");

		
		
	}

}
