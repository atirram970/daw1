/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;

/**
 * 
 */
public class arraysVacios 
{
	public static void main(String[] args) 
	{
		//Array int
		int[] arrayEnteros = new int[6];
		arrayEnteros[0] = 1;
		arrayEnteros[1] = 10;
		arrayEnteros[2] = 99;
		arrayEnteros[5] = 7;
		
		System.out.println("Array de Enteros");
		//recorrer cada posición
		for (int i : arrayEnteros) 
		{
			System.out.println(i);
		}
		
		//Array Caracteres
		System.out.println("Array de Caracteres");
		char[] arrayCharacter = new char[4];
		arrayCharacter[0] = 'i';
		arrayCharacter[1] = '0';
		arrayCharacter[3] = 'A';
		
		System.out.println("Array de Character");
		//recorrer cada posición
		for (int i : arrayCharacter) 
		{
			System.out.println(i);
		}
	}
}
