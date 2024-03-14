package Recursos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import Modelodatos.EquipoDatoIncorrectoException;

public class Utilidades 
{
	static Scanner scan = new Scanner(System.in);

	/**
	 * Obtiene una cadena por teclado
	 * 
	 * @return
	 */
	public static String dameCadena() 
	{
		return scan.nextLine();
	}

	/**
	 * Devuelve un char pasado por teclado por el usuario
	 * 
	 * @return result
	 */
	public static char dameChar() 
	{
		boolean correcto = false;
		String s = dameCadena();
		char result = 0;
		while (!correcto) 
		{
			try 
			{
				if (null != s && s.length() == 1) 
				{
					result = s.charAt(0);
					correcto = true;
				} 
				else 
				{
					throw new EquipoDatoIncorrectoException("Debe introducir un carácter");
				}
			} 
			catch (EquipoDatoIncorrectoException e) 
			{
				System.out.println(e.getMessage());
				scan.next();
			}
		}
		return result;
	}

	/**
	 * Devuelve un entero pasado por teclado por el usuario
	 * 
	 * @return result
	 */
	public static int dameEntero() 
	{
		boolean correcto = false;
		String s = dameCadena();
		int result = 0;
		while (!correcto) 
		{
			try {
				if (null != s) 
				{
					result = Integer.parseInt(s);
					correcto = true;
				} 
				else 
				{
					throw new EquipoDatoIncorrectoException("Debe introducir un número entero");
				}
			} 
			catch (EquipoDatoIncorrectoException e) 
			{
				System.out.println(e.getMessage());
				scan.next();
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("Debe introducir un número entero");
				scan.next();
			}
		}
		return result;
	}

	/**
	 * Devuelve un valor lógico pasado por teclado por el usuario
	 * 
	 * @return result
	 */
	public static boolean dameSiNo() 
	{
		boolean correcto = false;
		String s = dameCadena();
		boolean result = false;
		while (!correcto) 
		{
			try 
			{
				if (null != s && (s.equalsIgnoreCase("si") || s.equalsIgnoreCase("sí"))) 
				{
					result = Boolean.TRUE;
					correcto = true;
				} 
				else if (null != s && s.equalsIgnoreCase("no")) 
				{
					result = Boolean.TRUE;
				} 
				else 
				{
					throw new EquipoDatoIncorrectoException("Debe responder sí o no");
				}
			} 
			catch (EquipoDatoIncorrectoException e) 
			{
				System.out.println(e.getMessage());
				scan.next();
			}
		}
		return result;
	}

	/**
	 * Devuelve una fecha pasada por teclado por el usuario
	 * 
	 * @return result
	 */
	public static LocalDate dameFecha() 
	{
		boolean correcto = false;
		String s = dameCadena();
		String formato = "dd/MM/yyyy";
		LocalDate result = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formato);
		while (!correcto) 
		{
			try 
			{
				if (null != s) 
				{
					result = LocalDate.parse(s, dtf);
					correcto = Boolean.TRUE;
				} 
				else 
				{
					throw new EquipoDatoIncorrectoException("Debe introducir una fecha válida con formato" + formato);
				}
			} 
			catch (EquipoDatoIncorrectoException e) 
			{
				System.out.println(e.getMessage());
				scan.next();
			} 
			catch (DateTimeParseException e) 
			{
				System.out.println("Debe introducir una fecha válida con formato" + formato);
				scan.next();
			}
		}
		return result;
	}

	/**
	 * Devuelve un valor lógico según el cif sea válido o no
	 * 
	 * @return valido
	 * @throws EquipoDatoIncorrectoException 
	 */
	public static boolean esValidoCif(String cif) throws EquipoDatoIncorrectoException 
	{
		boolean valido = false;
		// Extraer los números y la letra
		String cadenaNumero = cif.substring(0, cif.length() - 1);
		long numero = Long.parseLong(cadenaNumero);
		char letra = cif.charAt(cif.length() - 1);
		// Dígitos de control ordenados por valor del módulo
		final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		while (!valido) 
		{
			// Verificar que los primeros caracteres son números y el dígito de control
			if (cadenaNumero.matches("\\d+") && letra == DIGITO_CONTROL.charAt((int) (numero % 23))) 
			{
				valido = true;
			} 
			else 
			{
				throw new EquipoDatoIncorrectoException("Debe introducir un cif válido");
			}
		}
		return valido;
	}
	
	/**
	 * Devuelve un cif correcto pasado por teclado por el usuario
	 * 
	 * @return result
	 */
	public static String dameCif() 
	{
		boolean correcto = false;
		String result = "";
		while (!correcto) 
		{
			result = dameCadena();
			try 
			{
				if (null != result && esValidoCif(result)) 
				{
					correcto = true;
				}
			} 
			catch (EquipoDatoIncorrectoException e) 
			{
				System.out.println(e.getMessage());
				scan.next();
			}
		}
		return result;
	}
}