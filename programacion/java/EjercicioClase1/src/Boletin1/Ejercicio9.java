/**
 * 
 */
package Boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Solución A. variables internas
		double IVA=1.21;
		double totSinIVA=200;
		double total=totSinIVA*IVA;
		System.out.println("El total sin IVA es: "+totSinIVA+" y con un 21% de IVA es: "+total);
		
		//Solución B. 
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el número de euros € del total: ");
		double sinIVA=scanner.nextDouble();
		//double IVA=1.21;
		double resultado=sinIVA*IVA;
		System.out.println("El total sin IVA es: "+sinIVA+" y con un 21% de IVA es: "+resultado);
		scanner.close();
	}

}
