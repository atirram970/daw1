/**
 * 
 */
package Boletin3;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 
 */
public class ejMultiplos7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Mostrar pantalla multiplos 7
		//existen entre 2 numeros dados
		//Comprobar datos introducidos
		
		Scanner scannerNUM1=new Scanner(System.in);
		System.out.println("introduce el primer numero: ");
		int num1=scannerNUM1.nextInt();

		Scanner scannerNUM2=new Scanner(System.in);
		System.out.println("introduce el segundo numero: ");
		int num2=scannerNUM2.nextInt();
		String result="Los múltiplos de 7 entre "+num1+" y "+num2;
		String multiplos="";
		boolean existen=false;
		
		if (num1<0 || num2<0 || num1>num2)
		{
			//si minimo y maximo son mayores a 0 y que el minimo sea inferior al maximo
			System.out.println("Error, los num introducidos deben de ser mayor a cero \ny el primer numero ser inferior al segundo");
		}
		else
		{
			//correcto
			//si contador es minimo y contador es menor que el mayor (seq) y luego incrementa contador
			for (int contador=num1; contador<=num2 ;contador++) 
			{
				//si resto de contador equivale a 0
				if (contador%7==0)
				{
					multiplos+="\n"+contador;
					existen=true;
				}
				if(existen = false)
				{
					result="No existe ningún múltiplo de 7 entre "+num1+" y "+num2;
					System.out.println(result);
					System.exit(0);
				}
				
			}
			System.out.println(multiplos);
		}
		scannerNUM1.close();
		scannerNUM2.close();
	}

}
