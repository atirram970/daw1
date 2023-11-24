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
public class ej5 
{
	public static void main(String[] args)
	{
		int [][] tabla = new int [8][8];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame la posición en la que se encuentra el alfil (Ejemplo: \"d5\"): ");
		String posicionAlfil = scan.nextLine();
		char letra = posicionAlfil.charAt(0);
		char numero = posicionAlfil.charAt(1);
		
		for (char fila = '8'; fila >= '1'; fila--)
		{
			for (char columna = 'a'; columna <='h'; columna++)
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
			System.out.print("\n");
			
		}
		char fila = numero;
		char columna = letra;
		
		//calculo la diagonal arriba-derecha
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h')
		{
			if (fila != numero && columna != letra)
			{
				System.out.println("" + columna + fila);
			}
			columna++;
			fila++;
		}
		
		//calculo la diagonal abajo-derecha
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h')
		{
			if (fila != numero && columna != letra)
			{
				System.out.println("" + columna + fila);
			}
			columna++;
			fila--;
			
		}
		
		//calculo la diagonal arriba-izquierda
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'h' && columna <= 'a')
		{
			if (fila != numero && columna != letra)
			{
				System.out.println("" + columna + fila);
			}
			columna--;
			fila++;
		}
				
		//calculo la diagonal abajo-izquierda
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h')
		{
			if (fila != numero && columna != letra)
			{
				System.out.println("" + columna + fila);
			}
			columna++;
			fila++;
		}
		scan.close();
	}
}
