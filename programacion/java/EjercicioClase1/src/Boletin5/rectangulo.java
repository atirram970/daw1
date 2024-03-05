/**
 * 
 */
package Boletin5;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Scanner;

/**
 * 
 */
public class rectangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//rectangulo esquina inferior izquierda este 0,0
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el ancho del rectangulo :");
		int ancho = scan.nextInt();
		System.out.println("Introduce el alto del rectangulo :");
		int alto = scan.nextInt();
		
		Dimension dim = new Dimension (ancho, alto);
		Point punto = new Point();
		punto.y = alto;
		Rectangle rect = new Rectangle(punto, dim);
		
		System.out.println("La esquina superior izquierda del rectangulo esta situada en el punto: " + rect.x + " ," + rect.y);
	}

}
