/**
 * 
 */
package Boletin8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejExtra01 
{
	public static void main(String[] args)
	{
		//Programa muestre array 10 filas y 10 columnas relleno de números aleatorios entre 200 y 300
		//Debe mostrar los números de la diagonal esquina superior izquierda a la inferior derecha
		//También muestre el máximo, el mínimo y la media de los números de esa diagonal
		
		//crear array
		int numero[][] = new int[10][10];
		
		//inicializo variables que usaremos para mostrar el maximo, minimo y la media
		int minimo = 300;
		int maximo = 200;
		float media = 0f;
		
		//rellenar array de numeros aleatorios y mostrarlo
		for (int i = 0; i < numero.length; i++)
		{
			for (int j = 0; j < numero.length; j++)
			{
				numero[i][j] = (int) (Math.random() * 101) + 200;
				System.out.print(numero[i][j] + "\t");
			}
			//para que de un salto de linea
			System.out.print("\n");
		}
		
		//mostrar diagonal del array
		System.out.println("\n" + "Numeros de la diagonal: ");
		for (int i = 0; i < numero.length; i++)
        {
            System.out.print(numero[i][i] + "\t");
            
            //guardar maximo y minimo
            if (numero[i][i] > maximo)
			{
				maximo = numero[i][i];
			}
			if (numero[i][i] < minimo)
			{
				minimo = numero[i][i];
			}
			
			//guardar suma todos numeros
			media += numero[i][i];
        }
		
		//calcular media
		media = media / 10;
		
		//coloco esto para que se muestre todo correctamente luego
		System.out.println("\n");
		
		//mostrar maximo, minimo y media
		System.out.println("Mínimo: " + minimo);
		System.out.println("Maximo: " + maximo);
		System.out.println("Media: " + media);
	}
}
