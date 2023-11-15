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
public class ejercicio5Array 
{
	public static void main(String[] args) 
	{
		//programa pida 10 numeros y muestre numeros introducidos --> imprimir minimo y maximo valor junto a esos valores
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i <= 9; i++) 
		{
			boolean correcto = false;
			
			while (!correcto)
			{
				try 
				{
					System.out.printf("Introduce un numero entero: , quedan %d números por introducir\n", 10-i);
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
		int indMax = indiceMaximo(numeros);
		int indMin = indiceMinimo(numeros);
		
		for (int index = 0; index < numeros.length; index++) 
		{
			if (indMax == indMin)
			{
				System.out.println(numeros[index] + "Maximo y Minimo");
			}
			else
			{
				if (index == indMax)
				{
					System.out.println(numeros[index] + "\tMaximo");
				}
				else if (index == indMin) 
				{
					System.out.println(numeros[index] + "\tMinimo");
				}
				else
				{
					System.out.println(numeros[index]);	
				}
			}
		}
	}
	
	private static int indiceMaximo(int[] array)
	{
		int indiceMax = Integer.MIN_VALUE;
		for (int i = 0; i < 10; i++) 
		{
			if (array[i] > indiceMax)
			{
				indiceMax = i;
			}
		}
		return indiceMax;
	}
	
	private static int indiceMinimo(int[] array)
	{
		int indiceMin = Integer.MAX_VALUE;
		for (int i = 0; i < 10; i++) 
		{
			if (array[i] < indiceMin)
			{
				indiceMin = i;
			}
		}
		return indiceMin;
	}
}
