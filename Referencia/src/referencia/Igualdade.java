package referencia;

//3
public class Igualdade {
	public static void main (String[] args) {
		int x = 8;
		int y = x;
		System.out.println(y == x);
		
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		System.out.println(a == b);
		
		int[] c = b;
		System.out.println(c == b);
		
		
	}
}
