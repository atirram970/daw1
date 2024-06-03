/**
 * 
 */
package Boletin8;

import java.util.Iterator;

/**
 * 
 */
public class OrdenacionInsercion 
{
	 public static void main(String[] args)
	 {
		 int[] array = { 7, 4, 3, 10, 6 };
	        
	     System.out.println("Array original");
	     for (int i = 0; i < array.length; i++)
	     {
	    	 System.out.print(array[i] + " ");
	     }
	     System.out.println("\n");
	        
	     insercion(array);
	 }
	
	//implementar metodo insercion
	static void insercion(int[] arr)
	{
		int n = arr.length;
		
		for (int i = 0; i < n; i++) 
		{
			int clave = arr[i];
			int j = i -1;
			
			//mover elementos mayores que la clave a la derecha
			while (j >= 0 && arr[j] > clave)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			
			//insertar la clave en la posición correcta
			arr[j + 1] = clave;
		}
		
		//mostrar array
		System.out.println("Array ordenado");
		for (int i = 0; i < arr.length; i++)
	    {
	     System.out.print(arr[i] + " ");
	    }
	}
}
