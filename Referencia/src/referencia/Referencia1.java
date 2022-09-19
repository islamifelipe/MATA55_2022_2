package referencia;

//1

public class Referencia1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = a;
		b[0] = 9;
		System.out.println(a[0]);
		// Qual é o valor de a[0]?
		
		System.out.println(a);
	}
}
