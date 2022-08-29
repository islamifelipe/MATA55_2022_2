package helloworld_pk;

public class Arrays {
	
	// Declaração
	public float[] temperaturas; // NAO INICIALIZADA
	// Declaração com inicialização explícita
	public int[] numeros = {1, 1, 2, 3, 5, 8};
	public float[][] matriz = new float[][] {
	{1, 2, 3, 4}, // primeira linha
	{5, 6, 7, 8}, // segunda linha
	{9, 10, 11, 12} // terceira linha
	};
	// Declaração sem inicialização explícita
	// (nesse caso, todos os elementos são
	// inicializados com o valor 0.0)
	public double[] coordenadas = new double[3];
	public int[][] matriz2 = new int[3][4]; // 3 linhas, 4 colunas
}
