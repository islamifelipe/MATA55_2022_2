package lampada;

public class Main {

	public static void main(String[] args) {
		Lampada minhaLampada = new Lampada(); // lampada padrao
		
		minhaLampada.acende();
		minhaLampada.mostraEstado();
		minhaLampada.apaga();
		minhaLampada.mostraEstado();
		minhaLampada.ajustar(-1);
		minhaLampada.ajustar(80);
		minhaLampada.mostraEstado();

	}

}
