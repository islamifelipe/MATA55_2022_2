package animal;

public class Gato extends Animal{
	
	public Gato() {
		//super();
		System.out.println("Construtor padrão de gato");
	}
	
	
	public Gato(Cor cor) {
		super(cor);
		System.out.println("Construtor 1 de gato");
	} 
	
	public void mia() { 
		System.out.println("mia");
	}
	
	public void rorona() { 
		System.out.println("rorona");
	}
	
	@Override
	public void anda(int direcao) {
		System.out.println("GATO anda "+direcao+" metros (sobrescrita)");
	}
	
	//@Override
	//public void andar(int direcao) {
	//	System.out.println("GATO anda "+direcao+" metros (sobrecarga)");
	//}
	
	

}
