/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio ultima cifra
		Scanner scannerNUM=new Scanner(System.in);
		System.out.println("Introduce  el número: ");
		String num=scannerNUM.next();
		int longitud = num.length();
		
		if (longitud<=5) 
		{
			char primerCaracter = num.charAt(0);
			System.out.println("El primer número de: "+num+" es: "+primerCaracter);
		}
		else
		{
			System.out.println("No se permiten numeros de más de 5 cifras");
		}
		scannerNUM.close();
	}

}
