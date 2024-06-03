package examen;

import java.util.Scanner;

public class matrices 
{

	public static void main(String[] args) 
	{
		
	}
	
	private static int[][] sumaMatrices()
	{
		//declaracion del scanner
		Scanner scan = new Scanner(System.in);
		//variable de las dimensiones del array
		String dimensionMatrizN1 = "";
		String dimensionMatrizN2 = "";
		int columnasMatriz1 = 0;
		int columnasMatriz2 = 0;
		int numMatriz = 0;
		
		System.out.println("Dame la dimensión de la matriz nº1");
		dimensionMatrizN1 = scan.next();
		System.out.println("Dame la dimensión de la matriz nº2");
		dimensionMatrizN2 = scan.next();
		
		if(dimensionMatrizN1 != dimensionMatrizN2)
		{
			System.out.println("No se puede realizar la operación, debido a que no poseen las mismas dimensiones");
		}
		else
		{
			//declaracion arrays
			int matriz1[][] = new int[dimensionMatrizN1.charAt(0)][dimensionMatrizN1.charAt(1)];
			int matriz2[][] = new int[dimensionMatrizN2.charAt(0)][dimensionMatrizN2.charAt(1)];
			int totalMatriz[][] = new int[dimensionMatrizN1.charAt(0)][dimensionMatrizN1.charAt(1)];
			//introducir numeros
			
			System.out.println("Introducir numeros matriz Nº1");
				
			for (int columnas = 0; columnas < columnasMatriz1; columnas++) 
			{
				for (int filas = 0; filas < columnasMatriz1; filas++) 
				{				
					System.out.println("Dame los numeros de la matriz: ");
					numMatriz = scan.nextInt();
					matriz1[columnas][filas] = numMatriz;
				}
			}	
			
			System.out.println("Introducir numeros matriz Nº2");
			
			for (int columnas = 0; columnas < columnasMatriz1; columnas++) 
			{
				for (int filas = 0; filas < columnasMatriz1; filas++) 
				{				
					System.out.println("Dame los numeros de la matriz: ");
					numMatriz = scan.nextInt();
					matriz2[columnas][filas] = numMatriz;
				}
			}	
			
			
			//sumar numeros	
				for (int columnas = 0; columnas < columnasMatriz1; columnas++) 
				{
					for (int filas = 0; filas < columnasMatriz1; filas++) 
					{				
						totalMatriz[columnas][filas] = matriz1[columnas][filas] + matriz2[columnas][filas];
					}
				}	
			}
		return totalMatriz;
		
	}

}
