package com.adriantirado.tarea2;

import java.util.Scanner;

public class Ejercicio4 
{

	public static void main(String[] args) 
	{
		//declaro variables
		//entrada usuario
		int entradaUSU = 0;
		//variable para el numero más grande introducido
		int numMayor = 0;
		//variable para el numero más pequeño introducido
		int numMenor = 0;
		//variable para la suma de todas las variables
		int sumaTotal = 0;
		//contador para crear la media aritmetica
		int contador = 0;
		
		//pedir al uaurio cualquier numero
		Scanner scannerUSU = new Scanner(System.in);
		System.out.println("Introduce un número(con -1 se acaba): ");
		
		//mientras que el usuario no introduzca "-1" haz -->
		while (entradaUSU != -1) 
		{
			//coloco un if aqui para omitir el -1 que debe introducir el usuario para cortar el programa
			if (entradaUSU != -1) 
			{
				//recogida de los datos introducidos
				entradaUSU = scannerUSU.nextInt();
				
				//si la entrada del usuario es mayor a la variable guardada, se guarda
				if (entradaUSU >= numMayor) 
				{
					numMayor = entradaUSU;
				}
				//si la entrada del usuario es menor a la variable guardada, se guarda
				if (entradaUSU <= numMenor) 
				{
					numMenor = entradaUSU;
				}
				//variable para guardar una suma de todos los numeros introducidos
				sumaTotal += entradaUSU;
				//contador que se incrementa segun la cantidad de numeros
				contador++;
				
			}
		
		}
		//calculo de media aritmetica
		double mediaAritmetica = (double)sumaTotal / contador;
		
		//mostrar resultado
		System.out.println("Mayor número introducido: " + numMayor);
		System.out.println("Menor número introducido: " + numMenor);
		System.out.println("Suma de todos los numeros: " + sumaTotal);
		System.out.println("Media aritmética de todos los números: " + mediaAritmetica);
		
		scannerUSU.close();
	}

}
