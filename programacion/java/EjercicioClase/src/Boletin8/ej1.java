/**
 * 
 */
package Boletin8;

import java.lang.reflect.Array;

/**
 * 
 */
public class ej1 
{
	public static void main(String[] args) 
	{
		//Declara un array llamado "num" con dimensiones de 3 filas por 6 columnas, el cual 
		//contendrá números enteros. Asigna los valores de acuerdo con la siguiente tabla y 
		//presenta el contenido de todos los elementos del array en forma tabular, tal como se 
		//ilustra en la figura.
		
		//creacion array bidimensional
		Integer [][] num = new Integer[3][6];
		num[0][0]=0;
		num[0][1]=30;
		num[0][2]=2;
		num[0][5]=5;
		num[1][0]=75;
		num[1][4]=0;
		num[2][2]=-2;
		num[2][3]=9;
		num[2][5]=11;
		
		for (int fila = 0; fila <= 2; fila++) 
		{
			for (int columna = 0; columna <= 5; columna++) 
			{
				if (null != num[fila][columna]) //con esto hace que no aparezca el null
				{
					System.out.print(num[fila][columna] + "\t");
				}
				else
				{
					System.out.println("\t");
				}
			}
			System.out.println("\n");
		}
	}
}
