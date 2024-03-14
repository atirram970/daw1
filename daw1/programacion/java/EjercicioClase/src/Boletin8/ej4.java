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
public class ej4 
{
	public static void main(String[] args) throws InterruptedException 
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
		int limInf = 100;
		int limSup = 999;
		
		
		for (int i = 0; i < numeros.length; i++) 
		{
			int numAleatorio = (int) (Math.floor(Math.random() * (limSup - limInf + 1)) + limInf);
			//System.out.printf("Dame numeros enteros, Te quedan %d numeros: ", (numerosTotales+1)-(i+1));
			numeros[i] = numAleatorio;
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
			Thread.sleep(500);
			System.out.println(sumaFila);
			Thread.sleep(500);
		}
		
		
		for (int i : sumaColumnas) 
		{
			Thread.sleep(500);
			System.out.printf(i + "\t");
			Thread.sleep(500);
			sumaTotal += i;
		}
		Thread.sleep(1500);
		System.out.printf(sumaTotal + "\t");
	}
}
