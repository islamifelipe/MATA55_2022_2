package excecoes;

import java.util.Scanner;

public class Excecao1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (y != 0) {
			
			System.out.println(x / y);
		} else { // Qual o problema dessa chegagem?
			System.out.println("Erro: divisão por zero");
		}
		System.out.println("Fim");

	}
	
	
	
}
