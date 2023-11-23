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
public class ej2 
{
	public static void main(String[] args) 
	{
		//Declara un array llamado "num" con dimensiones de 3 filas por 6 columnas, el cual 
		//contendrá números enteros. Asigna los valores de acuerdo con la siguiente tabla y 
		//presenta el contenido de todos los elementos del array en forma tabular, tal como se 
		//ilustra en la figura.
		
		//creacion array bidimensional
		Scanner scan = new Scanner(System.in);
		
		int filas = 4;
		int columnas = 5;
		int numerosTotales = filas*columnas;
		
		int [] numeros = new int[numerosTotales];
		int [][] tabla = new int [filas][columnas];
		int [] sumaColumnas = new int[columnas];
		int indexNum = 0;
		
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.printf("Dame numeros enteros, Te quedan %d numeros", (numerosTotales+1)-(i+1));
			numeros[i] = scan.nextInt();
		}
		
		for (int fila = 0; fila < 4; fila++) 
		{
			for (int columna = 0; columna < 5; columna++) 
			{
					tabla[fila][columna] = numeros[indexNum++];
			}
		}
		
		
		int sumaTotal = 0;
		
		for (int fila = 0; fila < 4; fila++) 
		{
			int sumaFila = 0;
			for (int columna = 0; columna < 5; columna++) 
			{
				System.out.print(tabla[fila][columna] + "\t");
				sumaFila += tabla[fila][columna];
				sumaColumnas[columna] += tabla[fila][columna];
			}
			sumaTotal += sumaFila;
			System.out.println(sumaFila);
		}
		
		
		for (int i : sumaColumnas) 
		{
			System.out.printf(i + "\t");
			sumaTotal += i;
		}
		System.out.printf(sumaTotal + "\t");
	}
}
