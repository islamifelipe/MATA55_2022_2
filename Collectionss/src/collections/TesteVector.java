package collections;

import java.util.Vector;
import java.util.Collections;
import java.util.Iterator;

public class TesteVector {
	public static void main(String args[]) {

		Vector<Integer> arrayInteiros = new Vector<Integer>();
		
		arrayInteiros.add(64); // index 0
		arrayInteiros.add(22); // index 1
		arrayInteiros.add(1); // index 2
		arrayInteiros.add(51); // index 3
		arrayInteiros.add(51); // index 4
		arrayInteiros.add(3); // index 5
		arrayInteiros.add(2); // index 6

		System.out.println("size = "+arrayInteiros.size());
		
		//Iterator iter1 = arrayInteiros.iterator();
		Iterator<Integer> iterador = arrayInteiros.iterator();
		while(iterador.hasNext()){
		        System.out.print(iterador.next()+", ");
		}
		
		System.out.println();
		
		for (Integer i: arrayInteiros) {
	        System.out.print(i+", ");
			
		}
		
		System.out.println();
		for (int i = 0; i < arrayInteiros.size(); i++) {
		   System.out.print(arrayInteiros.get(i) + ", ");
		}
		
		System.out.println();
		System.out.println(arrayInteiros.get(1));
		
		arrayInteiros.remove(1); // index
		
		
		System.out.println(arrayInteiros);
		
		arrayInteiros.remove(Integer.valueOf(51)); // a primeira ocorrĂȘncia
		
		System.out.println(arrayInteiros);
		
		arrayInteiros.set(0, 298);
		
		System.out.println(arrayInteiros);
		
		Collections.sort(arrayInteiros);  // Sort arrayInteiros

		System.out.println(arrayInteiros);

		
		System.out.println(arrayInteiros.isEmpty());
		
		System.out.println(arrayInteiros.contains(298));
		
		arrayInteiros.clear();
		
		System.out.println("size = "+arrayInteiros.size());
		
		
		
	}


}
