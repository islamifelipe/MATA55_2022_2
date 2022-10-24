package animal;

public class Animal extends Object{
	private Cor cor; // não é visível fora da classe nem pelas classes filhas
	//protected Cor cor; // não é visível fora da classe, mas é visível pelas classes filhas (MESMO FORA DO PACOTE).
	
	
	public Animal() {
		cor = Cor.AMARELO;
		System.out.println("Construtor padrão de Animal");
	}
	
	
	public Animal(Cor cor) {
		this.cor = cor;
		System.out.println("Construtor 1 de Animal");
		
	}
	
	public void setCor(Cor cor) { 
		this.cor = cor;
	}
	public Cor getCor() { 
		return cor;
	}
	public void anda(int direcao) {
		System.out.println("anda "+direcao+" metros");
	}
	
	public void dormir() {
		System.out.println("Animal dormindo");
	}
	
	
}
