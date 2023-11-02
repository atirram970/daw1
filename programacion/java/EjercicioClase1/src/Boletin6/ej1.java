/**
 * 
 */
package Boletin6;

import java.util.Scanner;

/**
 * 
 */
public class ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/*
		 	Crea una aplicación que muestre el siguiente menú: 
			1.- Añadir 
			2.- Borrar 
			3.- Modificar 
			4.- Mostrar por pantalla 
			5.- Finalizar 
			Este menú se mostrará indefinidamente tras la elección de opción hasta que se 
			pulse finalizar, o bien se introduzca una opción no contemplada, de lo cual 
			informará y mostrará de nuevo el menú.
			El menú debe de estar en un método que se llame mostrarMenu que devolverá 
			el número con la última opción seleccionada y que será llamado desde el main.
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
				System.out.println("Has elegido la opción de Finalizar");
				break;
			default:
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
	

}
