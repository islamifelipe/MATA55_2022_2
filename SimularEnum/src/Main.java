
public class Main {

	public static void main(String[] args) {
		AgendaEnum prova1 = new AgendaEnum("Prova1 de MATA55", MesDoAnoEnum.SETEMBRO);
		AgendaEnum prova2 = new AgendaEnum("Prova2 de MATA55", MesDoAnoEnum.OUTUBRO);
		AgendaEnum prova3 = new AgendaEnum("Prova3 de MATA55", MesDoAnoEnum.DEZEMBRO);
		
		prova1.printAgenda();
		prova2.printAgenda();
		prova3.printAgenda();
	}

}
