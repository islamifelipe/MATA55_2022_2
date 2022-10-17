package animal;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro(Cor.AMARELO);
		Gato gato1 = new Gato();
		Gato gato2 = new Gato(Cor.AZUL);
		
		cachorro1.anda(2);
		gato1.anda(1);
		gato1.mia();
		cachorro1.late();
		//gato1.late();
		
		Animal g = new Gato();
		System.out.println(g instanceof Animal);
		System.out.println(g instanceof Gato);
		System.out.println(g instanceof Cachorro);
		
		g.anda(4); // quando método será executado?
		//g.mia();
		//((Cachorro) g).late();
	}

}
