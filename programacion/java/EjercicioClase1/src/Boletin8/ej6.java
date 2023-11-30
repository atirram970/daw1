/**
 * 
 */
package Boletin8;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej6 
{
	public static void main(String[] args)
	{
		//inicializando variables
		Scanner scan = new Scanner(System.in);
		boolean resultado = false;
		char [][] tabla = new char[3][3];
		
		//primera ejecucion
		for (char fila = 'c'; fila >= 'a'; fila--) 
		{
			System.out.print("" + fila + "\t");
			for (char columna = '1'; columna <= '3'; columna++) 
			{
				System.out.print("-\t");
			}			
			System.out.println("\n");
		}
		System.out.println("\t1\t2\t3");
		
		//ejecucion en bucle hasta ganar, empate o perder
		while (!resultado)
		{
			System.out.println("Dame una posición en la cual vas a seleccionar (por ejemplo \"b2\"):");
			String posicionJugador = scan.nextLine();
			
			char letra = posicionJugador.charAt(0);
			char numero = posicionJugador.charAt(1);
			
			for (char fila = '3'; fila >= '1'; fila--) 
			{
				for (char columna = 'a'; columna <= 'c'; columna++) 
				{
					if (letra == columna && numero == fila) 
					{
						System.out.print("X\t");
					} 
					else 
					{
						System.out.print(columna + "" + fila + "\t");
					}
				}
			}
		}

		if (resultado == true)
		{
			System.out.println("Has ganado");
		}
		else
		{
			System.out.println("Has perdido");
		}
		scan.close();
	}
}
