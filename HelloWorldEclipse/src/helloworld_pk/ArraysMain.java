package helloworld_pk;

public class ArraysMain {
	
	// Ver perguntas abaixo
	public static void main(String[] args) {
		Arrays meusArrays = new Arrays();
		
		System.out.println("Tamanho de meusArrays.numeros = "+meusArrays.numeros.length);
		meusArrays.numeros[0] = 92;
		System.out.print("Imprimindo array unidimensional: ");
		for (int i=0; i<meusArrays.numeros.length; i++) {
			System.out.print(meusArrays.numeros[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Linhas de meusArrays.matriz  = "+meusArrays.matriz.length);
		System.out.println("Colunas de meusArrays.matriz  = "+meusArrays.matriz[0].length);
		
		System.out.println("Imprimindo array bidimensional");
		for (int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(meusArrays.matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("Imprimindo array coordenadas: ");
		for (int i=0; i<3; i++) {
			System.out.print(meusArrays.coordenadas[i]+" ");
		}
		System.out.println();
	}
	
	/* ======== PERGUNTAS: ======== 
	 * 1 - O que acontece se eu invocar o vetor temperaturas?
	 * 2 - O que acontece se eu indexar numeros[6]?
	 * 3 - O que acontece se eu invocar coordenadas[0] 
	 * 4 - */
	
}
