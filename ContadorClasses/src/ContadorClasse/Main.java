package ContadorClasse;

public class Main {

	public static void main(String[] args) {
		MinhaClasse instancia1 = new MinhaClasse(1);
		System.out.println(MinhaClasse.getContador());
		MinhaClasse instancia2 = new MinhaClasse(2);
		System.out.println(MinhaClasse.getContador());
		MinhaClasse instancia3 = new MinhaClasse(3);
		System.out.println(MinhaClasse.getContador());
		MinhaClasse instancia4 = new MinhaClasse(4);
		System.out.println(MinhaClasse.getContador());
		MinhaClasse instancia5 = new MinhaClasse(5);
		System.out.println(MinhaClasse.getContador());
		
		System.out.println("instancia1.getContador() = "+instancia1.getContador());
		System.out.println("instancia2.getContador() = "+instancia2.getContador());
		System.out.println("instancia3.getContador() = "+instancia3.getContador());
		System.out.println("instancia4.getContador() = "+instancia4.getContador());
		System.out.println("instancia5.getContador() = "+instancia5.getContador());
		
		
		System.out.println("instancia1.getOutroAtributo() = "+instancia1.getOutroAtributo());
		System.out.println("instancia2.getOutroAtributo() = "+instancia2.getOutroAtributo());
		System.out.println("instancia3.getOutroAtributo() = "+instancia3.getOutroAtributo());
		System.out.println("instancia4.getOutroAtributo() = "+instancia4.getOutroAtributo());
		System.out.println("instancia5.getOutroAtributo() = "+instancia5.getOutroAtributo());
		
	}

}
