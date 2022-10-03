package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TesteLinkedList {

	public static void main(String args[]) {

		LinkedList<Integer> listaligada = new LinkedList<Integer>();
		
		listaligada.add(64); // index 0
		listaligada.add(22); // index 1
		listaligada.add(1); // index 2
		listaligada.add(51); // index 3
		listaligada.add(51); // index 4
		listaligada.add(3); // index 5
		listaligada.add(2); // index 6

		System.out.println("size = "+listaligada.size());
		
		//Iterator iter1 = listaligada.iterator();
		Iterator<Integer> iterador = listaligada.iterator();
		while(iterador.hasNext()){
		        System.out.print(iterador.next()+", ");
		}
		
		System.out.println();
		
		for (Integer i: listaligada) {
	        System.out.print(i+", ");
			
		}
		
		System.out.println();
		for (int i = 0; i < listaligada.size(); i++) {
		   System.out.print(listaligada.get(i) + ", ");
		}
		
		System.out.println();
		System.out.println(listaligada.get(1));
		
		listaligada.remove(1); // index
		
		
		System.out.println(listaligada);
		
		listaligada.remove(Integer.valueOf(51)); // a primeira ocorrência
		
		System.out.println(listaligada);
		
		listaligada.set(0, 298);
		
		System.out.println(listaligada);
		
		Collections.sort(listaligada);  // Sort listaligada

		System.out.println(listaligada);

		
		System.out.println(listaligada.isEmpty());
		
		System.out.println(listaligada.contains(298));
		
		listaligada.clear();
		
		System.out.println("size = "+listaligada.size());
		
		
		
	}

	
	
}
