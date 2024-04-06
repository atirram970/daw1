package unidad6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class EjercicioPropuestoColecciones7 {
	static Scanner scan = new Scanner(System.in);
	static Map<String, String> capitalesPaises = new HashMap<String, String>();
	
	
	public static void main(String[] args) {
		//PAISES Y CAPITALES POR DEFECTO
		capitalesPaises.put("España", "Madrid");
		capitalesPaises.put("Portugal", "Lisboa");
		capitalesPaises.put("Francia", "París");
		
		//INTRODUCIR PAIS Y SU CAPITAL
		boolean fin = false;
		do {
			System.out.println("Dame un país y te diré la capital: ");
			String pais = scan.next();
			String capital = buscarPais(pais);
			if(StringUtils.isEmpty(capital)) {
				//SI NO EXISTE CAPITAL --> la guardamos
				System.out.println("No conozco la capital de: " + pais + ", ¿Cuál es su capital?: ");
				capital = scan.next();
				insertarPais(pais, capital);
			} else {
				//SI EXISTE CAPITAL --> la mostramos
				System.out.println("La capital de: " + pais + " es: " + capital);
			}
		} while (!fin);
	}
	
	/**
	 * Devuelve la capital del país que se le pasa por parámetro
	 * Devolverá una cadena vacía si no se encuentra la capital
	 * @param pais
	 * @return
	 */
	
	private static String buscarPais(String pais) {
		String capital = "";
		if(capitalesPaises.containsKey(pais)) {
            capital = capitalesPaises.get(pais);
        }
		return capital;
	}
	
	/**
	 * Guarda un nuevo par pais-capital en el map de capitalesPaises
	 * @param pais
	 * @param capital
	 */
	private static void insertarPais(String pais, String capital) {
		capitalesPaises.put(pais, capital);
	}
}
