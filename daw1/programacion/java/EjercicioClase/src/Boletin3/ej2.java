/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calcular ecuacion primer grado
		
		//pido a
		Scanner scannerA=new Scanner(System.in);
		System.out.println("Introduce a: ");
		double a=scannerA.nextDouble();
		
		//pido b
		Scanner scannerB=new Scanner(System.in);
		System.out.println("Introduce b: ");
		double b=scannerB.nextDouble();
		
		//calcular ecuacion
		
		
		double x=-b/a;
		
		if (a !=0 && b  !=0) 
		{
			System.out.println("El resultado de la ecucación es: " + x);
		}
		else
		{
		System.out.println("Esta ecuacion no tiene solución");
		}
		scannerA.close();
		scannerB.close();
	}

}