
public class MesDoAno {
	public static final MesDoAno JANEIRO = new MesDoAno("Janeiro"); 
	public static final MesDoAno FEVEREIRO = new MesDoAno("Fevereiro"); 
	public static final MesDoAno MARCO = new MesDoAno("Março"); 
	public static final MesDoAno ABRIL = new MesDoAno("Abril"); 
	public static final MesDoAno MAIO = new MesDoAno("Maio"); 
	public static final MesDoAno JUNHO = new MesDoAno("Junho"); 
	public static final MesDoAno JULHO = new MesDoAno("Julho"); 
	public static final MesDoAno AGOSTO = new MesDoAno("Agosto"); 
	public static final MesDoAno SETEMBRO = new MesDoAno("Setembro"); 
	public static final MesDoAno OUTUBRO = new MesDoAno("Outubro"); 
	public static final MesDoAno NOVEMBRO = new MesDoAno("Novembro"); 
	public static final MesDoAno DEZEMBRO = new MesDoAno("Dezembro"); 
	
	private String descricao;
	
	private MesDoAno(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}
	
	
}
