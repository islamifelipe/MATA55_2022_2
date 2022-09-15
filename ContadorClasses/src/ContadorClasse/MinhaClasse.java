package ContadorClasse;

public class MinhaClasse {
	private static int contador = 0;
	// observe que, como contador é membro de classe, e não de objeto, 
	// é totalmente possível inicializá-lo aqui
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

	public static void setContador(int contador) {
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
