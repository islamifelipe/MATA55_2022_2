package excecoes;

public class Excecao4 {

	public static void main(String[] args) {
		try {
			int v[] = {1,2,3,4};
			System.out.println(v[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indexação fora dos limites do array");
		}
		
		try {
			int v1 [] = null;
			System.out.println(v1[5]);
		} catch(NullPointerException e) {
			System.out.println("Acesso a um ponteiro nulo");
			
		}
	}

}
