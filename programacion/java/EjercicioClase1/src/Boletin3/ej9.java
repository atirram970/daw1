/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio pirámide
		
		Scanner scannerEntrada=new Scanner(System.in);
		System.out.println("Introduce cualquier cosa(*,+,-,€,$,...): ");
		String entrada=scannerEntrada.next();
		
		Scanner scannerNumFilas=new Scanner(System.in);
		System.out.println("Introduce El número de Filas: ");
		int NumFilas=scannerNumFilas.nextInt();
		
		Scanner scannerNumColumnas=new Scanner(System.in);
		System.out.println("Introduce El número de Columnas: ");
		int NumColumnas=scannerNumColumnas.nextInt();
		
		String PrimeraEntrada=entrada.substring(0);
		
		//normal
		for (int columnas=1; columnas<NumColumnas; columnas++) 
		{
			for (int filas=1; filas<=NumFilas ; filas++) 
			{
				System.out.println(entrada);
				entrada=entrada+PrimeraEntrada;
			}
		}
		
		scannerEntrada.close();
		scannerNumFilas.close();
		scannerNumColumnas.close();
	}

}
