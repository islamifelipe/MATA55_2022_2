
public class Agenda {
	private String compromisso;
	private MesDoAno mes;
	public String getCompromisso() {
		return compromisso;
	}
	public void setCompromisso(String compromisso) {
		this.compromisso = compromisso;
	}
	public MesDoAno getMes() {
		return mes;
	}
	public void setMes(MesDoAno mes) {
		this.mes = mes;
	}
	public Agenda(String compromisso, MesDoAno mes) {
		this.compromisso = compromisso;
		this.mes = mes;
	}
	
	public void printAgenda() {
		System.out.println(compromisso + " agendado para o mês de "+mes.getDescricao());
	}
}
