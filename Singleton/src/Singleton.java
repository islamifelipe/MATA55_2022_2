
public class Singleton {

	private static Singleton instancia;

	private Singleton() { // note o construtor padrão privado
	}

	public static Singleton getInstance() {
		if (instancia == null) 
			instancia = new Singleton();
		return instancia;
	}
}
