package lampada;

public class Lampada {
	private int estado;
	
	public Lampada() {
		this.estado = 0;
	}
	public Lampada(int estado) {
		this.estado = estado;
	}
	
	public void mostraEstado() {
		if (this.estado == 0) {
			System.out.println("Lâmpada desligada");
		} else if (this.estado == 100) {
			System.out.println("Lâmpada ligada");
		} else {
			System.out.println("Lâmpada ligada. Intensidade: "+this.estado);
		}
	}
	
	// qual a diferênça semântica entre esse método e o mostraEstado()?
	public int getEstado() {
		return this.estado;
	}
	
	public void acende () {
		this.estado = 100;
	}
	
	public void apaga() {
		this.estado = 0;
	}
	
	public void ajustar(int ajuste) { // equivalente ao setter
		if (ajuste>=0 && ajuste<=100) {
			this.estado = ajuste;
		} else {
			System.out.println("ERRO: Ajuste fora dos valores permitos");
			// nas próximas aulas, veremos uma técnica mais apropriada para tratar erros em java
		}
	}
}
