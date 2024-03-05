/**
 * 
 */
package Boletin8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej6Mio 
{
	public static void main(String[] args)
	{
		//inicializando variables
		Scanner scan = new Scanner(System.in);
		boolean resultado = false;
		char[][] tabla = new char[3][3];
		
		char [] arrayFilas = new char[3];
		char [] arrayColumnas = new char[3];
		int indexArraysSolucion = 0;
		
		//primera ejecucion
		for (char fila = 'c'; fila >= 'a'; fila--) 
		{
			//System.out.print("" + fila+ "\t");
			for (char columna = '0'; columna <= '2'; columna++) 
			{
				tabla[fila][columna] = '-';
			}		
			//System.out.println("\n");
		}
		//System.out.println("\t1\t2\t3");
		
		//ejecucion en bucle hasta ganar, empate o perder
		do
		{
			
			System.out.println("Dame una posición en la cual vas a seleccionar (por ejemplo \"b2\"):");
			String posicionJugador = scan.nextLine();
			
			char letra = posicionJugador.charAt(0);
			char numero = posicionJugador.charAt(1);
			
			
			
			//guardar posicion Jugador
			for (char fila = 'c'; fila >= 'a'; fila--) 
			{
				for (char columna = '1'; columna <= '3'; columna++) 
				{
					if (letra == columna && numero == fila) 
					{
						arrayColumnas[indexArraysSolucion] = columna;
						arrayFilas[indexArraysSolucion] = fila;
						indexArraysSolucion++;
						tabla[fila][columna] = 'X';
					} 
				}		
			}
			
			//
			letra = (char) (Math.floor(Math.random() * (3 - 0 + 1)) + 0);
			numero = (char) (Math.floor(Math.random() * (3 - 0 + 1)) + 0);
			//guardar posicion robot
			for (char fila = 'c'; fila >= 'a'; fila--) 
			{
				for (char columna = '1'; columna <= '3'; columna++) 
				{
					if (letra == columna && numero == fila) 
					{
						arrayColumnas[indexArraysSolucion] = columna;
						arrayFilas[indexArraysSolucion] = fila;
						indexArraysSolucion++;
						tabla[fila][columna] = 'O';
					} 
				}		
			}
			
			//mostrar array
			for (char filaMostrar = 'c'; filaMostrar >= 'a'; filaMostrar--) 
			{
				System.out.print("" + filaMostrar + "\t");
				for (char columnaMostrar = '1'; columnaMostrar <= '3'; columnaMostrar++) 
				{
					System.out.println(tabla[filaMostrar][columnaMostrar]);
				}		
				System.out.println("\n");
			}
			System.out.println("\t1\t2\t3");

		}
		while (!resultado);
		
		//resultado partida
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
