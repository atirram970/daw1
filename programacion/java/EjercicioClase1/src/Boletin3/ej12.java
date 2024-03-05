/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio ultima cifra
		Scanner scannerNUM=new Scanner(System.in);
		System.out.println("Introduce  el número: ");
		int num=scannerNUM.nextInt();
		String numero=Integer.toString(num);
		int longitud = numero.length();
		if (longitud<=5) 
		{
			if (num<0)
			{
				longitud=longitud-1;
				System.out.println("El número negativo "+num+" tiene: "+longitud+ " Dígitos");
			}
			else
			{
				System.out.println("El número positivo "+num+" tiene: "+longitud+ " Dígitos");
			}	
		}
		else
		{
			System.out.println("No se permiten numeros de más de 5 cifras");
		}
		scannerNUM.close();
	}

}
