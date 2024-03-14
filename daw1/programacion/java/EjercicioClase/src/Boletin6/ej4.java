/**
 * 
 */
package Boletin6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 	Implementa un programa con tres funciones:
			 void imprimePositivo(int p): Imprime el valor p. Lanza ‘Exception’ si p < 0
			 void imprimeNegativo(int n): Imprime el valor n. Lanza ‘Exception’ si p >= 0
			 La función main para realizar pruebas. Puedes llamar a ambas funciones 
			varias veces con distintos valores, hacer un bucle para pedir valores por 
			teclado y pasarlos a las funciones. Maneja las posibles excepciones
		 */
		
		Scanner scan = new Scanner(System.in);
		
		while (true) 
		{
			try 
			{
				System.out.println("Introduce un número negativo: ");
				imprimeNegativo(scan.nextInt());
				System.out.println("Contenido de Scan deespues de poner un entero: " + scan.nextInt());
				System.out.println("Introduce un número positivo: ");
				imprimePositivo(scan.nextInt());
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Solo se pueden introducir numeros enteros");
				System.out.println("TIENE BASURA:" + scan.next() + ":");
			}
			catch (Exception e)
			{
				System.out.printf("ERROR. %s", e.getMessage());
			}
		}
		
	}
	
	private static int imprimePositivo(int p) throws Exception
	{
		if (p < 0) 
		{
			throw new Exception("Error, El número debe ser positivo");
		}
		return p;
	}
	
	private static int imprimeNegativo(int n) throws Exception
	{
		if (n >= 0) 
		{
			throw new Exception("Error, El número debe ser negativo");
		}
		return n;
	}
		
}
