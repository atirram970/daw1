package com.Adrian.tarea2;

public class UtilidadesCadenasTexto
{	
	//EsPalindromo
	public static String esPalindromo(String texto)
	{
	        String alReves = "";
	        int longitud = texto.length();
	        for (int i = (longitud - 1); i >= 0; --i) 
	        {
	            alReves = alReves + texto.charAt(i);
	        }
	        
	        String respuesta = "";
	        
	        if (texto.toLowerCase().equals(alReves.toLowerCase())) 
	        {
	            respuesta = "es un palíndromo";
	        } 
	        else 
	        {
	        	respuesta = "no es un palíndromo";
	        }
			
			return respuesta;
	}
	
	//EsHeterograma
	public static boolean esHeterograma(String texto)
	{	
		for (int i = 0; i < texto.length(); i++) 
		{
            char letraActual = texto.charAt(i);
            for (int j = i + 1; j < texto.length(); j++) 
            {
            	if (letraActual == texto.charAt(j)) 
            	{
                    return false; // Se encontró una repetición, por lo tanto no es un heterograma
                }
            }
        }
        return true; // No se encontraron repeticiones, es un heterograma
	}
	
	//ConteoVocales
	public static int conteoVocales(String texto)
	{
		int contadorVocal = 0;
		
		for (int i = 0; i < texto.length(); i++)
		{
			char caracter = texto.charAt(i);
			if (caracter == ('a'|'A')) 
			{
				contadorVocal += 1;
			}
			else if (caracter == ('e'|'E')) 
			{
				contadorVocal += 1;
			}
			else if (caracter == ('i'|'I')) 
			{
				contadorVocal += 1;
			}
			else if (caracter == ('o'|'O')) 
			{
				contadorVocal += 1;
			}
			else if (caracter == ('u'|'U')) 
			{
				contadorVocal += 1;
			}
		}
		return contadorVocal;	
	}
	
	//ContarPalabras
	public static int contarPalabras(String texto)
	{
		int contadorPalabra = 0;
		
		for (int i = 0; i < texto.length(); i++)
		{
			char caracter = texto.charAt(i);
			
			if (texto == null || texto.isEmpty()) 
			{
				contadorPalabra = contadorPalabra;
			}
			else
			{
				contadorPalabra += 1;
			}
		}
		return contadorPalabra;
	}
}