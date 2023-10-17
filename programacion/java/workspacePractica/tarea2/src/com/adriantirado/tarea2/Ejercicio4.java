package com.adriantirado.tarea2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int entradaUSU = 0;
		int numMayor = 0;
		int numMenor = 0;
		int sumaTotal = 0;
		int contador = 0;
		
		Scanner scannerUSU = new Scanner(System.in);
		System.out.println("Introduce un número(con \"-1\" se acaba): ");
		
		while (entradaUSU != -1) 
		{
			entradaUSU = scannerUSU.nextInt();
			if (entradaUSU != -1) {
				if (entradaUSU >= numMayor) 
				{
					numMayor = entradaUSU;
				}
				if (entradaUSU <= numMenor) 
				{
					numMenor = entradaUSU;
				}
				
				sumaTotal += entradaUSU;
				contador++;
			}
			
		}
		
		double mediaAritmetica = (double)sumaTotal / contador;
		
		System.out.println("Mayor número introducido: " + numMayor);
		System.out.println("Menor número introducido: " + numMenor);
		System.out.println("Suma de todos los numeros: " + sumaTotal);
		System.out.println("Media aritmética de todos los números: " + mediaAritmetica);
		
		scannerUSU.close();
	}

}
