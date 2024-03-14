package com.adriantirado.tarea2;

import java.util.Scanner;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		/*
		Escribe un programa con una cadena de texto que contenga una contraseña 
		cualquiera. Después se pedirá al usuario que introduzca la contraseña, con 3 
		intentos. Cuando acierte mostrará un mensaje de éxito. Si excede el número de 
		intentos, avisa del error y termina el programa.
		*/
		
		//esta sera la contraseña, es vital para el ejercicio
		String contrasena="123";
		//creo una variable int que me sirva como tope y para mostrarla luego
		int oportunidades=3;
		//declaro el escaner
		Scanner scannerUSU=new Scanner(System.in);
		System.out.println("Introduce una contraseña: ");
		
		for (int contador = 1; contador <= oportunidades; contador++) 
		{
			//entrada del usuario
			String contraUSU=scannerUSU.next();
			
			//si la contraseña guardada equivale a la entrada por el usuario -->
			if (contrasena.equals(contraUSU)) 
			{
				//Mensaje en caso de acierto con el contador de nº de intentos junto a la contraseña
				System.out.println("Has acertado en el intento nº " + contador + ", la contraseña era: " + contrasena);
				System.exit(0);
			}
			else
			{
				//Mensaje en caso de error junto a las oportunidades restantes
				System.out.println("Has fallado, intentalo de nuevo.\nTe quedan " + (oportunidades-contador) + " oportunidades");
				//en caso de que el contador llegue a 0, mostrar un mensaje de fin de juego, junto a la contraseña
				if (oportunidades - contador == 0) 
				{
					System.out.println("Fin del juego, la contraseña era: " + contrasena);
				}
			}
			
		}
		scannerUSU.close();	
	}

}
