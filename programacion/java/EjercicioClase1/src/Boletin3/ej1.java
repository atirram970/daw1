/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calcular salario semanal
		/*Declaracion de variables*/
		int euros=12;
		int eurosExtra=16;
		int salario;
		
		//creamos esto para que nos de el usuario la cantidad de horas
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el número de horas: ");
		int horas=scanner.nextInt();
		
		//calculamos el precio por hora
		if (horas<40) 
		{
			//precio de menos de 40 horas
			salario=horas*euros;
		}
		else
		{
			//precio de mas de 41 horas
			salario=(40*euros)+((horas-40)*eurosExtra);
			
		}
		System.out.println("Resultado:\nEl dinero por menos de 40h es de: " + euros + "€\nEl de por mas de la hora 41 es de: " + eurosExtra + "€\nEl total es de: " + salario + " €");
		
		
		scanner.close();
	}

}