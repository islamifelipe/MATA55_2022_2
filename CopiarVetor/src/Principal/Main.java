package Principal;

/*Esta classe experimenta a explicação 
 * apresentada na aula de 05/09/2022 sobre 
 * cópia de vetores primitivos utilizando o operador de =
 * */

public class Main {

	
	public static void printVetor(int [] vetor) {
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
	}
	
	public static void printReferencia(int[] vetor) {
		System.out.println(vetor);
	}
	public static void main(String[] args) {
		int [] vetor_estatico = {5,7,8,9,3};
		int quantidade = 3;
		int [] vetor_dinamico = new int[quantidade];
		
		for (int i=0; i<quantidade; i++) {
			vetor_dinamico[i] = i;
		}
		
		
		System.out.println("Conteúdo e endereço do vetor estático...");
		
		
		printVetor(vetor_estatico);
		printReferencia(vetor_estatico);
		
		System.out.println("Copiando o vetor estático com o operador =...");
		int[] novo_vetor = vetor_estatico;
		printVetor(novo_vetor);
		printReferencia(novo_vetor);
		
		System.out.println("Modificando o vetor estático...");
		novo_vetor[3] = 9238;
		printVetor(vetor_estatico);
		printVetor(novo_vetor);

		
		System.out.println("---------------------------------------------");
		

		System.out.println("Conteúdo e endereço do vetor dinâmico...");
		
		
		printVetor(vetor_dinamico);
		printReferencia(vetor_dinamico);
		
		System.out.println("Copiando o vetor dinâmico com o operador =...");
		novo_vetor = vetor_dinamico;
		printVetor(novo_vetor);
		printReferencia(novo_vetor);
		
		System.out.println("Modificando o vetor dinâmico...");
		novo_vetor[2] = 9238;
		printVetor(vetor_dinamico);
		printVetor(novo_vetor);


		
		
		System.out.println("Ou melhor: -------------------------------------------");
		int [] novo_vetor_dinamico = new int[quantidade];
		

		System.out.println("Copiando o vetor dinâmico com o operador =...");
		novo_vetor_dinamico = vetor_dinamico;
		
		printVetor(vetor_dinamico);
		printReferencia(vetor_dinamico);
		printVetor(novo_vetor_dinamico);
		printReferencia(novo_vetor_dinamico);
		
		
		System.out.println("Cópia correta: -------------------------------------------");
		
		int [] novo_novo_vetor_dinamico = new int[quantidade];
		for (int i=0; i<quantidade; i++) {
			novo_novo_vetor_dinamico[i] = vetor_dinamico[i];
		}
		
		printVetor(vetor_dinamico);
		printReferencia(vetor_dinamico);
		printVetor(novo_novo_vetor_dinamico);
		printReferencia(novo_novo_vetor_dinamico);
		System.out.println("Modificando a cópia correta: -------------------------------------------");
		
		novo_novo_vetor_dinamico[0] = 1093;
		printVetor(vetor_dinamico);
		printVetor(novo_novo_vetor_dinamico);
		
	}

}
