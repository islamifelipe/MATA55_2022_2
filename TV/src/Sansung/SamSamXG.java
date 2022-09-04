package Sansung;

class SamSamXG {
	private boolean ligada; // private: visibilidade apenas dentro da classe
	private int volume;
	private int canal;

	//public: visibilidade no escopo de todas as classes.
	public void aumentarVolume() {
		if (volume < 100) {
			volume++;
		}
	}

	public void diminuirVolume() {
		if (volume > 0) {
			volume--;
		}
	}

	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}

	public SamSamXG(int volume_p) {
		volume=volume_p;
	}
	
	public SamSamXG() {
		volume=100;
	}
	
	public static void main(String[] args) {
		SamSamXG tvDaSala = new SamSamXG();
		SamSamXG tvDoQuarto = new SamSamXG(55);
		tvDaSala.ligar();
		tvDoQuarto.ligar();
		tvDaSala.aumentarVolume();
		tvDoQuarto.diminuirVolume();
		tvDaSala.volume++;
		tvDoQuarto.desligar();
		//System.out.print(tvDaSala==tvDoQuarto);
	}

}
