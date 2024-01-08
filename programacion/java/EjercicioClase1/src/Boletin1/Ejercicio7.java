/**
 * 
 */
package Boletin1;

import java.util.Scanner;

/**
 * 
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Solución A. Creando Variables internas
		double dolar=220;
		double euro=0.95;
		System.out.println(dolar+"$ equivalen a: "+dolar*euro+" € euros");
		
		//Solución B. Introduciendo los valores por teclado
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce el número de euros €: ");
		double euros=scanner.nextDouble();
		
		System.out.println("Introduce la diferencia de Euros € a dólares $: ");
		double dolares=scanner.nextDouble();
		System.out.println(dolar+"$ equivalen a: "+dolar*euro+" € euros");
		scanner.close();
	}

}
