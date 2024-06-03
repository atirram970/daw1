package examen;

import java.util.Scanner;

public class appEmpresa 
{
	public static void main(String[] args) 
	{
		//declaración del scanner
		Scanner scan = new Scanner(System.in);
		boolean nombreCompletoCorrecto = false;
		boolean dniCorrecto = false;
		boolean idCompleto = false;
		//declaración de las expresiones regulares
		String comprobarNombre = "^(([A-ZÁÉÍÚñ][a-záéíóúñ]*)){2}([A-ZÁÉÍÚñ][a-záéíóúñ]*)$";
		String comprobarDNI = "^\\d{8}[A-Z]$";	
		//declaracion variables
		String nombreCompleto = "";
		String dni = "";
		int contador = 0;
		//array para el id del empleado
		char letras = 'a';
		
		System.out.println("Introduzca los nombres de los usuarios");
		
		for (int i = 0; i < 1; i++) 
		{
			System.out.println("Usuario " + i);
			
			do 
			{
				//pedir nombre y apellidos
				System.out.println("Nombre: ");
				nombreCompleto = scan.next();
				if (nombreCompleto.matches(comprobarNombre)) 
				{
					nombreCompletoCorrecto = true;
				}
				else
				{
					System.out.println("Vuelve a introducirlo (ejemplo): AdriánTiradoRamos");
				}
				scan.nextLine();
			}
			while (!nombreCompletoCorrecto);
			do
			{
				//pedir dni
				System.out.println("DNI: ");
				dni = scan.next();
				if (dni.matches(comprobarDNI)) 
				{
					dniCorrecto = true;
				}
				else
				{
					System.out.println("Vuelve a introducirlo (ejemplo): 12345678A");
				}
				scan.nextLine();
			}
			while (!dniCorrecto); 
		}
		
		System.out.println("Los usuarios generados son: ");
		
		//generar id empleado
		for (int i = 0; i < 5; i++) 
		{
			
			do
			{
				letras = nombreCompleto.toUpperCase().charAt(contador);
				System.out.print(nombreCompleto + " - " + letras);
				contador++;
			}
			while (contador<=5);
		}
		
		System.out.println("FIN DEL PROGRAMA");
		
	}

}
