/**
 * 
 */
package Boletin6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Implementa un programa que pida dos valores int A y B utilizando un nextInt()
		 * (de Scanner), calcula A/B y muestra el resultado por pantalla. Se deberán
		 * tratar de forma independiente las dos posibles excepciones,
		 * InputMismatchException y ArithmeticException, mostrando un mensaje de error
		 * indicativo del error en cada caso
		 */

		System.out.println("Vamos a hacer la operación A/B, introduce a continuación 2 numeros enteros");
		int num1, num2;
		float result = 0f;

		try 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Dame el primer numero: ");
			num1 = scan.nextInt();
			System.out.println("Dame el segundo numero: ");
			num2 = scan.nextInt();
			scan.close();
			if (num2 == 0) 
			{
				throw new ArithmeticException(); //lanzar error
			}
			result = (float) num1 / (float) num2;
			System.out.printf("El resultado es:\n %d / %d = %f", num1, num2, result);
			scan.close();
		} 
		catch (InputMismatchException ime) 
		{
			System.out.println("Tanto A como B deben ser números enteros");
			ime.printStackTrace();
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("El número B no puede ser 0, pues no es posible");
			ae.printStackTrace();
		}
	}

}
