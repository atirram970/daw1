/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio ultima cifra
		Scanner scannerNUM=new Scanner(System.in);
		System.out.println("Introduce  el número: ");
		String num=scannerNUM.next();
		
		int longitud = num.length();
		char ultimoCaracter = num.charAt(longitud - 1);
		
		System.out.println("El último número de: "+num+" es: "+ultimoCaracter);
		scannerNUM.close();
	}

}
