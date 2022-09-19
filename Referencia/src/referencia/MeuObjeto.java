package referencia;

public class MeuObjeto {
	private int a;
	
	public MeuObjeto(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	@Override
	public boolean equals(Object o)
	{
		MeuObjeto mo = (MeuObjeto) o;
		if (this.getA() == mo.getA()) {
			return true;
		}
		return false;
	}
	
}
