/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejercicio6Array 
{
	public static void main(String[] args) 
	{
		//Realiza un programa que pida la temperatura media que ha hecho en cada mes
		//de un determinado año y que muestre a continuación un diagrama de barras
		//horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
		//de asteriscos o cualquier otro carácter.
		
		boolean formatoCorrecto = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el año: ");
		int anio = scan.nextInt();
		
		String[] meses= {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		float[] temperaturas = new float[12];
		for (int i = 0; i < meses.length; i++) 
		{
		formatoCorrecto = false;
				while (!formatoCorrecto)
				{
					try 
					{
						System.out.printf("Introduce el valor de la temperatura media de %s de %d\n", meses[i], anio);
						temperaturas[i] = scan.nextFloat();
						formatoCorrecto = true;
					} 
					catch (InputMismatchException e) 
					{
						scan.next();
						System.out.println("Se ha introducido un valor incorrecto");
					}
				}
		}
		scan.close();
		for (int m = 0; m < 12; m++) 
		{
		    System.out.printf("%s:", meses[m]);
		    for (int t = 0; t < temperaturas[m]; t++) 
		    {   
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
