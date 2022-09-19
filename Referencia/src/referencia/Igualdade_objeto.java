package referencia;

//4

public class Igualdade_objeto {

	public static void main(String[] args) {
		MeuObjeto a0 = null; // CUIDADO
		//a0.setA(0); // ERRO
		MeuObjeto a1 = new MeuObjeto(1);
		MeuObjeto a2 = new MeuObjeto(1);
		
		System.out.println(a1 == a2);
		//System.out.println(a1.equals(a2));
		
		
		MeuObjeto a3 = a1;
		System.out.println(a1 == a3);
		//System.out.println(a1.equals(a3));
		
		
		
		modificaObjeto(a1);
		System.out.println(a1.getA());
		System.out.println(a2.getA());
		System.out.println(a3.getA());
		
		
		
	}
	
	public static void modificaObjeto(MeuObjeto a) {
		a.setA(2039);
	}

}
