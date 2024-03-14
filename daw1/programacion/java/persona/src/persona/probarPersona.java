package persona;

import java.util.Scanner;

public class probarPersona 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		String nombre = scan.next();
		System.out.println("Introduce tu edad: ");
		int edad = scan.nextInt();
		System.out.println("Introduce tu sexo: ");
		char sexo = scan.next().charAt(0);
		System.out.println("Introduce tu peso: ");
		float peso= scan.nextInt();
		System.out.println("Introduce tu altura: ");
		int altura = scan.nextInt();
	}

}
