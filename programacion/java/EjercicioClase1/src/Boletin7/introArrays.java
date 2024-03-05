/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;

/**
 * 
 */
public class introArrays 
{
	public static void main(String[] args) 
	{
		//introduccion al manejo de arrays
		//incializar array con datos
		int[] arrayConDatos = {1, 7, 23, -100};
		//incializar array vacio con 4 posiciones
		int[] arrayVacio = new int[4];
		arrayVacio[0] = 1;
		arrayVacio[1] = 7;
		arrayVacio[2] = 23;
		arrayVacio[3] = -100;
		//arrayVacio[4] = 2; --> si colocamos esto saldra error = ArrayIndexOutOfBounds porque nos salimos del rango
		System.out.println("La primera posicion del array incicializado con datos es: " + arrayConDatos[0]);
		System.out.println("El array inicializado vacío tiene " + arrayVacio.length);

		//Recorriendo el array con un for
		System.out.println("Los elementos del array son (con for normal):");
		for (int index = 0; index < arrayVacio.length; index++)
		{
			System.out.println("la posición " + index + " contiene: " + arrayVacio[index]);
		}
		
		//Recorriendo el array con un for extendido = "foreach"
		System.out.println("Los elementos del array son (con for extendido):");
		for (int i : arrayVacio) 
		{
			System.out.println(i);
		}
		
		System.out.println("La sum del primer elemento y el ultimo del array es: " + (arrayConDatos[0]+arrayConDatos[3]));
		
		//array de caracteres
		char[] arrayChar = {'s', 'Ñ', '@', '?', 'm'};
		//Recorriendo el array con un for
		System.out.println("Los elementos del array son (con for normal):");
		for (int index = 0; index < arrayChar.length; index++)
		{
			System.out.println("la posición " + index + " contiene: " + arrayChar[index]);
		}
				
		//Recorriendo el array con un for extendido = "foreach"
		System.out.println("Los elementos del array son (con for extendido):");
		for (char caracter : arrayChar) 
		{
			System.out.println(caracter);
		}
		
		//array de string
		String[] arrayString = new String[4];
		arrayString[1] = "HOLA";
		int indice = 0;
		for (String string : arrayString) 
		{
			System.out.printf("La cadena en la posición %d es --%s--\n", indice++, string);
		}
	}
}
