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
		while (true) 
		{
			try 
			{
				System.out.println("Introduce un número negativo: ");
				imprimeNegativo(scan.nextInt());
				System.out.println("Introduce un número positivo: ");
				imprimePositivo(scan.nextInt());
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Solo se pueden introducir numeros enteros");
			}
			catch (Exception e)
			{
				System.out.println("ERROR. %s", e.getMessage());
			}
		}
			
	}
	
	private static int imprimePositivo(int p)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int valor = scan.nextInt();
		if (valor < 0) 
		{
			throw new Exception();
		}
		return p;
	}
	
	private static int imprimeNegativo(int n)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int valor = scan.nextInt();
		if (valor >= 0) 
		{
			throw new Exception();
		}
		return n;
	}
	
}
