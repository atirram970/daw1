/**
 * 
 */
package Boletin8;

/**
 * 
 */
public class OrdenacionBurbuja 
{
	 public static void main(String[] args)
	 {
		 String[] array = { "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliett", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa",  "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "X-ray", "Yankee", "Zulu" };
	        
	     System.out.println("Array original");
	     for (int i = 0; i < array.length; i++)  // Corregir el límite del bucle for
	     {
	    	 System.out.print(array[i] + " ");
	     }
	     System.out.println("\n");
	        
	     burbuja(array);
	 }
	
	//implementar metodo burbuja
	static void burbuja(String[] array)
	{
		int n = array.length;
		boolean intercambio;
		
		do
		{
			intercambio = false;
			for (int i = 0; i < n - 1; i++) 
			{
				if (array[i].compareTo(array[i + 1]) > 0) 
				{
					//intercambiar arr[i] y arr[i + 1] 
					String temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					
					intercambio = true;
				}
			}
		}
		while (intercambio);
		
		System.out.println("Array ordenado");
		for (int i = 0; i < array.length; i++)  // Corregir el límite del bucle for
	    {
	     System.out.print(array[i] + " ");
	    }
	}
}
