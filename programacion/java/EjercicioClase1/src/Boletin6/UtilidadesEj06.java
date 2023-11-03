package Boletin6;

import java.util.Scanner;

public class UtilidadesEj06 
{
	public static void main(String[] args) 
	{
		Scanner scanOpc = new Scanner(System.in);
		Scanner scanDatos = new Scanner(System.in);
		int opcion;
		
		do 
		{
			System.out.println("1.INT\n2.FLOAT\n3.DOUBLE\n4.BOOLEAN\n5.CHAR\nElige una opción: ");
			boolean datoCorrecto = false;
			opcion = scanOpc.nextInt();
			
			switch (opcion) 
			{
				case 1:
					while (!datoCorrecto) 
					{
						int entero;
						try 
						{
							System.out.println("Has elegido crear un numero entero");
							scanDatos.next();
							String input = scanDatos.nextLine();
							entero = UtilidadesEj06.introduceInt(scanDatos.next());
							datoCorrecto = true;
							System.out.printf("Has creado un entero con el valor: %d\n", entero);
						} 
						catch (Exception e) 
						{
							System.out.println(e.getMessage());
						}	
					}
					break;
				case 2:
					while (!datoCorrecto) 
					{
						float decimalFloat;
						try 
						{
							System.out.println("Has elegido crear un float");
							decimalFloat = UtilidadesEj06.introduceFloat(scanDatos.next());
							datoCorrecto = true;
							System.out.println("Has creado un float: " + decimalFloat);
						} 
						catch (Exception e) 
						{
							System.out.println(e.getMessage());
						}
					}
					break;
				case 3:
					while (!datoCorrecto) 
					{
						double decimalDouble;
						try 
						{
							System.out.println("Has elegido crear un double");
							decimalDouble = UtilidadesEj06.introduceFloat(scanDatos.next());
							datoCorrecto = true;
							System.out.println("Has creado un double: " + decimalDouble);
						} 
						catch (Exception e) 
						{
							System.out.println(e.getMessage());
						}
					}
					break;
				case 4:
					System.out.println("Has elegido introducir un valor booleano");
					break;
				case 5:
					System.out.println("Has elegido introducir un caracter");
					break;
				default:
					System.out.println("Se ha introducido una opción incorrecta");
					break;
			}
		} 
		while (opcion != 0);
	}
		
		
		
	
	public static int introduceInt(String cadena) throws Exception 
	{
		int res;
		try 
		{
			res = Integer.parseInt(cadena);
		} 
		catch (NumberFormatException e) 
		{
			throw new Exception("La cadena no es un valor entero tipo INT");
		}
		return res;
		
	}
	public static float introduceFloat(String cadena) throws Exception
	{
		float res;
		try 
		{
			res = Float.parseFloat(cadena);
		} 
		catch (NumberFormatException e) 
		{
			throw new Exception("La cadena no es un valor decimal tipo FLOAT");
		}
		return res;
	}
	public static double introduceDouble(String cadena) throws Exception
	{
		double res;
		try 
		{
			res = Double.parseDouble(cadena);
		} 
		catch (NumberFormatException e) 
		{
			throw new Exception("La cadena no es un valor decimal tipo FLOAT");
		}
		return res;
	}
	public static boolean introduceBoolean(String cadena) throws Exception
	{
		boolean res;
		try 
		{
			res = Boolean.parseBoolean(cadena);
		} 
		catch (NumberFormatException e) 
		{
			throw new Exception("La cadena no es un valor decimal tipo FLOAT");
		}
		return res;
	}
	public static char introduceChar(String cadena) throws Exception
	{
		char res;
		try 
		{
			res = (cadena);
		} 
		catch (NumberFormatException e) 
		{
			throw new Exception("La cadena no es un valor decimal tipo FLOAT");
		}
		return res;
	}
}
