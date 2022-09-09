package leitura;

import java.util.Scanner;

public class LituraIntermitente {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int op = 1;
		do {
			System.out.println("1 -- Continuar");
			System.out.println("2 -- Sair");
			System.out.print("Opcao: ");
			
			op = entrada.nextInt();
			
		}while (op==1);
		
		System.out.println("Você saiu");
	}
}
