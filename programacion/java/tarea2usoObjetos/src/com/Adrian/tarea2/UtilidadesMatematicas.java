package com.Adrian.tarea2;

public class UtilidadesMatematicas 
{	
	//1 ejercicio
	public static long potencia(int base, int exp) 
	{
		/*
		 * Otra opción, usando la clase Math
		 * Math.pow(base, exp);
		 */

		long result = 1;
		if (exp < 0) 
		{
			for (int i = 0; i > exp; i--) 
			{
				result *= base;
			}
			result = 1 / result;
		} 
		else 
		{
			for (int i = 0; i < exp; i++) 
			{
				result *= base;
			}
		}
		return result;
	}
	
	//2 ejercicio
	public static boolean esPrimo(long i) 
	{
		boolean esPrimo = true;
		int index = 2;
		while (index < (i / 2 + 1) && esPrimo) 
		{
			if (i % index == 0) 
			{
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
	}
	
	//3 ejercicio
	public static long voltea(long numero) 
	{
		long result = 0l;
		long aux = numero;
		while (aux != 0) 
		{
			result = (result * 10) + (aux % 10);
			aux = aux / 10;
		}
		return result;
	}
	
	//4 ejercicio
	public static int digitos(long numero) 
	{
		int numDigitos = 0;
		long aux = numero;
		if (numero < 0) 
		{
			aux = -numero;
		}
		while (aux > 0) 
		{
			aux = aux / 10;
			numDigitos++;
		}
		return numDigitos;
	}
}
