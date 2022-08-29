package Sansung;
//aula 29/08
public class ClasseQualquer {

	public static void main(String[] args) {
		SamSamXG minhaTV = new SamSamXG();
		minhaTV.ligar(); // métodos públicos
		minhaTV.aumentarVolume();
		//minhaTV.volume++; 
		// o atributo volume é privado na classe SamSamXG. 
	}

}
