/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejercicio1Array 
{
	public static void main(String[] args) 
	{
		//Escribe un programa lea 10 numeros y luego los muestre en orden inverso --> el primero es el último
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 9; i >= 0; i--) 
		{
			boolean correcto = false;
			
			while (!correcto)
			{
				try 
				{
					System.out.printf("Introduce un numero entero: , quedan %d números por introducir\n", i+1);
					numeros[i] = scan.nextInt();
					correcto = true;
				} 
				catch (InputMismatchException e) 
				{
					System.out.println("Has introducido un número no valido... intentalo de nuevo");
					scan.next();
				}
			}
		}
		scan.close();
		
		for (int i : numeros) 
		{
			System.out.println(i);
		}
	}
}
