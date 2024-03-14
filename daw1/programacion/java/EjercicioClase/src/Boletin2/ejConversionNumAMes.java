/**
 * 
 */
package Boletin2;

import java.util.Scanner;

/**
 * 
 */
public class ejConversionNumAMes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio pedir num y devolver mes
		Scanner scanner=new scanner(System.in);
		System.out.println("Dame un numero del 1 al 12: ");
		int nusMes=scanner.nextInt();
		do 
		{
			int numMes=scanner.nextInt();
			
			switch (numMes) 
			{
				case 1: 
				{
					System.out.println("Enero");
				}
				case 2: 
				{
					System.out.println("Febrero");
				}
				case 3: 
				{
					System.out.println("Marzo");
				}
				case 4: 
				{
					System.out.println("Abril");
				}
				case 5: 
				{
					System.out.println("Mayo");
				}
				case 6: 
				{
					System.out.println("Junio");
				}
				case 7: 
				{
					System.out.println("Julio");
				}
				case 8: 
				{
					System.out.println("Agosto");
				}
				case 9: 
				{
					System.out.println("Septiembre");
				}
				case 10: 
				{
					System.out.println("Octubre");
				}
				case 11: 
				{
					System.out.println("Noviembre");
				}
				case 12: 
				{
					System.out.println("Diciembre");
				}
				default:
					System.out.println("Has introducido un valor incorrecto, intentalo de nuevo");
			}
		} 
		while (numMes!=[1-12]);
		
		scanner scanner.close();
	}

}
