package principalRestaurante;

public class Main {

	public static void main(String[] args) {
		RestauranteCaseiro meuRestaurante = new RestauranteCaseiro(9); // maximo_mesas = 8
		meuRestaurante.printMeuRestaurante();
		
		float valor = meuRestaurante.calculaValorTotal();
		System.out.println("Valor: "+valor);
		
		System.out.print("\n ***** Adicionando itens  **** \n");
	
		meuRestaurante.adicionaPedido(0, 2, 34);
		meuRestaurante.adicionaPedido(2, 1, 3);
		meuRestaurante.adicionaPedido(0, 4, 9);
		meuRestaurante.adicionaPedido(3, 1, 9);
		
		meuRestaurante.printMeuRestaurante();
		
		valor = meuRestaurante.calculaValorTotal();
		System.out.println("Valor: "+valor);
		
	}

}
