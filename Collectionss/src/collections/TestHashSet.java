package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;

public class TestHashSet {
	public static void main(String args[]) {

		HashSet<Integer> conjunto = new HashSet<Integer>();
		
		conjunto.add(64); 
		conjunto.add(22); 
		conjunto.add(1); 
		conjunto.add(51); 
		conjunto.add(51); //////
		conjunto.add(3); 
		conjunto.add(2); 

		System.out.println("size = "+conjunto.size());
		
		//Iterator iter1 = conjunto.iterator();
		Iterator<Integer> iterador = conjunto.iterator();
		while(iterador.hasNext()){
		        System.out.print(iterador.next()+", ");
		}
		
		System.out.println();
		
		for (Integer i: conjunto) {
	        System.out.print(i+", ");
			
		}
		
		System.out.println();
		
		//System.out.println(conjunto.get(1));
		
		System.out.println(conjunto);
		
		conjunto.remove(Integer.valueOf(51)); 
		
		System.out.println(conjunto);
		
		
		System.out.println(conjunto.isEmpty());
		
		System.out.println(conjunto.contains(298));
		
		conjunto.clear();
		
		System.out.println("size = "+conjunto.size());
		
		
		
	}

	
	
}
