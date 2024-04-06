package unidad6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

public class EjercicioPropuestoColecciones {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//obtenerNombres();
		Set<String> nombres1 = obtenerNombres();
		Set<String> nombres2 = obtenerNombres();
		//Los elementos que sean comunes a nombres1 y nombres2
		Set<String> nombres3 = obtenerNombresComunes(nombres1, nombres2);
		
		for (String nombre : nombres3) {
			System.out.println(nombre);
		}
	}

	/** Solicita  que se introduzca el nombre de personas y las almacenando en un HashSet
	 * hasta que pulse la palabra "fin"
	 * Después de esto el método devolvera el HashSet
	 */
	
	public static Set<String> obtenerNombres(){
		Set<String> nombres = new HashSet<String>();
		final String FIN = "fin";
		boolean fin = false;
		
		while (!fin) {
			String nombre = scan.nextLine();
			if (!StringUtils.equals(FIN, nombre)) {
				nombres.add(nombre);
			} else {
				fin = true;
			}
		}
		return nombres;
	}
	
	public static Set<String> obtenerNombresOrdenados(){
		Set<String> nombres = new TreeSet<String>();
		final String FIN = "fin";
		boolean fin = false;
		
		while (!fin) {
			String nombre = scan.nextLine();
			if (!StringUtils.equals(FIN, nombre)) {
				nombres.add(nombre);
			} else {
				fin = true;
			}
		}
		return nombres;
	}
	
	public static Set<String> obtenerNombresPorInsercion(){
		Set<String> nombres = new LinkedHashSet<String>();
		final String FIN = "fin";
		boolean fin = false;
		
		while (!fin) {
			String nombre = scan.nextLine();
			if (!StringUtils.equals(FIN, nombre)) {
				nombres.add(nombre);
			} else {
				fin = true;
			}
		}
		return nombres;
	}
	
	public static Set<String> obtenerNombresComunes(Set<String> nombres1, Set<String> nombres2) {
        Set<String> result = new HashSet<String>();
		if (nombres1.size() >= nombres2.size()) {
        	for (String nombre : nombres2) {
				if (nombres1.contains(nombres2)) {
					result.add(nombre);
				}
			}
        }else {
        	Iterator<String> iter = nombres1.iterator();
        	while (iter.hasNext()){
        		String nombre = iter.next();
        		if(nombres2.contains(nombre)) {
        			result.add(nombre);
        		}
        	}
        }
		return result;
    }
	
	public static Set<String> obtenerNombresNoComunes(Set<String> nombres1, Set<String> nombres2) {
        Set<String> result = new HashSet<String>();
		if (nombres1.size() >= nombres2.size()) {
        	for (String nombre : nombres2) {
				if (nombres1.contains(nombres2)) {
					result.add(nombre);
				}
			}
        }else {
        	Iterator<String> iter = nombres1.iterator();
        	while (iter.hasNext()){
        		String nombre = iter.next();
        		if(!nombres2.contains(nombre)) {
        			result.add(nombre);
        		}
        	}
        }
		return result;
    }
}