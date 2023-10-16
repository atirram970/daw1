/**
 * 
 */


import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 	Pedir números al usuario hasta que el usuario introduzca un -1. Al terminar, 
			mostrará lo siguiente:
			 mayor número introducido
			 menor número introducido
			 suma de todos los números
			 media aritmética de todos los números
			El número -1 no contara como número
		 */
		int entradaUSU=0;
		int numMayor=0;
		int numMenor=0;
		int sumaTotal=0;
		int contador=0;
		
		while (entradaUSU!=-1) 
		{
			Scanner scannerUSU=new Scanner(System.in);
			System.out.println("Introduce un número(1-100): ");
			entradaUSU=scannerUSU.nextInt();
			if (entradaUSU>=entradaUSU) 
			{
				numMayor=entradaUSU;
			}
			else if (entradaUSU<=entradaUSU) 
			{
				numMenor=entradaUSU;
			}
			
			sumaTotal=sumaTotal+entradaUSU;
			contador=contador+1;
		}
		double mediaAritmetica=sumaTotal/contador;
		
		System.out.println("Mayor número introducido: "+numMayor);
		System.out.println("Menor número introducido: "+numMenor);
		System.out.println("Suma de todos los numeros: "+sumaTotal);
		System.out.println("Media aritmética de todos los números: "+mediaAritmetica);
	}

}