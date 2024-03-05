/**
 * 
 */
package Boletin6;

import java.util.Scanner;

/**
 * 
 */
public class ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 	Crea un método adicional en el ejercicio anterior que sea capaz de insertar 10 
			saltos de línea en la salida estándar. Utilízalo cuando creas que es necesario en 
			la aplicación
		 */
		
		int opcion = 0;
		do 
		{
			opcion = mostrarMenu();
			switch (opcion) 
			{
			case 1:
				System.out.println("Has elegido la opción Añadir");
				break;
			case 2:
				System.out.println("Has elegido la opción Borrar");			
				break;
			case 3:
				System.out.println("Has elegido la opción Modificar");
				break;
			case 4:
				System.out.println("Has elegido la opción Mostrar por pantalla");
				break;
			case 5:
				saltosDeLinea(10);
				System.out.println("Has elegido la opción de Finalizar");
				break;
			default:
				saltosDeLinea(5);
				System.err.println("Error, has introducido una opcion no valida, intentalo de nuevo...");
				break;
			}
		} 
		while (opcion != 5);
	}
	
	private static int mostrarMenu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1.- Añadir\n2.- Borrar\n3.- Modificar\n4.- Mostrar por pantalla\n5.- Finalizar\nElige una opcion: ");
		int opcionSeleccionada = scan.nextInt();
		return opcionSeleccionada;
	}
	
	private static void saltosDeLinea(int saltos)
	{
		String saltar = "";
		for (int i = 1; i <= saltos; i++) 
		{
			saltar += "\n";
		}
		System.out.print(saltar);
	}
}
