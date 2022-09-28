package retangulo;

public class Retangulo {
	private double largura;
	private double altura;
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	public Retangulo(Retangulo r) {
		this.largura = r.getLargura();
		this.altura = r.getAltura();
	}
	
	public double area() {
		return altura*largura;
	}
	
	
}
