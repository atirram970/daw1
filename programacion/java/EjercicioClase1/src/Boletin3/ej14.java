/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ej14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio ultima cifra
		Scanner scannerAltura=new Scanner(System.in);
		System.out.println("Introduzca la altura de la bandera en cm: ");
		int altura=scannerAltura.nextInt();
		
		Scanner scannerAnchura=new Scanner(System.in);
		System.out.println("Introduce la anchura: ");
		int anchura=scannerAnchura.nextInt();
		
		Scanner scannerBordado=new Scanner(System.in);
		System.out.println("¿Quiere escudo bordado? (s/n): ");
		String conEscudo=scannerBordado.next();
		
		System.out.println("Gracias. Aquí tiene el desglose de su compra.");
		
		int cent2=altura*anchura;
		double precioTamano;
		double precioEscudo;
		
		if (cent2>6000) 
		{
			precioTamano=cent2*0.012;
			System.out.println("Bandera de "+cent2+" cm2: "+precioTamano+ " €");
		}
		else
		{
			precioTamano=cent2*0.01;
			System.out.println("Bandera de "+cent2+" cm2: "+precioTamano+ " €");
		}
		if(conEscudo.equals("s"))
		{
			precioEscudo=2.5;
			System.out.println("Con escudo: 2,50 €");
		}
		else
		{
			precioEscudo=0;
			System.out.println("Sin esucudo: 0€");
		}
		
		double gastoEnvio=3.25;
		System.out.println("Gastos de envío: 3,25 €");
		
		double total=precioTamano+precioEscudo+gastoEnvio;
		System.out.println("Total: "+total+" €");
	}

}
