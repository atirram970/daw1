/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calcular tiempo de caida de objeto
		double g=9.81;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce la altura: ");
		double h=scanner.nextDouble();
		
		double formula=((2*h)/g);
		double tiempo=Math.round(Math.sqrt(formula));
		System.out.println("El tiempo que va a tardar en caer el objeto en caer\nCon una altura de : " + h +" metros \nCon un tiempo de: " + tiempo + " Segundos");
		scanner.close();
	}

}