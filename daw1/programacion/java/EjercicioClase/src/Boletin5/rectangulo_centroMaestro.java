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
public class rectangulo_centroMaestro {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//rectangulo esquina inferior izquierda este 0,0
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce la coordenada x :");
		int x = scan.nextInt();
		System.out.println("Introduce la coordenada y:");
		int y = scan.nextInt();
		
		Dimension dim = new Dimension (ancho, alto);
		Point punto = new Point();
		double mitad_y = punto.y = alto/2;
		double mitad_x = punto.x = ancho/2;
		Rectangle rect = new Rectangle(punto, dim);
		
		System.out.println("La esquina superior izquierda del rectangulo esta situada en el punto: " + rect.x + " ," + rect.y);
	}

}
