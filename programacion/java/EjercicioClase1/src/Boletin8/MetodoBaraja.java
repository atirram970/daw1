/**
 * 
 */
package Boletin8;

import java.util.Random;

/**
 * 
 */
public class MetodoBaraja 
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
	        
	     barajarArray(array);
	}
	 
	static void barajarArray(int[] array)
	{
		Random rand = new Random();
		
		for (int i = array.length - 1; i > 0; i--) 
		{
				int j = rand.nextInt(i + 1);
				
				//intercambiar array[i] y array[j]
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
		}
		
		 System.out.println("Array barajado");
	     for (int i = 0; i < array.length; i++)
	     {
	    	 System.out.print(array[i] + " ");
	     }
	}
}
