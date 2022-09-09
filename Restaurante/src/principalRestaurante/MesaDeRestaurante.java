package principalRestaurante;


// Note que esta classe não tem método main. Por quê?


public class MesaDeRestaurante {
	private int[] pedidos; // declara uma variável array de inteiros (não inicializada)
	private int quantidadeDeItens; //quantidade de itens que podem ser servidos na mesa (tamanho do vetor pedidos)
	//por que colocar privado?
	
	
	// SOBRESCRITA do construtor padrão
	// o construtor padrão é aquele que não recebe argumentos
	// Chama-se sobrescrita porque o novo construtor tem a mesma assinatura do construtor padrão
	public MesaDeRestaurante() {
		System.out.println("Chamando construtor padrão sobrescrito");
		this.quantidadeDeItens = 6;
		this.pedidos = new int[this.quantidadeDeItens]; // alocação
		for (int i=0;i<this.quantidadeDeItens;i++) { // inicialização
			this.pedidos[i] = 0;
		}
	}
	
	// Sobrecarga de construtores. 
	// Chama-se sobrecarga porque o método tem a mesma assinatura que o construtor padrão, exceto pelos parâmetros recebidos
	public MesaDeRestaurante(int quantidadeDeItens) {
		System.out.println("Chamando construtor com um parâmetro");
		
		this.quantidadeDeItens = quantidadeDeItens;
		pedidos = new int[this.quantidadeDeItens];
		//palavra-chave this
		for (int i=0;i<this.quantidadeDeItens;i++) {
			pedidos[i] = 0;
		}
	}
	
	// Sobrecarga de construtores. 
	public MesaDeRestaurante(int quantidadeDeItens, int[] pedidos) {
		System.out.println("Chamando construtor com dois parâmetros");
		
		this.quantidadeDeItens = quantidadeDeItens;
		this.pedidos = new int[this.quantidadeDeItens];
		for (int i=0;i<this.quantidadeDeItens;i++) {
			this.pedidos[i] = pedidos[i];
		}
	}
	
	public void zeraPedido() {
		for (int i=0; i<this.quantidadeDeItens; i++) {
			this.pedidos[i]=0;
		}
	}
	
	public void adicionaPedidos(int indexPedido, int quantidadePedido) {
		//o que acontece se indexPedido<0 ou indexPedido>this.quantidadeDeItens ?????
		//vamos confiar no usuário ?
		
		pedidos[indexPedido] +=  quantidadePedido;
		
		
		// veremos isso nas aulas futuras... 
		/*try {
			pedidos[indexPedido] +=  quantidadePedido;
		} catch(Exception e) {
			System.out.println("Erro na adição do pedido");
		}*/
	}
	
	public int getPedido(int indexPedido) {
		//novamente, vamos confiar que o usuário vai entrar com  0<=indexPedido<quantidadeDeItens;
		return pedidos[indexPedido];
		
	}
	
	/* métodos getters:
	 * 	É uma assinatura padrão para retornar o valor de um atributo privado.
	 * 	Obviamente, só faz sentido com encapsulamento
	 * 	Qual a vantagem disso?
	 * */
	public int getQuantidadeItens() {
		return quantidadeDeItens;
	}
	
	
	/* métodos setters:
	 * 	É uma assinatura padrão para um método que visa atualizar o valor de um atributo.
	 *	Qual a vantagem disso?
	 * */
	public void setQuantidadePedidos(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
		// novamente a palavra-chave this
	}
	
	//pre-condição: prescos.length = this.quantidadeDeItens
	public float calculaValorMesa(float[] precos) {
		float valor_mesa=0.0f;
		for (int i=0; i<this.quantidadeDeItens; i++) {
			valor_mesa += pedidos[i]*precos[i];
		}
		return valor_mesa;
	}
}
