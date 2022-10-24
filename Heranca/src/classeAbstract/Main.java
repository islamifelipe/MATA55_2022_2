package classeAbstract;

public class Main {
	public static void main(String[] args) {
	//	Animal aa = new Animal();
		Animal cao = new Cachorro();
		Animal gato = new Gato();
		cao.treinar();
		gato.treinar();

		//Animal aa = new Mamifero();
		//Animal mamConc = new MamiferoConcreto();
		//mamConc.fazerBarulho();
	}
}
