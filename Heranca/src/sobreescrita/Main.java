package sobreescrita;

/*
 * O que acontece se tentarmos sobrescrever 
 * 	método privado ?
 * 	método final ?
 * O que acontece se tentarmos herdar de classe final ?
 * */

public class Main {
	public static void main(String[] args) {
		RecepcionistaImportado p = new RecepcionistaImportado();
		p.cumprimentar("fulano");
		
		Recepcionista pp = new Recepcionista();
		pp.cumprimentar("fulano");
		
	}
}
