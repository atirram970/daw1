/**
 * 
 */
package Boletin5;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class numerosprimos {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//decir si es numero primo
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame el numero: ");
		int num = scan.nextInt();
		scan.close();
		
		boolean esPrimo = true;
		int contador=2;
		
		while (contador < num/2+1 && esPrimo) 
		{	
			if (num%contador == 0) 
			{
				esPrimo = false;
			}
			
			contador++;
		}
		
		if (esPrimo) 
		{
			System.out.printf("El número %d es primo.\n", num);
		}
		else
		{
			System.out.printf("El número %d no es primo.\n", num);
		}
	}
	
}
