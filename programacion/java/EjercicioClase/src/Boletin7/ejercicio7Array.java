/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejercicio7Array 
{
	public static void main(String[] args) 
	{
		//Realiza un programa que pida 8 números enteros y que luego muestre esos
		//números junto con la palabra “par” o “impar” según proceda
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[8];
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.println("Dame numeros :");
			int num = scan.nextInt();
			numeros[i] = num;
		}
		
		for (int i = 0; i < numeros.length; i++) 
		{
            if (numeros[i] % 2 == 0) 
            {
                System.out.println(numeros[i] + " Par");
            } 
            else 
            {
                System.out.println(numeros[i] + " Impar");
            }
        }
		scan.close();
	}
}
