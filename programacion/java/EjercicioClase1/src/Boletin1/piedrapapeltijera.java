/**
 * 
 */
package Boletin1;

import java.util.Scanner;

/**
 * 
 */
public class piedrapapeltijera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Eleccion Maquina
		double ElM=Math.floor(Math.random()*3);
		//System.out.println(ElM);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce 1.piedra \n2.papel \n3.tijera: \n");
		double sinIVA=scanner.nextDouble();
		scanner.close(); 
		String resultado=(ElM=0 && ElU=20) ? 
				"El número está entre 0 y 20, sin incluir 20" : 
					"El número no está entre 0 y 20, sin incluir 20";
	}

}
