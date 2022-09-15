
public class Main {

	public static void main(String[] args) {
		Agenda prova1 = new Agenda("Prova1 de MATA55", MesDoAno.SETEMBRO);
		Agenda prova2 = new Agenda("Prova2 de MATA55", MesDoAno.OUTUBRO);
		Agenda prova3 = new Agenda("Prova3 de MATA55", MesDoAno.DEZEMBRO);
		
		prova1.printAgenda();
		prova2.printAgenda();
		prova3.printAgenda();
	}

}
