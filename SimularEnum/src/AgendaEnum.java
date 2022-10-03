
public class AgendaEnum {
	private String compromisso;
	private MesDoAnoEnum mes;
	public String getCompromisso() {
		return compromisso;
	}
	public void setCompromisso(String compromisso) {
		this.compromisso = compromisso;
	}
	public MesDoAnoEnum getMes() {
		return mes;
	}
	public void setMes(MesDoAnoEnum mes) {
		this.mes = mes;
	}
	public AgendaEnum(String compromisso, MesDoAnoEnum mes) {
		this.compromisso = compromisso;
		this.mes = mes;
	}
	
	public void printAgenda() {
		System.out.println(compromisso + " agendado para o mês de "+mes);
	}
}
