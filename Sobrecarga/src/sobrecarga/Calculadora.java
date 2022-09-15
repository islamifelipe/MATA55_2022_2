package sobrecarga;

public class Calculadora {
	
	/* sobrecarga: dois métodos têm a mesma assinatura e diferem:
	 * 		==> na quantidade de parâmtros ou
	 * 		==> nos tipos dos parâmetros ou
	 * 		==> ambos ou
	 * 		==> NAO PODE DIFERIR APENAS NO RETORNO
	*/
	
	
	
	
	public double soma(double a, double b) {
		return a+b;
	}
	public double soma(float a, float b) {
		return a+b;
	}
	
	
	public double soma(float a, float b, float c) {
		return a+b+c;
	}
	
	/*public float soma(float a, float b, float c) {
		return a+b+c;
	}*/
}
