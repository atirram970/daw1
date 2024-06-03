package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsoIterator {

	public static void main(String[] args) {
		Set<String>	conjuntoString = new HashSet<String>();
		conjuntoString.add("abc");
		conjuntoString.add("hola");
		conjuntoString.add("adios");
		conjuntoString.add("xyz");
				
		System.out.println("Recorremos el bucle con foreach");
		for (String string : conjuntoString) {
			System.out.println(string);
			if(string.equals("xyz")) {
				conjuntoString.remove(string);
			}
		}
		
		System.out.println("Recorremos el bucle con iterator");
		Iterator<String> it = conjuntoString.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
