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
public class ejercicio3Array 
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
		//int indMax = indiceMaximo(numeros);
		//int indMin = indiceMinimo(numeros);
		
		int[] minMax = getMinMax(numeros);
	 	
		for (int index = 0; index < numeros.length; index++) 
		{
			if (numeros[index] == minMax[1])
			{
				System.out.println(numeros[index] + "Maximo y Minimo");
			}
			else
			{
				if (numeros[index] == minMax[1])
				{
					System.out.println(numeros[index] + "\tMaximo");
				}
				if (numeros[index] == minMax[0]) 
				{
					System.out.println(numeros[index] + "\tMinimo");
				}
				if (numeros[index] != minMax[0] && numeros[index] != minMax[1] )
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
	
	private static int[] getMinMax(int[] array)
	{
		int[] minMax = new int[2];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < min)
			{
				min = array[i];
				minMax[0] = min;
			}
			if (array[i] > max)
			{
				max = array[i];
				minMax[1] = max;
			}
		}
		return minMax;
	}
}
