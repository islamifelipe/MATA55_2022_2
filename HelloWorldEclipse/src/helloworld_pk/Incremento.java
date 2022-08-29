package helloworld_pk;

public class Incremento {
	static int x = 5;
	static int y = x++;
	static int z = ++x;
	static int w1 = 1;
	static int w2 = 1;
	public static void main(String[] args) {
		
		System.out.println(x+" "+y+" "+z);
		System.out.println("w1++ = "+(w1++));
		System.out.println("++w2 = "+(++w2));
	}
}
