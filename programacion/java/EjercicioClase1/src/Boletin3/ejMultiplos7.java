/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejMultiplos7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Mostrar pantalla multiplos 7
		//existen entre 2 numeros dados
		//Comprobar datos introducidos
		
		Scanner scannerNUM1=new Scanner(System.in);
		System.out.println("introduce el primer numero: ");
		int num1=scannerNUM1.nextInt();

		Scanner scannerNUM2=new Scanner(System.in);
		System.out.println("introduce el segundo numero: ");
		int num2=scannerNUM2.nextInt();
		
		if (num1<0 || num2<0 && num1>num2)
		{
			System.out.println("Error, los num introducidos deben de ser mayor a cero \ny el primer numero ser inferior al segundo");
		}
		else
		{
			for (int contador=num1; contador<num2 ;contador++) 
			{
				if (contador%7==0)
				{
					if(Existe.equals("true"))
					{
						System.out.println(contador);
					}
					else
					{
						System.out.println("En esta cadena, no existe ningun valor que sea multiplo de 7");
					}
				}
				
			}
		}
		scannerNUM1.close();
		scannerNUM2.close();
	}

}
