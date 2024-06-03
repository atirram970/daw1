/**
 * 
 */
package Boletin5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class controlExcepciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int i = Integer.MIN_VALUE;
		
		try 
		{
			//Inicio
			i = scan.nextInt();
			System.out.println(i);
		} 
		catch (InputMismatchException e) 
		{
			//En caso de Error
			System.out.println("No has introducido un número");
		}
		finally
		{
			//Esto se ejecuta siempre
			System.out.println(i);
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
		scan.close();
	}

	public static String muestraCadena(String s){
		if (s.equals("0")) 
		{
			throw new NumberFormatException();
		}
		return "";
	}
}
