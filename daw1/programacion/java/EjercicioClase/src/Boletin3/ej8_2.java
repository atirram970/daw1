/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej8_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ordenar 2 numeros enteros
		Scanner scannerNUM1=new Scanner(System.in);
		System.out.println("Introduce  el 1er numero: ");
		int num1=scannerNUM1.nextInt();
		
		Scanner scannerNUM2=new Scanner(System.in);
		System.out.println("Introduce  el 2do numero: ");
		int num2=scannerNUM2.nextInt();
		
		//el 1 primero
		if (num1>=num2)
		{
			System.out.println(num1+","+num2);
		}
		else
		{
			System.out.println(num2+","+num1);
		}
	}
	

}