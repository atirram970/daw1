package com.adriantirado.tarea2;

import java.util.Scanner;

public class Ejercicio2 {

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
	
		int aleatorio = (int) (100*Math.random()+1);
		int numUSU=0;
		int oportunidades=5;
		
		Scanner scannerUSU = new Scanner(System.in); // create scanner object outside the loop
		
		for (int contador = 1; contador <= oportunidades; contador++) 
		{
			System.out.println("Introduce un número(1-100): ");
			numUSU=scannerUSU.nextInt();
			
			if (numUSU==aleatorio) 
			{
				System.out.println("Has acertado en el intento numero: "+contador);
				System.out.println("El número era: "+aleatorio);
				break; // exit the loop if the number is guessed correctly
			}
			else if (aleatorio>numUSU && (numUSU>=0 && numUSU<=100)) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más grande\nTe quedan: "+(oportunidades-contador)+" oportunidades");
			}
			else if (aleatorio<numUSU && (numUSU>=0 && numUSU<=100)) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más pequeño\nTe quedan: "+(oportunidades-contador)+" oportunidades");
			}
			else
			{
				System.out.println("Te has pasado de rango");
			}
		}
		
		scannerUSU.close();
	}

}