/**
 * 
 */
package Boletin3;

import java.util.Scanner;

/**
 * 
 */
public class ej8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ordenar 3 numeros enteros
		Scanner scannerNUM1=new Scanner(System.in);
		System.out.println("Introduce  el 1er numero: ");
		int num1=scannerNUM1.nextInt();
		
		Scanner scannerNUM2=new Scanner(System.in);
		System.out.println("Introduce  el 2do numero: ");
		int num2=scannerNUM2.nextInt();
		
		Scanner scannerNUM3=new Scanner(System.in);
		System.out.println("Introduce  el 3er numero: ");
		int num3=scannerNUM3.nextInt();
		
		//el 1 primero
		if ((num1>=num2) && (num1>=num3))
		{
			//comprobar si son iguales
			if (num2==num3)
			{
				if (num1==num2)
				{
					System.out.println("Los 3 son iguales");
				}
				else
				{
					System.out.println(num1+","+num2+","+num2);
				}
				
			}
			
			//comprobar si uno es mayor que otro
			if (num2>num3)
			{
				System.out.println(num1+","+num2+","+num3);
			}
			else
			{
				System.out.println(num1+","+num3+","+num2);
			}
		}
		
		//el 2 primero
		if ((num2>=num1) && (num2>=num3))
		{
			//comprobar si son iguales
			if (num1==num3)
			{
				if (num2==num1)
				{
					System.out.println("Los 3 son iguales");
				}
				System.out.println(num2+","+num1+","+num1);
			}
			
			//comprobar si uno es mayor que otro
			if (num1>=num3)
			{
				System.out.println(num2+","+num1+","+num3);
			}
		}
		
		//el 3 primero
		if ((num3>num1) && (num3>num2))
		{
			//comprobar si son iguales
			if (num1==num2)
			{
				if(num3==num1)
				{
					System.out.println("Los 3 son iguales");
				}
				System.out.println(num3+","+num1+","+num1);
			}
			
			//comprobar si uno es mayor que otro
			if (num2>=num1)
			{
				System.out.println(num3+","+num2+","+num1);
			}
		}
		
	}
	

}