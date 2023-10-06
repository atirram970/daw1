/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calcular segundos hasta media noche
		int Hmedianoche=24;
		int Mmedianoche=60;
		
		//pedir hora y minuto usuario
		Scanner scannerHora=new Scanner(System.in);
		System.out.println("Introduce la hora: ");
		int numHoras=scannerHora.nextInt();
		
		Scanner scannerMinuto=new Scanner(System.in);
		System.out.println("Introduce el minuto: ");
		int numMinutos=scannerMinuto.nextInt();
		
		//comprobacion errores
		if ((numHoras>24 || numHoras<0) || (numMinutos>60 || numMinutos<0))
		{
			System.out.println("Has introducido un valor incorrecto");
			System.exit(0);
		}
		
		//Y comprobar si es medianoche
		if (numHoras==24 && numMinutos==00)
		{
			System.out.println("Es medianoche");
			System.exit(0);
		}
			
		//restamos las horas
		int totalHoras=Hmedianoche-numHoras;
		int totalMinutos=Mmedianoche-numMinutos;
		totalHoras=totalHoras-1;


		//imprimir por terminal las horas que quedan hasta medianoche
		int totalSegundos=((totalHoras*3600)+(totalMinutos*60));
		
		System.out.println("Quedan: " + totalSegundos + " Segundos hasta medianoche");
		
		scannerHora.close();
		scannerMinuto.close();
	}

}