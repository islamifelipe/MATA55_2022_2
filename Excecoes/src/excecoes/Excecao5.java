package excecoes;

import java.util.Scanner;

public class Excecao5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    System.out.print("Digite a senha: ");
	    int senha = entrada.nextInt();
	    try {
			Senha.login(senha);
		} catch (Exception e) {
			System.out.println("Senha incorreta");
			//e.printStackTrace();
		}
	}


}
