package com.adriantirado.tarea2;

import java.util.Scanner;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		/*
	 	Construye un programa que simule el juego de la adivinanza de un número. El 
		ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene 
		cinco oportunidades para acertarlo. Después de cada intento el programa debe 
		indicarle al usuario si el número introducido por él es mayor, menor o igual al 
		número a adivinar, y el número de intentos restantes.
		Nota: para generar el valor aleatorio puede emplearse la sentencia:
		int aleatorio = (int) (100*Math.random()+1);
		 */
	
		//generador de numero aleatorio
		int aleatorio = (int) (100*Math.random()+1);
		//declarar variable del numero que va a introducir el usuario
		int numUSU;
		//declaro variable de oportunidades que tiene el usuario
		int oportunidades=5;
		//apertura de scaner de lo que va a introducir el usuario
		Scanner scannerUSU = new Scanner(System.in);
		
		for (int contador = 1; contador <= oportunidades; contador++) 
		{
			//pedir numero al usuario entre 1 y 100
			System.out.println("Introduce un número(1-100): ");
			numUSU=scannerUSU.nextInt();
			
			//si numero introducido equivale al aleatorio -->
			if (numUSU == aleatorio) 
			{
				//mensaje de que se ha acertado el numero junto a los intentos y mostrando el numero aleatorio
				System.out.println("Has acertado en el intento numero: "+contador);
				System.out.println("El número era: "+aleatorio);
				break;
			}
			//si aleatorio es mayor al numero introducido -->
			//junto a control de errores para que el usuario no introduzca numeros fuera del rango
			else if (aleatorio>numUSU && (numUSU>=0 && numUSU<=100)) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más grande\nTe quedan: "+(oportunidades-contador)+" oportunidades");
			}
			//si aleatorio es menor al numero introducido -->
			//junto a control de errores para que el usuario no introduzca numeros fuera del rango
			else if (aleatorio<numUSU && (numUSU>=0 && numUSU<=100)) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más pequeño\nTe quedan: "+(oportunidades-contador)+" oportunidades");
			}
			//Si el usuario introduce un numero fuera del rango, mostrar este mensaje
			else
			{
				System.out.println("Te has pasado de rango");
			}
		}
		
		scannerUSU.close();
	}

}