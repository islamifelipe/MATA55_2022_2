package classeAbstract;

public class Cachorro extends Animal {
	
	// A classe filha é obrigada a implementar os métodos abstrados da classe mãe
	@Override
	public void fazerBarulho() {
		System.out.println("Au-au!");
	}
}
