package Boletin6;

import java.util.Iterator;

public class funcionesMatematicas 
{
	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
	 * en caso contrario.
	 * 
	 * @param numero
	 * @return esCapicua
	 */
	public static boolean esCapicua(long numero) 
	{
		boolean esCapicua = numero == voltea(numero);
		return esCapicua;
	}

	/**
	 * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
	 * en caso contrario.
	 * 
	 * @param i
	 * @return esPrimo
	 */
	public static boolean esPrimo(long i) 
	{
		boolean esPrimo = true;
		int index = 2;
		if(i>=2)
		{
			while (index < (i / 2 + 1) && esPrimo) 
			{
				if (i % index == 0) 
				{
					esPrimo = false;
				}
				index++;
			}

		}
		return esPrimo;
	}

	/**
	 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
	 * 
	 * @param inicio
	 * @return
	 */
	public static long siguientePrimo(long inicio) 
	{
		boolean esPrimo = false;
		long incremento = 1l;
		while (!esPrimo) 
		{
			esPrimo = esPrimo(inicio + incremento);
			incremento++;
		}
		return inicio + incremento - 1;
	}

	/**
	 * Dada una base y un exponente devuelve la potencia
	 * 
	 * @param base
	 * @param exp
	 * @return result
	 */
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

	/**
	 * Cuenta el número de dígitos de un número entero.
	 * 
	 * @param numero
	 * @return numDigitos
	 */
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

	
	public static int digitoN (int numero, int n)
	{
		String numAString = Integer.toString(numero);
	    char digitoCaracter = numAString.charAt(n);
	    int num = Character.getNumericValue(digitoCaracter);
	    return num;
	}
	
	public static int posicionDeDigito (int numero)
	{
		String numAString = Integer.toString(numero);
	    char digitoCaracter = numAString.charAt(0);
	    int num = Character.getNumericValue(digitoCaracter);
		return num;
	}
	
	public static String letraNIF(int numero)
	{
		int CalculoLetra = numero % 23;
		String letra="";
		if(numero>=0 && numero<=99999999)
		{
			switch (CalculoLetra) 
			{
				case 0: 
				{
					letra = "T";
					break;
				}
				case 1: 
				{
					letra = "R";
					break;
				}
				case 2: 
				{
					letra = "W";
					break;
				}
				case 3: 
				{
					letra = "A";
					break;
				}
				case 4: 
				{
					letra = "G";
					break;
				}
				case 5: 
				{
					letra = "M";
					break;
				}
				case 6: 
				{
					letra = "Y";
					break;
				}
				case 7: 
				{
					letra = "F";
					break;
				}
				case 8: 
				{
					letra = "P";
					break;
				}
				case 9: 
				{
					letra = "D";
					break;
				}
				case 10: 
				{
					letra = "X";
					break;
				}
				case 11: 
				{
					letra = "B";
					break;
				}
				case 12: 
				{
					letra = "N";
					break;
				}
				case 13: 
				{
					letra = "J";
					break;
				}
				case 14: 
				{
					letra = "Z";
					break;
				}
				case 15: 
				{
					letra = "S";
					break;
				}
				case 16: 
				{
					letra = "Q";
					break;
				}
				case 17: 
				{
					letra = "V";
					break;
				}
				case 18: 
				{
					letra = "H";
					break;
				}
				case 19: 
				{
					letra = "L";
					break;
				}
				case 20: 
				{
					letra = "C";
					break;
				}
				case 21: 
				{
					letra = "K";
					break;
				}
				case 22: 
				{
					letra = "E";
					break;
				}
				default:
					System.out.println();
			}
		}
		return letra;
		
	}
	
	public static boolean nifCorrecto(int numero)
	{
		boolean nif = true;
		
		try 
		{
			String numAString = Integer.toString(numero);
		    char digitoCaracter = numAString.charAt(7);
		}
		catch (java.lang.StringIndexOutOfBoundsException e) 
		{
			nif = false;
		}
		
		return nif;
		
	}
	
	public static long areaCirculo(int numero)
	{
		long area = (long) (Math.PI * (numero*numero));
		return area;
	}
	
	public static long areaRectangulo(int base, int altura)
	{
		long area = (long) (base * altura);
		return area;
	}
	
	public static void factorial(int numero)
	{
		int factorial = 1;
		for (int i = 1; i <= numero; i++) 
		{
		    factorial *= i;
		}
		System.out.println(numero + "! = " + factorial);	
	}
	
	public static void cambioExacto(int dineroCliente)
	{
		int billete500 = 0;
		int billete200 = 0;
		int billete100 = 0;
		int billete50 = 0;
		int billete20 = 0;
		int billete10 = 0;
		int billete5 = 0;
		
		while (dineroCliente >= 0) 
		{
			if(dineroCliente >= 500)
			{
				billete500 = billete500 + 1;
			}
			else if(dineroCliente >=200)
			{
				billete200 = billete200 + 1;
			}
			else if(dineroCliente >=100)
			{
				billete100 = billete100 + 1;
			}
			else if(dineroCliente >=50)
			{
				billete50 = billete50 + 1;
			}
			else if(dineroCliente >=20)
			{
				billete20 = billete20 + 1;
			}
			else if(dineroCliente >=10)
			{
				billete10 = billete10 + 1;
			}
			else if(dineroCliente >=5)
			{
				billete5 = billete5 + 1;
			}
		}
		System.out.println("El cambio será de: " + billete500 + " billetes de 200" + billete200 + " billetes de 100" + billete100 + " billetes de 50" + billete50 + " billetes de 20" + billete20 + " billetes de 10" + billete10 + " billetes de 5" + billete5 );
	}
	
}
