/**
 * 
 */
package Boletin7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejercicio5Array 
{
	public static void main(String[] args) 
	{
		//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
		//muestre por pantalla separados por espacios. El programa pedirá entonces por
		//teclado dos valores y a continuación cambiará todas las ocurrencias del primer
		//valor por el segundo en la lista generada anteriormente. Los números que se
		//han cambiado deben aparecer entrecomillados.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame la cantidad de numeros: ");
		int cantidad = scanner.nextInt();
		System.out.println("Dame el limite inferior: ");
		int limInf = scanner.nextInt();
		System.out.println("Dame el limite superior: ");
		int limSup = scanner.nextInt();
		
	    long[] numeros = new long[cantidad];

	    for (int i = 0; i < cantidad; i++) 
	    {
	    	int numAleatorio = (int) (Math.floor(Math.random() * (limSup - limInf + 1)) + limInf);
	    	numeros[i] = numAleatorio;
	        System.out.print(numeros[i] + " ");
	    }

	    System.out.println("\nIngresa el primer valor a cambiar:");
	    int valorAntiguo = scanner.nextInt();
	    System.out.println("Ingresa el segundo valor:");
	    int valorNuevo = scanner.nextInt();
	    
	    int contadorCambios = 0;
	    
	    for (int i = 0; i < 100; i++) 
	    {
	    	
	    	if (numeros[i] == valorAntiguo) 
	    	{
	    		numeros[i] = valorNuevo;
	    		contadorCambios++;
	    		System.out.print("'" + numeros[i] + "' ");
	    	}
	    	else 
	    	{
	    		System.out.print(numeros[i] + " ");
	    	}
	    	
	    }
	    System.out.printf("\nSe han cambiado " + contadorCambios + " numeros");
	}
}
