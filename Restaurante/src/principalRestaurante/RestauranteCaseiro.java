package principalRestaurante;

public class RestauranteCaseiro {

	private int maximo_mesas;
	private MesaDeRestaurante[] conjunto_mesas; 
	
	//  SOBRESCRITA do construtor padrão
	// esta classe deixa de ter construtor padrão
	public RestauranteCaseiro(int maximo_mesas) {
		this.maximo_mesas = maximo_mesas; // palavra-chave this
		conjunto_mesas = new MesaDeRestaurante[maximo_mesas];
		int contador=0;
		for (int i=0; i<maximo_mesas/3; i++) {
			conjunto_mesas[contador++] = new MesaDeRestaurante();
		}
		for (int i=0; i<maximo_mesas/3; i++) {
			conjunto_mesas[contador++] = new MesaDeRestaurante(10);
		}
		
		int vet[] = {2,3,5,1};
		for (int i=0; i<maximo_mesas/3; i++) {
			
			conjunto_mesas[contador++] = new MesaDeRestaurante(4, vet);
		}
	}
	
	public void printMeuRestaurante() {
		for (int i=0; i<maximo_mesas; i++) {
			System.out.println("Mesa "+(i+1)+": ");
			for (int j=0; j<conjunto_mesas[i].getQuantidadeItens(); j++) {
				System.out.println("Item tipo "+(j+1)+" --> Quantidade: "+conjunto_mesas[i].getPedido(j));
			}
		}
	}
	
	public float calculaValorTotal() {
		// essa variáveis são visíveis para toda a classe? 
		// Elas existem para todo o ciclo de vida da classe? 
		float valorTotal = 0; 
		float precos1[] = {2f,4f,1.4f,13f,16.2f,1f};
		float precos2[] = {1f,4f,2.5f,1.31f,6.2f,1f,49f,21.2f,8f,31f};
		float precos3[] = {3f,6f,3.6f,38.3f};
		
		int contador=0;
		for (int i=0; i<maximo_mesas/3; i++) {
			valorTotal+= conjunto_mesas[contador++].calculaValorMesa(precos1);
		}
		for (int i=0; i<maximo_mesas/3; i++) {
			valorTotal+= conjunto_mesas[contador++].calculaValorMesa(precos2);
		}
		
		
		for (int i=0; i<maximo_mesas/3; i++) {
			valorTotal+= conjunto_mesas[contador++].calculaValorMesa(precos3);
		}
		return valorTotal;
	}
	
	public void adicionaPedido(int indexMesa, int indexPedido, int quantidade) {
		// Vamos confiar que:
		// indexMesa<maximo_mesas?
		// indexPedido é menor que a quantidade de itens para a indexMesa mesa?
		// quantidade>0 ?
		// nas próximas aulas, veremos como tratar isso
		
		conjunto_mesas[indexMesa].adicionaPedidos(indexPedido, quantidade);
	}

}
