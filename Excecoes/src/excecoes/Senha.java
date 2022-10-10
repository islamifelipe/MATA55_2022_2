package excecoes;

public class Senha {
	private static final int PASSWORD = 123456;

	public static void login(int senha) throws Exception {
		
		if (senha==PASSWORD) {
			System.out.println("Login realizado com sucesso");
		} else {
			throw new Exception();
			// java.lang.Exception
			// poderia lançar qualquer exceção que se desejasse
		}
	}
}
