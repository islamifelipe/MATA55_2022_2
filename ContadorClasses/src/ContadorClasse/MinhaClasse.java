package ContadorClasse;

public class MinhaClasse {
	private static int contador = 0;
	private int outroAtributo;
	
	public MinhaClasse(int outroAtributo) {
		MinhaClasse.contador++;
		this.outroAtributo = outroAtributo;
	}

	public static int getContador() {
		return MinhaClasse.contador;
		// return this.contador = contador; 
		// Por que não pode usar o this no contexto estático?
			
	}

	public static void zeraContador(int contador) {
		MinhaClasse.contador = contador;
		//this.contador = contador; 
		// Por que não pode usar o this no contexto estático?
	}

	public int getOutroAtributo() {
		return this.outroAtributo;
	}

	public void setOutroAtributo(int outroAtributo) {
		this.outroAtributo = outroAtributo;
	}
	
	
	
	
}
