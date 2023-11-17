/**
 * 
 */
package Boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class ejercicio4Arrays2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[15];
		
		int primerNum = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) 
		{
			System.out.printf("Introduce un numero entero: , quedan %d números por introducir\n", 15-i);
			numeros[i] = scan.nextInt();
			try 
			{
				numeros[numeros.length -i -1] = numeros[numeros.length - i -2];
			} 
			catch (ArrayIndexOutOfBoundsException e) 
			{
				
			}
			
		}
		scan.close();
		numeros[1] = primerNum;
		
		for (int i : numeros) 
		{
			System.out.println(numeros[i]);
		}
	}
	
}
