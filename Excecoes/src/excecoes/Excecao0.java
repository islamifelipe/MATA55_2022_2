package excecoes;

import java.util.Scanner;

public class Excecao0 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.print ("Tentando ");
		System.out.print ("dividir ");
		System.out.println ("x / y");
		System.out.println(x / y);
		System.out.println("Fim");

	}

}
