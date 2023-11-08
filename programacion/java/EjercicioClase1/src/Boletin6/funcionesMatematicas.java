package Boletin6;

public class funcionesMatematicas 
{
	/*
	 * Devuelve verdadero si el numero que se pasa como parametro es capicua y falso en caso contrario
	 */
	public static boolean esCapicua(long numero)
	{
		boolean esCapicua = true;
		int index = 10;
		int cifras = 1;
		long cifraActual = -1;
		long div = numero / index;
		
		while (esCapicua && div != 0) 
		{
			cifraActual = numero % index;
			if (div  == 0)
			{
				
			}
			index *=10;
			cifras++;
			/*while ()
			{
				
			}*/
		}
		return esCapicua;
	}
	
	/*
	 * : Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
	 */
	public static boolean esPrimo(long i)
	{
		boolean esPrimo = false;
		int index = 2;
		while (index < (i/2 +1) && esPrimo)
		{
			if (i % index == 0)
			{
				esPrimo = false;
			}
			index++;
		}
		return esPrimo;
	}
	
	public static long siguientePrimo(long inicio) 
	{
		boolean esPrimo = false;
		long incremento = 1l;
		
		while(!esPrimo)
		{
			esPrimo = esPrimo(inicio + incremento);
			incremento++;
		}
		return inicio + incremento - 1;
	}
	
	/*
	 * Dada una base y un exponente devuelve la potencia
	 * también se podria haber usado --> Math.pow(base, exp);
	 */
	
	public static long potencia(int base, int exp)
	{
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
	
	public static long digitos(long numero)
	{
		int numDigitos = 0;
		long aux = numero;
		
		if (numero < 0)
		{
			aux = -numero;
		}
		
		while(numero > 0)
		{
			aux = aux / 10;
			numDigitos++;
		}
		return numDigitos;
	}
	
	public static long voltea(long numero)
	{
		long result = 0l;
		long aux = numero;
		
		while(aux != 0)
		{
			result = (result * 10) + (aux % 10);
			aux = aux / 10;
		}
	}
}
