package animal;

public class Cachorro extends Animal{
	
	// quais membros da classe Animal são herdados pela classe Cachorro?
	
	public Cachorro() {
		// por padrão, chama o construtor padrão da superclasse 
		super();
		// E se Animal não possuir construtor padrão?
		System.out.println("Construtor padrão de Cachorro");
	}
	
	public Cachorro(Cor cor) {
		super(cor);
		System.out.println("Construtor 1 de Cachorro");
	} 

	public void morde() { 
		System.out.println("morde");
	}
	
	public void late() { 
		System.out.println("late");
	}
	
	public void baba() { 
		System.out.println("baba");
	}
	
	
	public String toString() {
		return "cachorro";
	}
	
	public void testeCor() {
		if (super.getCor()==Cor.AMARELO) {
			//this.cor = Cor.VERMLHO; // cor não é herdada
			
			System.out.println("Cachorro amarelo");
		}
	}
	
	public void mia() {
		System.out.println("mia cachorro");
	}
}
