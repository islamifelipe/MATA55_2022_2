import java.util.Random;

public class SerieLimitada {
	private static final int maximoInstancias = 5;
	private static int contador = 0;
	private long serieLimitada;
	private static Random gerador = new Random();
	
	private SerieLimitada() {
		serieLimitada = gerador.nextInt(99999);
		SerieLimitada.contador++;
		
	}
	
	public static SerieLimitada getInstance() {
		if (SerieLimitada.contador<SerieLimitada.maximoInstancias) {
			SerieLimitada objt = new SerieLimitada();
			System.out.println("Classe " + SerieLimitada.contador +" criada com sucesso!");
			return objt;
		}
		System.out.println("Quantidade máxima de classes atingida!");
		
		return null;
	}

	public static int getMaximoinstancias() {
		return SerieLimitada.maximoInstancias;
	}

	public long getSerieLimitada() {
		return this.serieLimitada;
	}
	
	
}
