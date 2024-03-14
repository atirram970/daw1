/**
 * 
 */
package Boletin7;

/**
 * 
 */
public class ejercicio2Arrays 
{
	public static void main(String[] args) 
	{
		//define 3 arrays de 20 numeros enteros, estos arrays van a ser número, cuadrado y cubo
		//carga array numero con num aleatorio entre 0 y 100
		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int i = 0; i < 20; i++) 
		{
			int numeroAleatorio = (int) (Math.random() * 101);
			numero[i] = numeroAleatorio;
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
		}
		
		System.out.println("Numero \tCuadrado \tCubo\n--------------------------------");
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println(numero[i] + "\t" + cuadrado[i] + "\t\t" + cubo[i]);
		}
	}
}
