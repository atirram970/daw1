/**
 * 
 */


import java.util.Scanner;

/**
 * 
 */
public class ej2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 	Construye un programa que simule el juego de la adivinanza de un número. El 
			ordenador debe generar un número aleatorio entre 1 y 100 y el usuario tiene 
			cinco oportunidades para acertarlo. Después de cada intento el programa debe 
			indicarle al usuario si el número introducido por él es mayor, menor o igual al 
			número a adivinar, y el número de intentos restantes.
			Nota: para generar el valor aleatorio puede emplearse la sentencia:
			int aleatorio = (int) (100*Math.random()+1);
		 */
		
		int aleatorio = (int) (100*Math.random()+1);
		int numUSU=0;
		
		for (int contador = 1; contador < args.length; contador++) 
		{
			Scanner scannerUSU=new Scanner(System.in);
			System.out.println("Introduce un número(1-100): ");
			numUSU=scannerUSU.nextInt();
			
			if (numUSU==aleatorio) 
			{
				System.out.println("Has acertado en el intento numero: "+contador);
				System.out.println("El número era: "+aleatorio);
			}
			else if (aleatorio>numUSU) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más grande");
			}
			else if (aleatorio<numUSU) 
			{
				System.out.println(contador+" intento.\nHas fallado, el número es más pequeño");
			}
			scannerUSU.close();
		}
	}

}