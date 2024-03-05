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
public class ejercicio4Array 
{
	public static void main(String[] args) 
	{
		//Escribe un programa que lea 15 números por teclado y que los almacene en un
		//array. Rota los elementos de ese array una posición a la derecha, es decir, el 
		//elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El 
		//número que se encuentra en la última posición debe pasar a la posición 0. 
		//Finalmente, muestra el contenido del array
		
		Scanner scanner = new Scanner(System.in);
        
		int[] array = new int[15];

        for (int i = 0; i < 15; i++) 
        {
        	System.out.printf("Dame un numeros: ");
        	array[i] = scanner.nextInt();
        }

        scanner.close();
        
        int ultimoElemento = array[14];

        for (int i = 14; i > 0; i--) 
        {
            array[i] = array[i - 1];
        }

        array[0] = ultimoElemento;

        System.out.println("Contenido del array después de rotar:");
        System.out.println(Arrays.toString(array));
	}
}
