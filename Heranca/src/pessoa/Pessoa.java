package pessoa;

public class Pessoa { //extends Object
	
	private String nome;
	private int idade;
	private String rg;
	private String cpf;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}

	public static void main(String[] args) {
	 Pessoa fulana = new Pessoa("Fulana de Tal");
	 System.out.println("Oi, " + fulana);
	
	 System.out.println(fulana.getClass());
		
	}
}

/*
 * equals(objeto) - determina se o objeto atual é igual 
 * ao objeto passado como parâmetro 
 * (de acordo com algum critério de igualidade)

	toString() - retorna a representação textual do objeto. Chamado
implicitamente sempre que o objeto é convertido para String (o que
acontece, por exemplo, ao concatenar uma string com o objeto)

getClass() - retorna a classe à qual o objeto pertence

finalize() - chamado quando o garbage collector destrói o objeto

 */

