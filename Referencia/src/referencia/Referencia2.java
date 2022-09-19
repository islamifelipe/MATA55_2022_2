package referencia;

//2

public class Referencia2 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		printVetor(a);
		modificavetor(a);
		printVetor(a);
		
		int bb = 2;
		System.out.println(bb);
		modificaVariavel(bb);
		System.out.println(bb);
		
		printVetor(a);
		modificaVariavel(a[0]);
		printVetor(a);
		
	}
	
	public static void printVetor(int [] vetor) {
		for (int i=0; i<vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
		System.out.println();
	}
	public static void modificavetor(int [] meuVetor) {
		meuVetor[0] = 239;
	}
	
	public static void modificaVariavel(int bb) {
		bb = 999;
	}

}
