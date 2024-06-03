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
	// Ejercicio 5 Desarrolla un programa que, al proporcionarle una posición en un
	// tablero de ajedrez, determine las casillas a las cuales un alfil ubicado en
	// esa posición podría saltar. Conforme a la ilustración adjunta, se destaca que
	// el alfil se desplaza exclusivamente en diagonal. El tablero consta de 64
	// casillas, siendo las columnas designadas por las letras de la "a" a la "h" y
	// las filas numeradas del 1 al 8.
	// Ejemplo: Introduzca la posición del alfil: d5 El álfil puede moverse a las
	// siguientes posiciones:h1 a2 g2 b3 f3 c4 e4 c6 e6 b7 f7 a8 g8
	public static void main(String[] args) 
	{
		System.out.println("Introduce la posición del alfil, con el formato LETRANUMERO. Ejemplo: \"d5\"");
		Scanner scan = new Scanner(System.in);
		String posicionAlfil = scan.nextLine();
		scan.close();
		char letra = posicionAlfil.charAt(0);
		char numero = posicionAlfil.charAt(1);
		//se pinta el tablero marcando el alfil con x
		for (char fila = '8'; fila >= '1'; fila--) 
		{
			for (char columna = 'a'; columna <= 'h'; columna++) 
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

		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		
		/*
		 * OPCIÓN 1 -> guardar los movimientos en string
		 * ""+FILA+COLUMNA
		 * 
		 * OPCIÓN 2 -> guardar los movimientos en char
		 * Crearemos un array para guardar las filas que correspondera con la columna correspondiente en el mismo 
		 * índice en el array de columnas
		 */
		char [] arrayFilas = new char[15];
		char [] arrayColumnas = new char[15];
		int indexArraysSolucion = 0;
		
		// Calculo la diagonal arriba-derecha
		char fila = numero;
		char columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') 
		{
			if (fila != numero && columna != letra) 
			{
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna++;
			fila++;
		}
		System.out.print("\n");
		// Calculo la diagonal abajo-derecha
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') 
		{
			if (fila != numero && columna != letra) 
			{
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna++;
			fila--;
		}
		System.out.print("\n");
		// Calculo la diagonal abajo-izquierda
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') 
		{
			if (fila != numero && columna != letra) 
			{
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna--;
			fila--;
		}
		System.out.print("\n");
		// Calculo la diagonal arriba-izquierda
		// TODO: EXTRA. Una vez calculados los movimientos, pintarlos en rojo en la
		// matriz
		fila = numero;
		columna = letra;
		while (fila >= '1' && fila <= '8' && columna >= 'a' && columna <= 'h') 
		{
			if (fila != numero && columna != letra) 
			{
				System.out.print(" " + columna + fila);
				arrayColumnas[indexArraysSolucion] = columna;
				arrayFilas[indexArraysSolucion] = fila;
				indexArraysSolucion++;
			}
			columna--;
			fila++;
		}
		
		System.out.println("\n");
		
		//se pinta el tablero marcando el alfil con una x
		//muestra movimientos disponibles de color rojo
		
		final String RESET = "\u001B[0m";
		final String AZUL = "\u001B[34m";
		
		for (char filaColor = '8'; filaColor >= '1'; filaColor--) 
		{
			
			for (char columnaColor = 'a'; columnaColor <= 'h'; columnaColor++) 
			{
				String s = AZUL + columnaColor + "" + filaColor + "\t" +  RESET;
				
				if (letra == columnaColor && numero == filaColor) 
				{
					System.out.print("X\t");
				} 
				else 
				{
					//logica pintar datos color
					int index = indexArraysSolucion;
					boolean encontrado = false;
					String pintada = "";
					while (index >= 0 && !encontrado)
					{
						if(arrayColumnas[index] == columnaColor && arrayFilas[index] == filaColor)
						{
							encontrado = true;
							pintada = AZUL + columnaColor + "" + filaColor + "\t" + RESET;
						}
						index--;
					}
					System.out.println(pintada);
				}
			}
			System.out.print("\n");
		}
	}
}