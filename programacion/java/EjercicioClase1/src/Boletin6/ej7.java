package Boletin6;


public class ej7 
{
	public static void main(String[] args) 
	{
		//Siguiente Primo
		long inicioPrimo = 14L;
		long sigPrimo = funcionesMatematicas.siguientePrimo(12345L);
		System.out.println("inicioPrimo: " + sigPrimo);
		System.out.println("sigPrimo: " + inicioPrimo);
		
		System.out.println("digitos: " + funcionesMatematicas.digitos(-11l));
		System.out.println("digitos: " + funcionesMatematicas.voltea(0l));
		
	}
}
