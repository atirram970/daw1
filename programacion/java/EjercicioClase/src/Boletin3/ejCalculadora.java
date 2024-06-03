/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ejCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Ejercicio calculadora
		int OPC=0;
		double NUM1=0;
		double NUM2=0;
		boolean correcto=false;
		Scanner scannerOPC=new Scanner(System.in);
		Scanner scannerNUM1=new Scanner(System.in);
		Scanner scannerNUM2=new Scanner(System.in);
		
		do 
		{
			System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
			scannerOPC=new Scanner(System.in);
			System.out.println("Elige una opcion: ");
			
			
			
			
			if (OPC == (1|2|3|4))
			{
				correcto=true;
				
				scannerNUM1=new Scanner(System.in);
				System.out.println("Elige una opcion: ");
				NUM1=scannerNUM1.nextDouble();
				
				scannerNUM2=new Scanner(System.in);
				System.out.println("Elige una opcion: ");
				NUM2=scannerNUM2.nextDouble();
			}
			
		} 
		while (!correcto);
		switch (OPC) 
		{
			case 1: 
			{
				System.out.println("Has elegido sumar");
				double resultado=NUM1+NUM2;
				System.out.println("El resultado es: "+resultado);
				break;
			}
			case 2:
			{
				System.out.println("Has elegido restar");
				double resultado=NUM1-NUM2;
				System.out.println("El resultado es: "+resultado);
				break;
			}
			case 3:
			{
				System.out.println("Has elegido multiplicar");
				double resultado=NUM1*NUM2;
				System.out.println("El resultado es: "+resultado);
				break;
			}
			case 4:
			{
				System.out.println("Has elegido dividir");
				double resultado=NUM1/NUM2;
				System.out.println("El resultado es: "+resultado);
				break;
			}
		}
	
		scannerOPC.close();
		scannerNUM1.close();
		scannerNUM2.close();
	}

}