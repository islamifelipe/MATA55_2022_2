package leitura;

import java.util.*; // importação da biblioteca util, onde se encontra a classe Scanner


public class LerTeclado {
	public static void main(String[] args) {
		// objeto de tipo Scanner (da biblioteca 
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		System.out.print(a+b);
	}
}
