package com.Adrian.tarea2;

public class UtilidadesMatematicas 
{	
	//Potencia
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
	
	//EsPrimo
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
	
	//Voltea
	public static long voltea(long numero) 
	{
		 long invertido = 0;
		 int resto = 0;
	     while(numero > 0) 
	     {
	            resto = (int) (numero % 10);
	            invertido = invertido * 10 + resto;
	            numero /= 10;
	     }
	     return invertido;
	}
	
	//Digitos
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
