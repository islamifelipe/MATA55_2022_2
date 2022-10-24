package animal;

public class Main {

	public static void main(String[] args) {
		/*Cachorro cachorro1 = new Cachorro();
		Cachorro cachorro2 = new Cachorro(Cor.AMARELO);
		Gato gato1 = new Gato();
		Gato gato2 = new Gato(Cor.AZUL);
		
		cachorro1.anda(2);
		gato1.anda(1);
		gato1.mia();
		cachorro1.late();
		//gato1.late();
		
		
		System.out.println(g instanceof Animal);
		System.out.println(g instanceof Gato);
		System.out.println(g instanceof Cachorro);*/
		
		
		
		Gato gato1 = new Gato();
		gato1.anda(40); // qual método será executado?
		gato1.dormir();
		gato1.rorona();
		
		System.out.println();
		
		Animal g = new Gato();
		g.anda(4); // qual método será executado?
		g.dormir();
		//g.rorona(); // erro de compilação
		
		Gato gg = (Gato) g; // downcasting: da superclasse para a subclasse
		//gg.rorona();
		
		Animal aa = gato1; // upcasting: da subclasse para a superclasse
		//aa.rorona();
		
		if (g instanceof Cachorro) {
			Cachorro gc = (Cachorro) g ; // ?????????
			System.out.println("Downcasting: de Animal para Cachorro");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Treinador tt = new Treinador();
		tt.treina(g);
		Animal cachorro= new Cachorro();
		tt.treina(cachorro);
		
		
	}

}
